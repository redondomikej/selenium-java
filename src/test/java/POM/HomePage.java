package POM;

import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void TestHomePage(){
        driver.get("https://practicetestautomation.com/");
    }
}