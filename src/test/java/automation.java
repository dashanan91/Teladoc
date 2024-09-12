//package test.java;
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import java.time.Duration;
//import java.util.List;
//
//public class automation {
//    automation(){
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
//    }
//     WebDriver driver;
//    public static void main(String[] args) throws InterruptedException {
//        //addingNewUser();
//        automation automationObject = new automation();
//        automationObject.deletingParticularUser("novak");
//    }
//    void addingNewUser() throws InterruptedException {
//
//Assert.assertTrue( driver.findElement(By.xpath("//table[@table-title='Smart Table example']")).isDisplayed());
//driver.findElement(By.xpath("//button[contains(@class, 'pull-right')]")).click();
//
//        WebElement firstNameLocator = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='FirstName']")));
//        WebElement lastNameLocator = driver.findElement(By.xpath("//input[@name='LastName']"));
//        WebElement userNameLocator = driver.findElement(By.xpath("//input[@name='UserName']"));
//        WebElement passwordLocator = driver.findElement(By.xpath("//input[@type = 'password']"));
//        String companyName = "Company AAA";
//        WebElement companyLocator = driver.findElement(By.xpath("//td[@class='ng-scope']//label[text()[contains(. , '"+companyName+"')]]/input"));
//        WebElement selectorDropDown = driver.findElement(By.xpath("//select[@name='RoleId']"));
//        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//        WebElement cellPhone = driver.findElement(By.xpath("//input[@name='Mobilephone']"));
//        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Save']"));
//
//firstNameLocator.sendKeys("Rahul");
//lastNameLocator.sendKeys("Choudhary");
//userNameLocator.sendKeys("Rahul_91");
//passwordLocator.sendKeys("Rahul@123");
//companyLocator.click();
//Select select = new Select(selectorDropDown);
//select.selectByVisibleText("Customer");
//email.sendKeys("r.110991.c@gmail.com");
//cellPhone.sendKeys("9999154339");
//submitButton.click();
//
//    }
//
//    List<WebElement> getRowsInTable(){
//        List<WebElement> elementsInTableBody = driver.findElements(By.xpath("//table/tbody/tr"));
//        return elementsInTableBody;
//    }
//     void deletingParticularUser(String userName){
//List<WebElement> initialElements = getRowsInTable();
//int initialCountOfElements = initialElements.size();
//for(WebElement individualRows: initialElements){
//    List<WebElement> individualColumns = individualRows.findElements(By.xpath("./td"));
//    if(individualColumns.get(2).getText().equals(userName)){
//        individualRows.findElement(By.xpath(".//td/button/i[contains(@class, 'icon-remove')]")).click();
//        driver.findElement(By.xpath("//button[text()='OK']")).click();
//        break;
//    }
//
//}
//         List<WebElement> finalElements = getRowsInTable();
//         Assert.assertEquals(finalElements.size(), initialCountOfElements-1);
//         for(WebElement individualRows: finalElements){
//             List<WebElement> individualColumns = individualRows.findElements(By.xpath("./td"));
//             if(individualColumns.get(2).getText().equals(userName)){
//                 Assert.assertTrue(false, "Element with specified name("+userName+") still exists in table.");
//                 break;
//             }
//         }
//         Assert.assertTrue(true);
//    }
//}
