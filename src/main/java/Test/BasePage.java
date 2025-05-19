package Test;

import helper.BrowserConfig;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static void main (String[] args){
        BrowserConfig.BrowserType browser = BrowserConfig.BrowserType.chrome;
        boolean isHeadless = false ;
        WebDriver driver = BrowserConfig.getDriver(browser,isHeadless);
        String TestUrl = "https://practicetestautomation.com";
        driver.get(TestUrl);

        Menu menuNav = new Menu(driver);
        menuNav.home();
        menuNav.practice();
        menuNav.courses();
        menuNav.blog();
        menuNav.contact();
    }
}
