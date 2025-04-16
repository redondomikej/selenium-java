package Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/");
        WebElement practiceLink = driver.findElement(By.xpath("//a[text()='Practice']"));
        practiceLink.click();
        WebElement TestLogin = driver.findElement(By.xpath("//a[text()='Test Login Page']"));
        TestLogin.click();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement practice_link = driver.findElement(By.cssSelector("a[href='https://practicetestautomation.com/practice/']"));
        practice_link.click();
        WebElement testLogin = driver.findElement(By.cssSelector("a[href='https://practicetestautomation.com/practice-test-login/']"));
        testLogin.click();

        WebElement loginInfo = driver.findElement(By.xpath("//li[contains(text(), 'Use next credentials')]"));
        String UsernameValue = loginInfo.findElement(By.xpath(".//b[1]")).getText();
        String PasswordValue = loginInfo.findElement(By.xpath(".//b[2]")).getText();
        System.out.println(UsernameValue+PasswordValue);

        WebElement usernameValue = driver.findElement(By.id("username"));
        usernameValue.sendKeys(UsernameValue);
        WebElement passwordValue = driver.findElement(By.id("password"));
        passwordValue.sendKeys(PasswordValue);

    }

}
