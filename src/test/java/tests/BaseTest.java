package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
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

    @BeforeTest(description = "start browser")
    public void SetUp (ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("---start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        context.setAttribute("driver", driver);


    }
    @AfterTest (alwaysRun = true, description = "close browser")
    public void tearDown(){
        driver.quit();
    }

}
