package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.OpenWebPage;

import static setups.BrowserPool.getBrowserInstance;

public class OpenWebStep {
    OpenWebPage openWebPage = new OpenWebPage(getBrowserInstance());


    @Given("^User open google web$")
    public void userOpenGoogleWeb() {
        getBrowserInstance().navigate().to("https://tanihub.com/");
    }

    @Then("^User want to check the logo web")
    public void checkLogo() throws Throwable{
        openWebPage.logo();
    }
}
