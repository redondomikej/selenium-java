package PageRunner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfig {
    public enum BrowserType{
        CHROME
    }
    public static WebDriver getDriver(BrowserType browser , boolean isHeadless){
        switch (browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                if(isHeadless){
                    options.addArguments("--headless=new");
                    options.addArguments("");
                }
                return new ChromeDriver(options);

            default:
                throw new IllegalArgumentException("invalid browser"+ browser);
        }
    }
}
