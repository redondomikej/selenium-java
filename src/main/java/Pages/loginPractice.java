package Pages;
import Pages.Helper.waitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class loginPractice {
    WebDriver driver;
    waitHelper wait;
    public loginPractice(WebDriver driver){
        this.driver = driver;
        this.wait = new waitHelper(driver);
    }
    public void PracticeTestLoginStep(){
     WebElement TestLoginPage = driver.findElement(By.xpath("//a[text()='Test Login Page']"));
     TestLoginPage.click();
    }

    private String usernameValue;
    private String passwordValue;


    public void loginCredentials(){
        WebElement credentialInfo = driver.findElement(By.xpath("//li[contains(text(),'Use next credentials')]"));
        usernameValue = credentialInfo.findElement(By.xpath(".//b[1]")).getText();
        passwordValue = credentialInfo.findElement(By.xpath(".//b[2]")).getText();
        System.out.println(usernameValue+passwordValue);
    }

    public void LoginAndLogout(){
        if (usernameValue == null || usernameValue.isEmpty()) {
            throw new IllegalArgumentException("Username is empty or null");
        }
        if (passwordValue == null || passwordValue.isEmpty()) {
            throw new IllegalArgumentException("Password is empty or null");
        }
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(usernameValue);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(passwordValue);
        System.out.println(usernameValue+passwordValue);
        WebElement submitButton = driver.findElement(By.id("submit"));
        //delay.delaySeconds(5);
        submitButton.click();
        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
        //delay.delaySeconds(5);
        logoutButton.click();
    }


    public void InvalidLoginCredentials(String invalidUsername, String invalidPassword) {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        // Enter invalid credentials
        username.sendKeys(invalidUsername);
        password.sendKeys(invalidPassword);

        // Click submit button
        submitButton.click();
    }

    public void verifyErrorMessage() {
        // Wait for the error message to be visible (element with id "error" and class "show")
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));

        // Retrieve the actual error message text
        String actualMessage = errorMsg.getText();

        // Log the actual error message for debugging
        System.out.println("Actual Error Message: " + actualMessage);

        // Check if the actual error message contains the expected text
        if (!actualMessage.equals("Your username is invalid!")) {
            throw new AssertionError("Error message not displayed as expected. Actual message: " + actualMessage);
        }
    }



    public void LoginStep(){
        PracticeTestLoginStep();
        loginCredentials();
        LoginAndLogout();
        verifyErrorMessage();
    }

}
