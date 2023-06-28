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

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;

public class HoustonEditCoin {
	
	public static WebDriver browser;
    private static RelativeXpath relativeXpath = new RelativeXpath();
    
    public HoustonEditCoin(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }
    
    public void userEditCoin() throws InterruptedException
    {
    	browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.searchCoinName.label))).sendKeys("TC2");
    	browser.findElement(By.className("ri-search-line")).click();
    	Thread.sleep(5000);
    	browser.findElement(By.className("ri-arrow-right-s-line")).click();
    	Thread.sleep(10000);
    }
    
    public void editCoinPage() throws InterruptedException
    {
    	Random rand = new Random();

    	int temp = rand.nextInt(10);
    	String randNum = Integer.toString(temp);
    	Thread.sleep(5000);
    	browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.decimalPrecisionInput.label))).clear();
    	browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.decimalPrecisionInput.label))).sendKeys(randNum);
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.updateButton.label))).click();
    	Thread.sleep(5000);
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.confirm.label))).click();
    	Thread.sleep(10000);
    }

}
