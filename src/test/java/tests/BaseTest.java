package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.CartPage;
import page.InventoryPage;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    CartPage cartPage;
    InventoryPage inventoryPage;
    LoginPage loginPage;
    WebDriver driver;

    @BeforeTest
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("---start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);


    }
    @AfterTest (alwaysRun = true, description = "clode browser")
    public void tearDown(){
        driver.quit();
    }

}
