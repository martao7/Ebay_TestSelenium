package Testerski;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class TestEbay {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do strony
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void testSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("_nkw"));
        // Wyczyść tekst zapisany w elemencie
        element.click();

        // Wpisz informacje do wyszukania
        element.sendKeys("delonghi espresso machine");

        // Prześlij formularz
        element.submit();


    }
    @After
    public void tearDown() throws Exception {

        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[2]/div/a/div/div/div/span[1]/span"));

        element1.click();

        //driver.quit();
    }

}
