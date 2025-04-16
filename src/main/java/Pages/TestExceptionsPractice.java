package Pages;
import Pages.Helper.waitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestExceptionsPractice {

    private final waitHelper wait;

    private final By testExceptionsPageLocator = By.xpath("//a[text()='Test Exceptions']");
    private final By addBtnLocator = By.xpath("//div[@id='row1']//button[@id='add_btn']");

    private final By Row1inputFieldLocator = By.xpath("//div[@id='row1']//input[@class='input-field']");
    private final By Row2inputFieldLocator = By.xpath("//div[@id='row2']//input[@class='input-field']");

    private final By Row1saveBtnLocator = By.cssSelector("#row1 #save_btn[name='Save']");
    private final By Row2saveBtnLocator = By.cssSelector("#row2 #save_btn[name='Save']");

    private final By Row1editBtnLocator = By.cssSelector("#row1 #edit_btn[name='Edit']");
    private final By Row2editBtnLocator = By.cssSelector("#row2 #edit_btn[name='Edit']");

    private final By removeBtnLocator = By.cssSelector("#row2 #remove_btn[name='Remove']");

    public TestExceptionsPractice(waitHelper wait) {

        this.wait = wait;
    }


    public void TestExceptionPage(){
        WebElement testExceptionsPage = wait.waitForElementVisible(testExceptionsPageLocator,5);
        testExceptionsPage.click();
    }
    public void clickAddButton(){
        WebElement addBtn = wait.waitForElementClickable(addBtnLocator,5);
        addBtn.click();
    }
    public void clickRow1InputField(){
        WebElement inputField = wait.waitForElementClickable(Row1inputFieldLocator,5);
        inputField.clear();
        inputField.sendKeys("Burger");
    }
    public void clickRow2InputField(){
        WebElement inputField = wait.waitForElementClickable(Row2inputFieldLocator,5);
        inputField.clear();
        inputField.sendKeys("Drinks");
    }
    public void clickRow2UpdateInput(){
        WebElement inputField = wait.waitForElementClickable(Row2inputFieldLocator,5);
        inputField.clear();
        inputField.sendKeys("updated Drinks");
    }
    public void clickRow1SaveButton(){
        WebElement saveBtn =  wait.waitForElementClickable(Row1saveBtnLocator,5);
        saveBtn.click();
    }
    public void clickRow2SaveButton(){
        WebElement saveBtn =  wait.waitForElementClickable(Row2saveBtnLocator,5);
        saveBtn.click();
    }
    public void clickRow1EditButton(){
        WebElement editBtn = wait.waitForElementClickable(Row1editBtnLocator,5);
        editBtn.click();
    }
    public void clickRow2EditButton(){
        WebElement editBtn = wait.waitForElementClickable(Row2editBtnLocator,5);
        editBtn.click();
    }
    public void clickRemoveButton(){
        WebElement removeBtn = wait.waitForElementClickable(removeBtnLocator,5);
        removeBtn.click();
    }


    public void PracticeTestExceptionsStep(){
        TestExceptionPage();
        clickRow1EditButton();
        clickRow1InputField();
        clickRow1SaveButton();

        clickAddButton();

        clickRow2InputField();
        clickRow2SaveButton();
        clickRow2EditButton();
        clickRow2UpdateInput();
        clickRow2SaveButton();
        clickRemoveButton();
    }
}
