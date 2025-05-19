package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage ( WebDriver driver){
        this.driver = driver;
    }
    private void clickXpathElement(String menuText) {
        driver.findElement(By.xpath("//a[text()='" + menuText + "']")).click();
    }
    public void TestLoginPage() {
        clickXpathElement("Test Login Page");
    }
}
