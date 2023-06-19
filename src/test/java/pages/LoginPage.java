package pages;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//img[@alt='Facebook']")
    private WebElement logo;

    public static WebDriver browser;

    public LoginPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public void assertLogo(){
        logo.isDisplayed();
    }
}
