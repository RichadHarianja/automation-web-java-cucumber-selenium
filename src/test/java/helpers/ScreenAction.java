package helpers;

import io.cucumber.java.Scenario;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static setups.BrowserPool.getBrowserInstance;

public class ScreenAction {
    @AfterStep
    public void screenShot(Scenario scenario){
        TakesScreenshot take = (TakesScreenshot) getBrowserInstance();
        byte[] tempImg = take.getScreenshotAs(OutputType.BYTES);
        scenario.attach(tempImg, "image/png", "image");
    }
}
