package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class deleteUser {
    WebDriver driver;
    WebDriverWait wait;

    public deleteUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By removeRowIcon = By.xpath(".//td/button/i[contains(@class, 'icon-remove')]");
    By individualColumnOfRow = By.xpath("./td");
    @FindAll({@FindBy(xpath = "//table/tbody/tr")})
    List<WebElement> tableRows;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement confirmDeletionButton;

    List<WebElement> initialElements;
    List<WebElement> finalElements;
    int initialSize;

    List<WebElement> getRowsInTable() {
        List<WebElement> elementsInTableBody = tableRows;
        return elementsInTableBody;
    }

    public void usersCountOfTableInitial() {
        initialElements = getRowsInTable();
        initialSize = initialElements.size();
    }

    public void deletingParticularUser(String userName) {
        for (WebElement individualRows : initialElements) {
            List<WebElement> individualColumns = individualRows.findElements(individualColumnOfRow);
            if (individualColumns.get(2).getText().equals(userName)) {
                individualRows.findElement(removeRowIcon).click();
                confirmDeletionButton.click();
                break;
            }

        }
    }

    public void rowCountReductionInTable(int count) {
        finalElements = getRowsInTable();
        Assert.assertEquals(finalElements.size(), initialSize - count);
    }

    public void verificationOfUserRemoved(String userName) {
        for (WebElement individualRows : finalElements) {
            List<WebElement> individualColumns = individualRows.findElements(individualColumnOfRow);
            if (individualColumns.get(2).getText().equals(userName)) {
                Assert.assertTrue(false, "Element with specified name(" + userName + ") still exists in table.");
                break;
            }
        }
        Assert.assertTrue(true);
    }
}
