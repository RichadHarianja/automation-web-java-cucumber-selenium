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

public class HoustonAddNewCoin {
	
	public static WebDriver browser;
    private static RelativeXpath relativeXpath = new RelativeXpath();
    
    public HoustonAddNewCoin(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
   }
    
    public void clickAddCoin()
    {
    	browser.findElement(By.xpath(relativeXpath.xpathByDivContainsText(ValueAttribute.divAddCoin.label))).click();
    }
    
    public void validateItems()
    {
    	// validate items here
    }

}
