package steps;

import static setups.BrowserPool.getBrowserInstance;

import io.cucumber.java.en.*;
import pages.HoustonLogin;

public class HoustonLoginTestCase {
	
	HoustonLogin loginPage = new HoustonLogin(getBrowserInstance());

	@Given("^user login in Houston Page$")
	public void userOpenNobiLogin() throws InterruptedException {
	  getBrowserInstance().navigate().to("http://dev-houston.honestmining.org/login");
	  loginPage.setEmail();
	  loginPage.setPassword();
	  loginPage.clickSubmit();
	}
	
	@When("^user click coin in Setting menu$")
	public void navigateToCoinMenu() {
		loginPage.scrollDown();
		loginPage.clickCoin();
	}
	
	@And("^validate table, button, field, listing coin$")
	public void validateCoinMenu() throws InterruptedException
	{
		loginPage.checkElements();
	}

}
