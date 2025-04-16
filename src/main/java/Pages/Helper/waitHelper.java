package Pages.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitHelper {
    private final WebDriver driver;
    public waitHelper(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitForElementVisible(By locator , int timeSeconds){
        return new WebDriverWait(driver, Duration.ofSeconds(timeSeconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementClickable(By locator , int timeSeconds){
       return new WebDriverWait(driver, Duration.ofSeconds(timeSeconds)).until(ExpectedConditions.elementToBeClickable(locator));
    }
}
