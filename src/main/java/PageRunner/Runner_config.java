package PageRunner;

import Pages.Helper.BrowserConfig;
import Pages.Helper.BrowserConfig.BrowserType;
import Pages.Helper.waitHelper;
import Pages.loginPractice;
import Pages.menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;


public class Runner_config {
    public static void main(String[] args) {

       // BrowserConfig.BrowserType browser = BrowserConfig.BrowserType.CHROME;
        BrowserType browser = BrowserType.CHROME;
        boolean isHeadless = false;

        WebDriver driver = BrowserConfig.getDriver(browser,isHeadless);
        waitHelper wait = new waitHelper(driver);
        menu menuNav = new menu(driver);

        driver.get("https://practicetestautomation.com/");
        menuNav.HomeMenu();
        /*menuNav.PracticeMenu();

        TestExceptionsPractice practicePage = new TestExceptionsPractice(driver, wait);
        practicePage.PracticeTestExceptionsStep();*/

        menuNav.PracticeMenu();
        loginPractice testPractice = new loginPractice(driver);
        testPractice.LoginStep();

        driver.quit();

    }
}

