package tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import utils.AllureUtils;

public class CartTest extends BaseTest {

    @Step("login to the system")
    @Test
    public void entryToCart(){

        loginPage.loginToTheSystem();
        cartPage.openCart();
        Assert.assertEquals(cartPage.getTitleText(),"YOUR CART", "Title is not as expected");
        AllureUtils.takeScreenshot(driver);

    }


}
