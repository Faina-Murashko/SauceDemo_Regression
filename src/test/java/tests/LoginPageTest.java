package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.Retry;
import utils.AllureUtils;

public class LoginPageTest extends BaseTest {

    @DataProvider(name = "LoginData")
    public Object[][] LoginData() {
        return new Object[][]{
                {"","secret_sauce", "Epic sadface: Username is required"},
                {"standard_user","", "Epic sadface: Password is required"},
                {"", "", "Epic sadface: Username is required"},
                {"locked_out_user","secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
        };
    }



    @Test (description = "Conformity check")
    public void validUserAndPassword() {
        loginPage.loginToTheSystem();
        Assert.assertEquals(inventoryPage.getTitleText(), "PRODUCTS", "Тайтл не соответствует ожидаемому");

    }

    @Test (description = "Successful login")
    public void negativeLoginTest(String UserName, String password, String errorMassage){
        loginPage.openLoginPage();
        loginPage.login(UserName,password);
        Assert.assertEquals(loginPage.getErrorMassage(),
                errorMassage,
                "Error Massage is invalid");
    }


    @Test(description = "Password should be required")
    public void noPassword(){
        loginPage.openLoginPage();
        loginPage.login("standard_user","");
        Assert.assertEquals(loginPage.getErrorMassage(),
                "Epic sadface: Password is required",
                "Error Massage is invalid");
        AllureUtils.takeScreenshot(driver);

    }

    @Test(description = "User name and password should be reguired")
    public void noEverything(){
        loginPage.openLoginPage();
        loginPage.login("","");
        Assert.assertEquals(loginPage.getErrorMassage(),
                "Epic sadface: Username is required",
                "Error Massage is invalid");
    }

    @Test(description = "user should be blocked")
    public void lockedUser(){
        loginPage.openLoginPage();
        loginPage.login("locked_out_user","secret_sauce");
        Assert.assertEquals(loginPage.getErrorMassage(),
                "Epic sadface: Sorry, this user has been locked out.",
                "User is not blocked");
    }


}
