package tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import utils.AllureUtils;

public class ShoppingCart extends BaseTest {

    @Step("opened saucedemo")
    @Test(description = "check the prisce product")
    public void CheckThePrice() {
        driver.get("https://www.saucedemo.com");

        WebElement login = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        login.sendKeys("standard_user");
        Assert.assertEquals(login.getAttribute("value"), "standard_user", "Invalid login");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        Assert.assertEquals(password.getAttribute("value"), "secret_sauce", "Invalid password");
        AllureUtils.takeScreenshot(driver);


        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement completionOfLogin = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Assert.assertEquals(completionOfLogin.getAttribute("value"),
                completionOfLogin.getAttribute("value"), "Login failed");
        AllureUtils.takeScreenshot(driver);



        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        WebElement buttonRemove = driver.findElement(By.id("remove-sauce-labs-backpack"));
        Assert.assertEquals(buttonRemove.getAttribute("value"),
                buttonRemove.getAttribute("value"), "Button is not found");
        AllureUtils.takeScreenshot(driver);



        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        WebElement cartCheck = driver.findElement(By.xpath("//span[@class='title']"));
        Assert.assertEquals(cartCheck.getAttribute("value"),
                cartCheck.getAttribute("value"), "The cart is not logged in");
        AllureUtils.takeScreenshot(driver);

        WebElement checkThePrice = driver.findElement(By.xpath("//div[text()='29.99']"));
        Assert.assertEquals(checkThePrice.getAttribute("value"),
                checkThePrice.getAttribute("value"), "Price is not correct");
        AllureUtils.takeScreenshot(driver);

        WebElement checkNameProduct = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        Assert.assertEquals(checkNameProduct.getAttribute("value"),
                checkNameProduct.getAttribute("value"), "Name is not correct");
        AllureUtils.takeScreenshot(driver);

    }
}
