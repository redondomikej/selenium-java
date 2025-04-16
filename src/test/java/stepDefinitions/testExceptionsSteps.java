package stepDefinitions;

import Pages.Helper.waitHelper;
import Pages.TestExceptionsPractice;
import Pages.menu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class testExceptionsSteps {
    WebDriver driver;
    TestExceptionsPractice testExceptions;
    menu menuNav;
    waitHelper wait;

    public testExceptionsSteps() {
        // Initialize the menuNav and driver from baseSteps
        this.menuNav = baseSteps.menuNav;
        this.driver = baseSteps.driver;
        this.wait = new waitHelper(driver);
        this.testExceptions = new TestExceptionsPractice(wait);

    }



 /*   @Given("I open the practice test site")
    public void i_open_the_practice_test_site(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/");
        wait = new waitHelper(driver);
        menuNav = new menu(driver);
        testExceptions = new TestExceptionsPractice(driver , wait);
    } */

    @When("I navigate to the Test Exceptions page")
    public void i_navigate_to_the_test_exceptions_page(){
        menuNav.HomeMenu();
        menuNav.PracticeMenu();
        testExceptions.TestExceptionPage();
    }
    @And("I edit the first row and save it")
    public void i_edit_the_first_row_and_save_it(){
        testExceptions.clickRow1EditButton();
        testExceptions.clickRow1InputField();
        testExceptions.clickRow1SaveButton();
    }
    @And("I add a new item in row 2 and save it")
    public void i_add_a_new_item_in_row_2_and_save_it(){
        testExceptions.clickAddButton();
        testExceptions.clickRow2InputField();
        testExceptions.clickRow2SaveButton();
    }
    @And("I edit the second row and save it")
    public void i_edit_the_second_row_and_save_it(){
        testExceptions.clickRow2EditButton();
        testExceptions.clickRow2UpdateInput();
        testExceptions.clickRow2SaveButton();
    }
    @And("I remove the second row")
    public void i_remove_the_second_row(){
        testExceptions.clickRemoveButton();
    }
    @Then("I should see the changes reflected successfully")
    public void i_should_see_the_changes_reflected_successfully(){
        driver.quit();
    }

}
