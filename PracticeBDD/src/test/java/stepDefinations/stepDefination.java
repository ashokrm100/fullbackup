package stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("Atleast print something today");
        throw new PendingException();
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("one week time start adding interview");
        throw new PendingException();
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Dont watch TV concenrate");
        throw new PendingException();
    }

    @And("^cards displayed$")
    public void cards_displayed() throws Throwable {
        throw new PendingException();
    }

}