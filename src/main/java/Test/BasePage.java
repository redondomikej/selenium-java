package Test;

import helper.BrowserConfig;
import org.openqa.selenium.WebDriver;

import static Utils.debug.log;

public class BasePage {
    public static void main (String[] args){
        BrowserConfig.BrowserType browser = BrowserConfig.BrowserType.chrome;
        boolean isHeadless = false ;
        WebDriver driver = BrowserConfig.getDriver(browser,isHeadless);
        String TestUrl = "https://practicetestautomation.com";
        driver.get(TestUrl);

        Menu menuNav = new Menu(driver);
        LoginPage loginPage = new LoginPage(driver);
        menuNav.home();
        menuNav.practice();

        loginPage.TestLoginPage();
        loginPage.Login("student","Password123");
        loginPage.submitBtn();
        loginPage.logoutBtn();
        log("try3");

        //menuNav.courses();
        //menuNav.blog();
        //menuNav.contact();
    }
}
