package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserConfig {
    public enum BrowserType{
        CHROME,FIREFOX,EDGE
    }
    public static WebDriver getDriver(BrowserType browser, boolean isHeadless){
        switch(browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if(isHeadless){
                    chromeOptions.addArguments("--headless=new");
                    chromeOptions.addArguments("--window-size=1020,1080");
                }
                return new ChromeDriver(chromeOptions);
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if(isHeadless){
                    firefoxOptions.addArguments("--headless=new");
                    firefoxOptions.addArguments("--window-size=1020,1080");
                }
                return new FirefoxDriver(firefoxOptions);
            case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                if(isHeadless){
                    edgeOptions.addArguments("--headless");
                    edgeOptions.addArguments("--window-size=1020,1080");
                }
                return new EdgeDriver(edgeOptions);
            default:
                throw new IllegalArgumentException("Browser not supported" + browser);
        }
    }
}
