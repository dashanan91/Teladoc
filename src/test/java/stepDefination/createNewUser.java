package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import pageObjects.createUser;
import utilities.Context;

public class createNewUser {
    Context context;
    createUser createUserPage;

    public createNewUser(Context context) {
        this.context = context;
        createUserPage = context.getCreateuser();
    }

    @Given("User opens landing page of the app")
    public void user_opens_landing_page_of_the_app() throws InterruptedException {
        context.openBaseUrl();
        createUserPage.addingNewUser();
    }

    @When("User tries to create new user")
    public void user_tries_to_create_new_user() {
        createUserPage.loadCreateNewUserMenu();
    }

    @When("User provides firstName as {string}")
    public void user_provides_first_name_as(String firstName) {
        createUserPage.insertFirstName(firstName);
    }

    @When("User provides lastName as {string}")
    public void user_provides_last_name_as(String lastName) {
        createUserPage.insertLastName(lastName);
    }

    @When("User provides userName as {string}")
    public void user_provides_user_name_as(String userName) {
        createUserPage.insertUserName(userName);
    }

    @When("User provides password as {string}")
    public void user_provides_password_as(String password) {
        createUserPage.insertPassword(password);
    }

    @When("User provides customer as {string}")
    public void user_provides_customer_as(String companyName) {
        createUserPage.selectCompany();
    }

    @When("User provides Role as {string}")
    public void user_provides_role_as(String role) {
        createUserPage.selectRole(role);
    }

    @When("User provides Email as {string}")
    public void user_provides_email_as(String emailId) {
        createUserPage.insertEmailId(emailId);
    }

    @When("User provides CellPhone as {string}")
    public void user_provides_cell_phone_as(String phoneNo) {
        createUserPage.insertPhoneNo(phoneNo);
    }

    @When("User clicks on submit button to create user specified")
    public void user_clicks_on_submit_button_to_create_user_specified() {
        createUserPage.clickSaveButton();
    }

    @Then("specified user gets created and verified as an entry on the webTable")
    public void specified_user_gets_created_and_verified_as_an_entry_on_the_web_table() {

    }

    @After
    public void closingBrowser(){
        context.tearDown();
    }

}
