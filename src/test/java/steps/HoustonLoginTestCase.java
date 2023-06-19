package steps;

import static setups.BrowserPool.getBrowserInstance;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
import io.cucumber.java.en.*;
import pages.HoustonLogin;

public class HoustonLoginTestCase {
	
	HoustonLogin loginPage = new HoustonLogin(getBrowserInstance());

	@Given("^user login in Houston Page$")
	public void userOpenNobiLogin() {
	  getBrowserInstance().navigate().to("http://dev-houston.honestmining.org/login");
	  loginPage.setEmail();
	  loginPage.setPassword();
	  loginPage.clickSubmit();
	}

}
