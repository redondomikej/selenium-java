package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicSelector {
    WebDriver driver;
    public DynamicSelector(WebDriver driver){
        this.driver = driver;
    }
    public WebElement waitUntilVisible(By locator, int seconds){
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public WebElement waitUntilClickable(By locator, int seconds){
        return new WebDriverWait(driver,Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(locator));
    }

}
