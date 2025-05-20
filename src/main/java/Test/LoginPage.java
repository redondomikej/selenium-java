package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public void Login (String username , String password){
        WebElement  usernameId = driver.findElement(By.id("username"));
        usernameId.sendKeys(username);
        WebElement passwordId = driver.findElement(By.id("password"));
        passwordId.sendKeys(password);
    }
    public void submitBtn(){
        WebElement clickSubmitButton = driver.findElement(By.id("submit"));
        clickSubmitButton.click();
    }
    public void logoutBtn(){
        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
        logoutButton.click();
    }
}
