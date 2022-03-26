package pages;

import org.awaitility.Awaitility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SignUpWebPage {
  @FindBy(xpath = ".//*[contains(text(), 'Sign Up')]")
  private WebElement clickMenuSignUp;

  @FindBy(xpath = ".//*[contains(text(), 'Register with Email')]")
  private WebElement buttonRegister;

  @FindBy(xpath = ".//*[contains(@id, 'input-1')]")
  private WebElement nameField;

  @FindBy(xpath = ".//*[contains(@id, 'input-2')]")
  private WebElement emailField;

  @FindBy(xpath = ".//*[contains(@id, 'input-3')]")
  private WebElement usernameField;

  @FindBy(xpath = ".//*[contains(@id, 'input-4')]")
  private WebElement passwordField;

  @FindBy(xpath = ".//*[contains(@id, 'input-5')]")
  private WebElement confirmPasswordField;

  @FindBy(xpath = ".//*[contains(@value, 'Register')]")
  private WebElement clickRegister;

  @FindBy(xpath = ".//*[contains(text(), 'Format email salah')]")
  private WebElement spanErrorEmail;

  @FindBy(xpath = ".//*[contains(text(), 'username tidak tersedia')]")
  private WebElement spanErrorUsername;

  @FindBy(xpath = ".//*[contains(@value, 'Send Verification Code')]")
  private WebElement buttonVerificationCode;


  public static WebDriver browser;

  public SignUpWebPage(WebDriver browser) {
    this.browser = browser;
    PageFactory.initElements(browser, this);
  }

  public void clickMenuSignUp() throws InterruptedException {
    clickMenuSignUp.click();
    TimeUnit.SECONDS.sleep(3);
  }

  public void clickButtonRegister() throws InterruptedException {
    buttonRegister.click();
    TimeUnit.SECONDS.sleep(3);
  }

  public void inputNameField(String name) {
    nameField.sendKeys(name);
    Awaitility.await().atMost(5, TimeUnit.SECONDS);
  }

  public void inputEmailField(String email) {
    emailField.sendKeys(email);
    Awaitility.await().atMost(5, TimeUnit.SECONDS);
  }

  public void inputUsernameField(String username) {
    usernameField.sendKeys(username);
    Awaitility.await().atMost(5, TimeUnit.SECONDS);
  }

  public void inputPasswordField(String password) {
    passwordField.sendKeys(password);
    Awaitility.await().atMost(5, TimeUnit.SECONDS);
  }

  public void inputConfirmPassField(String confirmPassword) {
    confirmPasswordField.sendKeys(confirmPassword);
    Awaitility.await().atMost(5, TimeUnit.SECONDS);
  }

  public void assertErrorMessage(){
    try {
      TimeUnit.SECONDS.sleep(5);
      clickRegister.click();
      Assert.assertNotEquals(spanErrorEmail.getText(), null);
      Assert.assertNotEquals(spanErrorUsername.getText(), null);
      TimeUnit.SECONDS.sleep(5);
    } catch (Exception e) {
      e.getMessage();
      System.out.println("The Element is not fuound");
      buttonVerificationCode.isDisplayed();
    }

  }
}
