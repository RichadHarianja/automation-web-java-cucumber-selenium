package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignUpWebPage;

import static setups.BrowserPool.getBrowserInstance;

public class SignUpStep {
  SignUpWebPage signUpWebPage = new SignUpWebPage(getBrowserInstance());

  @Then("^user click SignUp menu$")
  public void clickMenuSignUp() throws InterruptedException {
    signUpWebPage.clickMenuSignUp();
  }

  @When("^user click RegisterWithEmail$")
  public void clickButtonRegister() throws InterruptedException {
    signUpWebPage.clickButtonRegister();
  }

  @Then("^user want to input name \"([^\"]*)\"$")
  public void inputNameField(String name) {
    signUpWebPage.inputNameField(name);
  }

  @Then("^user input email \"([^\"]*)\"$")
  public void inputEmailField(String email) {
    signUpWebPage.inputEmailField(email);
  }

  @Then("^user input username \"([^\"]*)\"$")
  public void inputUsernameField(String username) {
    signUpWebPage.inputUsernameField(username);
  }

  @Then("^user input password \"([^\"]*)\"$")
  public void inputPasswordField(String password) {
    signUpWebPage.inputPasswordField(password);
  }

  @Then("^user input confirmPassword \"([^\"]*)\"$")
  public void inputConfirmPassField(String confirmPass) {
    signUpWebPage.inputConfirmPassField(confirmPass);
  }

  @And("^user assert the error message in web$")
  public void assertErrorMessage() throws InterruptedException {
    signUpWebPage.assertErrorMessage();
  }
}
