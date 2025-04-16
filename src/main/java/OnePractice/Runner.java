package OnePractice;

import net.bytebuddy.utility.JavaConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;

public class Runner {
    public static void main(String[] args){
        BrowserManager.BrowserType browser = BrowserManager.BrowserType.EDGE;
        boolean isHeadless = true;
        WebDriver driver = BrowserManager.getDriver(browser,isHeadless);
        DynamicSelector wait = new DynamicSelector(driver);




        driver.get("https://practicetestautomation.com/");
        WebElement practicePage = driver.wait


    }
}
