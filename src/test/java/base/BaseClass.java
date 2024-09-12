package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;

    public void setup(){
        if(driver==null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
    }
    public void openBaseUrl(){
        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
    }
    public void tearDown(){
        driver.quit();
    }
}
