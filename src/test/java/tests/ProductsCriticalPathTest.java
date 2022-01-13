package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.AllureUtils;

public class ProductsCriticalPathTest extends BaseTest {

    @Test(description = "product addition and remove")
    public void productIntoCartAndRemove(){
        loginPage.loginToTheSystem();
        inventoryPage.addToCart("Sauce Labs Onesie");
        Assert.assertEquals(inventoryPage.getRemoveButtonText(),"REMOVE","The button is not found");
        AllureUtils.takeScreenshot(driver);

        inventoryPage.removeFromCart("Sauce Labs Onesie");
        Assert.assertEquals(inventoryPage.getAddButtonText(),"ADD TO CART","The button is not found");
//        Assert.assertEquals();
//        cartPage.
    }
}
