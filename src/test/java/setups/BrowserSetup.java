package setups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSetup extends BrowserPool {
    ChromeDriver browser;

    protected void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        browser = new ChromeDriver(options);
        browser.manage().window().maximize();
        setBrowserInstance(browser);
    }

    protected void stopBrowser(){
        browser.close();
    }
}
