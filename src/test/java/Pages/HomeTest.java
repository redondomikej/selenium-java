package Pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {
    private WebDriver driver;
    private Home homePage;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new Home(driver);
    }

    @Test
    void testHomeSetup(){
        homePage.HomeStep();
        String expectedTitle = "Practice test Automation";
        assertEquals(expectedTitle,driver.getTitle(),"Page title should match the expected title.");
    }

    @Test
    void testPageUrl(){
        homePage.HomeStep();
        String expectedUrl = "https://practicetestautomation.com/";
        assertEquals(expectedUrl,driver.getCurrentUrl(),"Current URL should match the expected URL.");
    }

    @AfterEach
    void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}