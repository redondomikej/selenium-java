package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
    WebDriver driver;
    public Menu ( WebDriver driver){
        this.driver = driver;
    }
    private void clickMenu(String menuText) {
        driver.findElement(By.xpath("//a[text()='" + menuText + "']")).click();
    }

    public void home() {
        clickMenu("Home");
    }

    public void practice() {
        clickMenu("Practice");
    }

    public void courses() {
        clickMenu("Courses");
    }

    public void blog() {
        clickMenu("Blog");
    }

    public void contact() {
        clickMenu("Contact");
    }
}
