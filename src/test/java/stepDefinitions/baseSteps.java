package stepDefinitions;

import Pages.Helper.BrowserConfig;
import Pages.Helper.BrowserConfig.BrowserType;
import Pages.menu;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseSteps {

    public static WebDriver driver;
    public static menu menuNav;

    @Given("I open the practice test site")
    public void i_open_the_practice_test_site(){
       // WebDriverManager.chromedriver().setup();
        // BrowserConfig.BrowserType browser = BrowserConfig.BrowserType.CHROME;
        BrowserType browser = BrowserType.EDGE;
        boolean isHeadless = false;
        driver = BrowserConfig.getDriver(browser, isHeadless);
        driver.get("https://practicetestautomation.com/");
        menuNav = new menu(driver);
    }
}
