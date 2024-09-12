package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class createUser {
    WebDriver driver;
    WebDriverWait wait;
    public createUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new
                WebDriverWait(this.driver,Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//table[@table-title='Smart Table example']") WebElement tableLocator;
    @FindBy(xpath = "//button[contains(@class, 'pull-right')]") WebElement addUserButton;
    @FindBy(xpath = "//input[@name='FirstName']") WebElement firstNameTB;
    @FindBy(xpath = "//input[@name='LastName']") WebElement lastNameTB;
    @FindBy(xpath = "//input[@name='UserName']") WebElement userNameTB;
    @FindBy(xpath = "//input[@type = 'password']") WebElement passwordTB;
    @FindBy(xpath = "//td[@class='ng-scope']//label[text()[contains(. , 'Company BBB')]]/input") WebElement companyLocator;
    @FindBy(xpath = "//select[@name='RoleId']") WebElement roleSelectorDD;
    @FindBy(xpath = "//input[@type='email']") WebElement emailTB;
    @FindBy(xpath = "//input[@name='Mobilephone']") WebElement mobileTB;
    @FindBy(xpath = "//button[text()='Save']") WebElement saveButton;

public void loadCreateNewUserMenu(){
    Assert.assertTrue(tableLocator.isDisplayed());
    addUserButton.click();
}

public void insertFirstName(String firstName){
    wait.until(ExpectedConditions.visibilityOf(firstNameTB));
    firstNameTB.sendKeys(firstName);
}

    public void insertLastName(String lastName){
        lastNameTB.sendKeys(lastName);
    }

    public void insertUserName(String userName){
        userNameTB.sendKeys(userName);
    }

    public void insertPassword(String password){
        passwordTB.sendKeys(password);
    }

    public void selectCompany(){
        companyLocator.click();
    }

    public void selectRole(String role){
        Select select = new Select(roleSelectorDD);
        select.selectByVisibleText(role);
    }

    public void insertEmailId(String emailId){
        emailTB.sendKeys(emailId);
    }

    public void insertPhoneNo(String phoneNo){
        mobileTB.sendKeys(phoneNo);
    }

    public void clickSaveButton(){
        saveButton.click();
    }


    public void addingNewUser() throws InterruptedException {

    }
}
