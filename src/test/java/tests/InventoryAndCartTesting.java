package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static okhttp3.internal.Util.equal;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InventoryAndCartTesting extends BaseTest {
    @Test
    public void variableInventoryAndCart() throws InterruptedException {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        inventoryAndCartPage.firstProduct();
        inventoryAndCartPage.addToCartFirst();
        inventoryAndCartPage.shoppingCartFirstProduct();
        inventoryAndCartPage.continueShopping();
 //       inventoryAndCartPage.backToProducts();
        inventoryAndCartPage.nextProduct();
        inventoryAndCartPage.addToCartNext();
        inventoryAndCartPage.shoppingCartNextProduct();
        inventoryAndCartPage.continueShopping();
  //      inventoryAndCartPage.backToProducts();
        Thread.sleep(2000);




    /*driver.findElement(By.id("item_4_title_link")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.navigate().back();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("inventory_item_price"));
        Assert.assertEquals(29.99, "price verifi");
        driver.navigate().back();

        /*driver.findElement(By.id("item_2_title_link")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("inventory_item_price"));
        assertTrue(7.99);
        driver.findElement(By.id("checkout")).click();*/
}



    }

