package setups;

import org.openqa.selenium.WebDriver;

public class BrowserPool {
    private static WebDriver browserInstance;

    public static WebDriver getBrowserInstance() {
        return browserInstance;
    }

    public static void setBrowserInstance(WebDriver browserInstance) {
        BrowserPool.browserInstance = browserInstance;
    }
}
