package ebay;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EbayStepdefs {
    public WebDriver driver;

    @Given("^an open browser ebay\\.com$")
    public void anOpenBrowserEbayCom() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @When("^he gives a name of product$")
    public void heGivesANameOfProduct() {

        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.setSearchWindow("delonghi espresso machine");
    }

    @And("^he chooses an option \"([^\"]*)\", \"([^\"]*)\"$")
    public void heChoosesAnOptionAnd(String arg0, String arg1)  {
        
        ChooseOptionsPage chooseOptionsPage = new ChooseOptionsPage(driver);
        chooseOptionsPage.setOptionToChoose();
    }

   @Then("^user sees all the products in this category$")
    public void userSeesAllTheProductsInThisCategory() {
    }
}
