package Runner;

import Pages.inputDetail;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class runInputDetail {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        inputDetail fillUpElement = new inputDetail(driver);
        /*
        fillUpElement.inputDetailName();
        fillUpElement.inputDetailEmail();
        fillUpElement.inputDetailPhone();
        fillUpElement.inputDetailAddress();
*/
        fillUpElement.fillOutForm("nameTest","qaatest@yopmailcom","1234567890","laurel city");
    }
}
