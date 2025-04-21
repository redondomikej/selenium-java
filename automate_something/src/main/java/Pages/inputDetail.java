package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class inputDetail {
    WebDriver driver;
    public inputDetail( WebDriver driver){
        this.driver = driver;
    }
    /*
    public void inputDetailName(){
        WebElement inputName = driver.findElement(By.id("name"));
        inputName.sendKeys("nametest");
    }
    public void inputDetailEmail(){
        WebElement inputName = driver.findElement(By.id("email"));
        inputName.sendKeys("qaa_testermike@yopmail.com");
    }
    public void inputDetailPhone(){
        WebElement inputName = driver.findElement(By.id("phone"));
        inputName.sendKeys("1234567890");
    }
    public void inputDetailAddress(){
        WebElement inputName = driver.findElement(By.id("textarea"));
        inputName.sendKeys("Laurel Tanauan City");
    }
*/

    public void fillOutForm(String name,String email, String phone, String address){
        System.out.print("Filling out the form");
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("phone")).sendKeys(phone);
        driver.findElement(By.id("textarea")).sendKeys(address);
        System.out.print("Form filled successfully!");
    }
}

