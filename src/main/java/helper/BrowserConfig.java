package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserConfig {
    public enum BrowserType{
        safari,chrome
    }
    public static WebDriver getDriver(BrowserType browser, boolean isHeadless){
        switch (browser){
            case safari:
                WebDriverManager.safaridriver().setup();
                if(isHeadless){
                    throw new UnsupportedOperationException("Safari does not support headless mode.");
                }
                return new SafariDriver();
            case chrome:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if(isHeadless){
                    chromeOptions.addArguments("--headless=new");
                    chromeOptions.addArguments("--window-size=1920,1080");
                }
                return new ChromeDriver(chromeOptions);
            default:
                throw new IllegalArgumentException("browser is not supported" + browser);
        }
    }
}
