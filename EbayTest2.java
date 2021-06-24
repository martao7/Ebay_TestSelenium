package ebay2;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class EbayTest2 {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

    }

    @Test
    public void Test() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        EbayPage2 ebayPage2 = new EbayPage2(driver);

    }

    @After
    public void tearDown() {
        //driver.quit();

    }
}

