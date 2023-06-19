package steps;

import static setups.BrowserPool.getBrowserInstance;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginStep {
	LoginPage loginPage = new LoginPage(getBrowserInstance());

	  @Given("^I want to login to facebook$")
	  public void userOpenFacebookWeb() {
	    getBrowserInstance().navigate().to("https://www.facebook.com/");
	  }
	  
	  @And("^I want to make sure the logo is facebook$")
	  public void confirmLogo() {
		  loginPage.assertLogo();
	  }
	  
//	  @When("^I put in email$")
//	  public void addEmail() {
//		  //loginPage.insertText();
//	  }

	  

}
