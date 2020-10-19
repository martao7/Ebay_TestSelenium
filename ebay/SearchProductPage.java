package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
    public WebDriver driver;

    public SearchProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "_nkw")
    private WebElement searchWindow;

    @FindBy(id = "gdpr-banner-accept")
    private WebElement acceptButton;


    public void setSearchWindow(String sendKeys) {
        acceptButton.click();

        searchWindow.click();
        searchWindow.clear();
        searchWindow.sendKeys("delonghi espresso machine");
        searchWindow.submit();
    }
}
