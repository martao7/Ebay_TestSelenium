package ebay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage2 {

    public WebDriver driver;

    public EbayPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text() = 'Accept']")
    private WebElement acceptButton;


    @FindBy(xpath = "//input[@placeholder = 'Search for anything']")
    private WebElement searchWindow;



    public void clickAcceptButton()
    {
        acceptButton.isDisplayed();
        acceptButton.click();
    }


    public void setSearchWindow() {

        searchWindow.click();
        searchWindow.clear();
        searchWindow.sendKeys("adidas women");
        searchWindow.submit();
    }

}
