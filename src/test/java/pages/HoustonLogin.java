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
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;


public class HoustonLogin {
	
	public static WebDriver browser;
    private static RelativeXpath relativeXpath = new RelativeXpath();
	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//a[@href='/setting/coin']")
	private WebElement coinButton;
	
	
    public HoustonLogin(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
   }
    
    
    public void setEmail()
    {
        WebDriverWait wait = new WebDriverWait(browser,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.email.label))));
        browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.email.label))).sendKeys("michael@usenobi.com");
    }
    
    public void setPassword()
    {
        browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.password.label))).sendKeys("1nkqcSJU");
    }
    
    public void clickSubmit()
    {
    	submitButton.click();
    }
    
    public void scrollDown()
    {
    	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	WebElement l = browser.findElement(By.xpath("//a[@href='/setting/coin']"));
        // Javascript executor
        ((JavascriptExecutor)browser).executeScript("arguments[0].scrollIntoView(true);", l);

    	
    }
    
    public void clickCoin()
    {
    	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	coinButton.click();
    }
    
    public void checkElements()
    {
    	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByName.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByTicker.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByFeatureLevel.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByStatus.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByDetail.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDivContainsText(ValueAttribute.divAddCoin.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.searchCoin.label))).isDisplayed();
    }
}
