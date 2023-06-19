package pages;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HoustonLogin {
	
	public static WebDriver browser;
	
	String ph = "";
	
	@FindBy(xpath = "//input[@placeholder="+ph+"]")
	private WebElement placeHolder;
	
	@FindBy(xpath = "//div[text()='Submit']")
	private WebElement submitButton;
	
    public HoustonLogin(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }
    
    
    public void setEmail()
    {
    	placeholder = "Email";
    	System.out.println(placeHolder);
    	//placeHolder.sendKeys("michael@usenobi.com");
    }
    
    public void setPassword()
    {
    	placeholder = "Password";
    	System.out.println(placeHolder);
    	//placeHolder.sendKeys("1nkqcSJU");
    }
    
    public void clickSubmit()
    {
    	//submitButton.click();
    }
}
