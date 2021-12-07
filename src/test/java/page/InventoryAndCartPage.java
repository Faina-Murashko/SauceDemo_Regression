package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryAndCartPage {
    WebDriver driver;
    public static final By CHOISE_FIRST_PRODUCT = By.id("item_4_title_link");
    public static final By ADD_TO_CART_FIRST = By.id("add-to-cart-sauce-labs-backpack");
    public static final By SHOPPING_CART_FIRST_PRODUCT = By.className("shopping_cart_link");
    public static final By CONTINUE_SHOPPING = By.id("continue-shopping");
//    public static final By BACK_TO_PRODUCTS = By.id("back-to-products");
    public static final By CHOISE_NEXT_PRODUCT = By.id("item_2_title_link");
    public static final By ADD_TO_CART_NEXT = By.id("add-to-cart-sauce-labs-onesie");
    public static final By SHOPPING_CART_NEXT_PRODUCT = By.className("shopping_cart_link");

    public InventoryAndCartPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    public void firstProduct(){
        driver.findElement(CHOISE_FIRST_PRODUCT).click();
    }

    public void addToCartFirst(){
        driver.findElement(ADD_TO_CART_FIRST).click();
    }

    public void shoppingCartFirstProduct(){
        driver.findElement(SHOPPING_CART_FIRST_PRODUCT).click();
    }

    public void nextProduct(){
        driver.findElement(CHOISE_NEXT_PRODUCT).click();
    }

    public void addToCartNext(){
        driver.findElement(ADD_TO_CART_NEXT).click();
    }

    public void shoppingCartNextProduct(){
        driver.findElement(SHOPPING_CART_NEXT_PRODUCT).click();
    }

 //   public void backToProducts(){
 //       driver.findElement(BACK_TO_PRODUCTS).click();
 //   }

    public void continueShopping(){
        driver.findElement(CONTINUE_SHOPPING).click();
    }

}
