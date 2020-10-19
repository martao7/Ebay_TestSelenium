package ebay;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


@RunWith(Cucumber.class)
@CucumberOptions (features = "src/Cucumber/Features/",
        plugin = {"pretty","html:out"})

public class EbayTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        //czekaj zanim rzucisz wyjatkiem (bo nie mozesz znalezc elementu, bo element zniknal)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void Test() {
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.setSearchWindow("delonghi espresso machine");

        //czekaj zanim rzucisz wyjatkiem
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            
        ChooseOptionsPage chooseOptionsPage = new ChooseOptionsPage(driver);
        chooseOptionsPage.setOptionToChoose();


        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //sprawdzenie poprawnosci adresu
        //Assert.assertEquals(expectedText, actualText);
    }
    @After
    public void tearDown() {

    }
}

