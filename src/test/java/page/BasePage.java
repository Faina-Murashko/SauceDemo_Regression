package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;
    LoginPage loginPage;
    CartPage cartPage;
    InventoryPage inventoryPage;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText() {
        return driver.findElement(By.cssSelector(".title")).getText();
    }
    @Step("Remove to labs")
    public String getRemoveButtonText() {
        return driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-onesie']")).getText();
    }
    @Step("Remove to labs")
    public String getAddButtonText() {
        return driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-onesie']")).getText();
    }
}

