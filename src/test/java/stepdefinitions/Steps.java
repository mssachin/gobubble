package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.*;

import java.util.List;

public class Steps {

    Login login = new Login();
    SearchAndSelect searchAndSelect = new SearchAndSelect();
    Select select = new Select();
    Add add = new Add();
    Extract extract = new Extract();

    @Given("I login to instagram")
    public void i_login_to_instagram() {
        login.toInstagram("mssachin26", "Password!23");
    }
    @Given("I search for a profile {string}")
    public void i_search_for_a_profile(String profile) {
        searchAndSelect.aProfile(profile);
    }
    @Given("I click on a {string} picture")
    public void i_click_on_a_picture(String photoName) {
        select.aPhoto(photoName);
    }
    @When("I add comment")
    public void i_add(io.cucumber.datatable.DataTable dataTable) {
        List<String> commentsAsList = dataTable.asList();
        for(String comment: commentsAsList){
            add.comment(comment);
        }

    }
    @Then("I can scrape all the comments from the picture")
    public void i_can_scrape_all_the_comments_from_the_picture() {
        List<String> allCommentsList = extract.allComments();
        for(String comment: allCommentsList){
            System.out.println("Comment is "+comment);
        }
    }

}
