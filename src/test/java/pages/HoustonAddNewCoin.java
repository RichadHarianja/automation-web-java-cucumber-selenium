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

public class HoustonAddNewCoin {
	
	public static WebDriver browser;
    private static RelativeXpath relativeXpath = new RelativeXpath();
    
    public HoustonAddNewCoin(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
   }
    
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[1]/div/div/div/div[3]/div/div/label/span")
	private WebElement activeButton;
    
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[6]/div/div/div/div[3]/div/div/label/span")
	private WebElement useMemoButton;
    
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[7]/div/div/div/div[3]/div/div/label/span")
	private WebElement hideDepositButton;
    
    
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div/main/div/div/div[2]/div/div/div/form/div[4]/div/div/div/div[3]/div/div/div/select")
    private WebElement featureLevelDropdown;
    
    
    public void clickAddCoin()
    {
    	browser.findElement(By.xpath(relativeXpath.xpathByDivContainsText(ValueAttribute.divAddCoin.label))).click();
    }
    
    public void validateItems()
    {
    	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	browser.findElement(By.xpath(relativeXpath.xpathByDivContainsText(ValueAttribute.divTextByActive.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByName.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByTicker.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByFeatureLevel.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByDecimalPrecision.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByUseMemo.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByHideDeposit.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByCoinImage.label))).isDisplayed();
    	activeButton.isDisplayed();
    	useMemoButton.isDisplayed();
    	hideDepositButton.isDisplayed();
    }
    
    public void validateButton()
    {
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.submit.label))).isDisplayed();
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.cancel.label))).isDisplayed();
    }
    
    public void fillField() throws AWTException, InterruptedException {
    	int FEATURE_LEVEL_DROPDOWN = 10;
    	Random rand = new Random();
    	String coinName = "COIN-TEST" + rand.nextInt();
    	int randDropdown = rand.nextInt(FEATURE_LEVEL_DROPDOWN);
		Robot robotKeyboard = new Robot();

		WebElement dropdownFeatureLevel = browser.findElement(By.xpath("//select"));

		browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.inputCoinName.label))).sendKeys(coinName);
		browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.inputTicker.label))).sendKeys(coinName);
		dropdownFeatureLevel.click();
		for (int i = 0; i<= randDropdown ; i++){
			robotKeyboard.keyPress(KeyEvent.VK_DOWN);
		}
		robotKeyboard.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(30000);

		/* Other Method That Can Be Used
		JavascriptExecutor js = (JavascriptExecutor) browser;
		js.executeScript("arguments[0].value='"+randDropdown+"'", dropdownFeatureLevel);
		*/
	}

}
