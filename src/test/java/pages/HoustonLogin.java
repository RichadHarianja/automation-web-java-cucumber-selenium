package pages;

import static org.junit.Assert.assertNotNull;

import dto.RelativeXpath;
import dto.ValueAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HoustonLogin {
	
	public static WebDriver browser;
    private static RelativeXpath relativeXpath = new RelativeXpath();
	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement submitButton;
	
    public HoustonLogin(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
   }
    
    
    public void setEmail()
    {
        WebDriverWait wait = new WebDriverWait(browser,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.email.label))));
        browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.email.label))).sendKeys("Test");
    }
    
    public void setPassword()
    {
        browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.password.label))).sendKeys("Test");
    }
    
    public void clickSubmit()
    {
    	submitButton.click();
    }
}
