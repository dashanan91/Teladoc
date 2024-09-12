package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.createUser;
import pageObjects.deleteUser;

public class Context extends base.BaseClass {
private createUser createUserPage;
private deleteUser deleteUserPage;

    public Context(){
        setup();
    }
    public WebDriver returnDriver(){
        return driver;
    }

    public createUser getCreateuser(){
        if(createUserPage == null){
            createUserPage = new createUser(driver);
        }
        return createUserPage;
    }

    public deleteUser getDeleteUserPage(){
        if(deleteUserPage == null){
            deleteUserPage = new deleteUser(driver);
        }
        return deleteUserPage;
    }


}
