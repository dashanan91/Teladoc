package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import pageObjects.createUser;
import pageObjects.deleteUser;
import utilities.Context;

public class deleteSpecifiedUser {
    Context context;
    createUser createUserPage;
    deleteUser deleteUserPage;

    public deleteSpecifiedUser(Context context) {
        this.context = context;
        createUserPage = context.getCreateuser();
        deleteUserPage = context.getDeleteUserPage();
    }

    @When("User gets count of all the users in table")
    public void user_gets_count_of_all_the_users_in_table() {
        deleteUserPage.usersCountOfTableInitial();
    }

    @When("User finds and deletes lineItem with userName as {string} from the table")
    public void user_finds_and_deletes_line_item_with_user_name_as_from_the_table(String userName) {
        deleteUserPage.deletingParticularUser(userName);
    }

    @Then("Count of users in the table gets reduced by {int}")
    public void count_of_users_in_the_table_gets_reduced_by(Integer count) {
        deleteUserPage.rowCountReductionInTable(count);
    }

    @Then("User named {string} should not be found in the table")
    public void user_named_should_not_be_found_in_the_table(String userName) {
        deleteUserPage.verificationOfUserRemoved(userName);
    }

    @After
    public void closingBrowser(){
        context.tearDown();
    }
}
