package OnePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class menu {

    WebDriver driver;
    public menu (WebDriver driver){
        this.driver = driver;
    }

    public void HomeMenu(){
        WebElement homeNav = driver.findElement(By.xpath("//a[text()='Home']"));
        homeNav.click();
    }

    public void PracticeMenu(){
        WebElement practiceNav = driver.findElement(By.xpath("//a[text()='Practice']"));
        practiceNav.click();
    }

    public void CoursesMenu(){
        WebElement coursesNav = driver.findElement(By.xpath("//a[text()='Courses']"));
        coursesNav.click();
    }

    public void BlogMenu(){
        WebElement blogNav = driver.findElement(By.xpath("//a[text()='Blog']"));
        blogNav.click();
    }

    public void ContactMenu(){
        WebElement contactNav = driver.findElement(By.xpath("//a[text()='Contact']"));
        contactNav.click();
    }
}
