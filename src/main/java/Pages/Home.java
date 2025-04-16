package Pages;

import Pages.Helper.waitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {
    
    WebDriver driver;
    public Home(WebDriver driver){
        this.driver = driver;
    }
    waitHelper wait = new waitHelper(driver);


    public void HomeStep(){
        driver.get("https://practicetestautomation.com/");
    }
    public void PracticeStep(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement practiceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Practice']")));
        practiceLink.click();
    }
}
