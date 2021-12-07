package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.InventoryAndCartPage;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
        WebDriver driver;
        LoginPage loginPage;
        InventoryAndCartPage inventoryAndCartPage;


    @BeforeTest
        public void SetUp(){
            System.setProperty("webdriver.chrome.driver" , "src/test/resources/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            loginPage = new LoginPage(driver);
            inventoryAndCartPage = new InventoryAndCartPage(driver);



        }


        @AfterTest
        public void tearDown() {
            driver.quit();
        }

        }


