package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class OpenWebPage {
    @FindBy(xpath = ".//*[contains(@id, 'landing-logo')]")
    private WebElement logo;

    public static WebDriver browser;

    public OpenWebPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public void assertLogo(){
        String title = logo.getText();
        assertNotNull(title);
    }
}
