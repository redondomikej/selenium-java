package stepDefinitions;

import Pages.loginPractice;
import Pages.menu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class loginSteps {

    WebDriver driver;
    loginPractice login;
    menu menuNav;
    public loginSteps() {
        // Get shared driver and menuNav from baseSteps
        this.driver = baseSteps.driver;
        this.menuNav = baseSteps.menuNav;
        this.login = new loginPractice(driver);
    }

  /*  @Given("I open the practice test site")
    public void i_open_the_practice_test_site(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/");
        menuNav = new menu(driver);
        login = new loginPractice(driver);
    } */

    @When("I navigate to the login page")
    public void I_navigate_to_the_login_page() {
        menuNav.HomeMenu();
        menuNav.PracticeMenu();
        login.PracticeTestLoginStep();
    }

    @And("I extract login credentials")
    public void i_extract_the_credentials(){
        login.loginCredentials();

    }

    @And("I perform login and logout")
    public void i_perform_login_and_logout(){
        login.LoginAndLogout();
    }

    @And("I enter invalid credentials")
    public void i_enter_invalid_credentials() {
        login.InvalidLoginCredentials("invalidUsername", "invalidPassword"); // ← This method should be in your loginPractice class
    }

    @Then("I should see a login error message")
    public void i_should_see_a_login_error_message() {
        login.verifyErrorMessage(); // ← This should also be in loginPractice
        driver.quit();
    }

    @Then("I should be logged out successfully")
    public void i_should_be_logged_out_successfully(){
        driver.quit();
    }

}
