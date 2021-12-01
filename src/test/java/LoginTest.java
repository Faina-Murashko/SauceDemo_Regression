import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {
    @Test
    public void loginTesting (){
        driver.get("https://www.saucedemo.com/");
        WebElement inputUserName = driver.findElement(By.name("user-name"));
        inputUserName.sendKeys("standard_user");
        WebElement inputUserPassword = driver.findElement(By.id("password"));
        inputUserPassword.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        driver.findElement(By.id("item_4_title_link")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.navigate().back();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("inventory_item_price"));
        assertEquals(29.99, 29.99);
        driver.navigate().back();

        driver.findElement(By.id("item_2_title_link")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("inventory_item_price"));
        assertEquals(29.99,29.99);
        assertEquals(7.99, 7.99);
        driver.findElement(By.id("checkout")).click();





    }
}
