package PageRunner;

import Pages.Helper.waitHelper;
import Pages.TestExceptionsPractice;
import Pages.loginPractice;
import Pages.menu;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Runner {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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

