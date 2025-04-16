package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePracticeTest {
    public static void main(String[] args){
        System.out.println("Hello word");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/");
        WebElement practiceLink = driver.findElement(By.xpath("//a[text()='Practice']"));
        practiceLink.click();
        WebElement testLogin = driver.findElement(By.cssSelector("a[href='https://practicetestautomation.com/practice-test-login/']"));
        testLogin.click();
        WebElement credentialInfo = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials')]"));
        String UsernameValue = credentialInfo.findElement(By.xpath(".//b[1]")).getText();
        String PasswordValue = credentialInfo.findElement(By.xpath(".//b[2]")).getText();
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys(UsernameValue);
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys(PasswordValue);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log out']"));
        logOut.click();
        driver.quit();
    }
}
