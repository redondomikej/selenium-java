package Test;

import helper.BrowserConfig;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static void main (String[] args){
        //BrowserConfig.BrowserType browser = BrowserConfig.BrowserType.safari;
        BrowserConfig.BrowserType browser = BrowserConfig.BrowserType.chrome;
        boolean isHeadless = false ;
        WebDriver driver = BrowserConfig.getDriver(browser,isHeadless);
        driver.get("https://practicetestautomation.com");
    }
}
