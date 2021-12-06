package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public static final By USERNAME_INPUT = By.name("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.name("login-button");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    //public static final By ERROR_MASSAGE = By.name("user-name");

    public void login(String userName, String password){
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }


}
