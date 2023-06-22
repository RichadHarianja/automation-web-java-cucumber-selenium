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
    
    @FindBy(xpath = "//select[@class='form-control form-control-sm']")
    private WebElement featureLevelDropdown;
    
    
    
    public void clickAddCoin()
    {
    	browser.findElement(By.xpath(relativeXpath.xpathByDivContainsText(ValueAttribute.divAddCoin.label))).click();
    }
    
    public void validateItems()
    {
    	browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	browser.findElement(By.xpath(relativeXpath.xpathByDiv(ValueAttribute.divTextByActive.label))).isDisplayed();
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
    
    public void fillField()
    {
    	

    	int FEATURE_LEVEL_DROPDOWN = 10;

    	Random rand = new Random();
    	
    	String coinName = "COIN-TEST" + rand.nextInt();

    	int randDropdown = rand.nextInt(FEATURE_LEVEL_DROPDOWN);
    	
    	Select s = new Select(browser.findElement(By.xpath("//option[@value='"+randDropdown+"']")));
    	
    	browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.inputCoinName.label))).sendKeys(coinName);
    	
    	browser.findElement(By.xpath(relativeXpath.xpathByPlaceholder(ValueAttribute.inputTicker.label))).sendKeys(coinName);
    	
    	s.selectByIndex(randDropdown);
    }

}
