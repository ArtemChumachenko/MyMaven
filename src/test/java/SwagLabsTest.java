import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsTest {

    static {
        WebDriverManager.chromedriver ().setup ();
    }
    @Test
    public void testSwagLabs_LogIn()  {
        driver.get ("https://www.saucedemo.com");
        driver.findElement (By.id ("user-name")).sendKeys ("standard_user");
        driver.findElement (By.id ("password")).sendKeys ("secret_sauce");
        driver.findElement (By.id ("login-button")).click ();
        Assert.assertEquals (driver.getCurrentUrl (),"https://www.saucedemo.com/inventory.html");
    }
    @Test
    public void testAddToCart()  {
        driver.get ("https://www.saucedemo.com");
        driver.findElement (By.id ("user-name")).sendKeys ("standard_user");
        driver.findElement (By.id ("password")).sendKeys ("secret_sauce");
        driver.findElement (By.id ("login-button")).click ();
        driver.findElement (By.id ("add-to-cart-sauce-labs-backpack")).click ();
        Assert.assertEquals (driver
                        .findElement (By.xpath ("//*[@id=\"shopping_cart_container\"]/a/span"))
                        .getText (),"1");
    }
    @Test
    public void testRemoveButton() {
        driver.get ("https://www.saucedemo.com");
        driver.findElement (By.id ("user-name")).sendKeys ("standard_user");
        driver.findElement (By.id ("password")).sendKeys ("secret_sauce");
        driver.findElement (By.id ("login-button")).click ();
        driver.findElement (By.id ("add-to-cart-sauce-labs-backpack")).click ();
        Assert.assertEquals (driver
                .findElement (By.id ("remove-sauce-labs-backpack"))
                .getText (),"REMOVE");
    }
    @Test
    public void testCart() {
        driver.get ("https://www.saucedemo.com");
        driver.findElement (By.id ("user-name")).sendKeys ("standard_user");
        driver.findElement (By.id ("password")).sendKeys ("secret_sauce");
        driver.findElement (By.id ("login-button")).click ();
        driver.findElement (By.id ("add-to-cart-sauce-labs-backpack")).click ();
        driver.findElement (By.id ("shopping_cart_container")).click ();
        Assert.assertTrue (driver.findElement (By.id ("item_4_title_link")).isDisplayed ());



    }
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit ();
    }
}
