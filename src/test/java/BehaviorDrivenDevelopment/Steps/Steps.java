package BehaviorDrivenDevelopment.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("^User logs into his profile page$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("YAHA...");
    }

    @When("^He chooses to see the details about the blood pressure categorization$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        System.out.println("YAHA...");
    }

    @Then("^He sees the AHA and ESC references$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("YAHA...");
    }

}
