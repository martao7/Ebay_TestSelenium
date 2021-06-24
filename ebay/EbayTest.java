package ebay;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class EbayTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        //czekaj zanim rzucisz wyjatkiem (bo nie mozesz znalezc elementu, bo element zniknal)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Test
    public void Test() {
        
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.SetSearchWindow("delonghi espresso machine");

        //czekaj zanim rzucisz wyjatkiem
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            
        ChooseOptionsPage chooseOptionsPage = new ChooseOptionsPage(driver);
        chooseOptionsPage.SetOptionToChoose();

    }
    @After
    public void tearDown() {
        driver.quit();

    }
}

