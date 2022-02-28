package helpers;

import cucumber.api.Scenario;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static setups.BrowserPool.getBrowserInstance;

public class ScreenAction {
    @AfterStep
    public void screenShot(Scenario scenario){
        TakesScreenshot take = (TakesScreenshot) getBrowserInstance();
        byte[] tempImg = take.getScreenshotAs(OutputType.BYTES);
        scenario.embed(tempImg, "image/png");
    }
}
