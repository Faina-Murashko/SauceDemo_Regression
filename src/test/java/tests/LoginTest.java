package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTesting (){
        String userNameInput = "user-name";
        String passwordInput = "password";
        String loginButton = "login-button";

        /*driver.get("https://www.saucedemo.com/");
        WebElement inputUserName = driver.findElement(By.name("user-name"));
        inputUserName.sendKeys("standard_user");
        WebElement inputUserPassword = driver.findElement(By.id("password"));
        inputUserPassword.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();*/

    }

    public void userNameVariable () throws InterruptedException {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        Thread.sleep(2000);
    }
}
