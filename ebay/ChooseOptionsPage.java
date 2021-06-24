package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseOptionsPage {

    public WebDriver driver;

    public ChooseOptionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "fake-tabs__item btn")
    private WebElement buyItNowOption;


    @FindBy(className = "checkbox__control")
    private WebElement conditionNewCheck;


    public void SetOptionToChoose() {
        buyItNowOption.click();

        if (!conditionNewCheck.isSelected())
            conditionNewCheck.click();
    }
}

