package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.OpenWebPage;

import static setups.BrowserPool.getBrowserInstance;

public class OpenWebStep {
  OpenWebPage openWebPage = new OpenWebPage(getBrowserInstance());

  @Given("^user open google web$")
  public void userOpenGoogleWeb() {
    getBrowserInstance().navigate().to("https://stockbit.com/");
  }

  @Then("^user want to check the web$")
  public void userCheckLogo(){
    openWebPage.assertLogo();
  }


}
