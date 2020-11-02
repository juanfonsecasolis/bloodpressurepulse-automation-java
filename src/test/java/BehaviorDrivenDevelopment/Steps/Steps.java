package BehaviorDrivenDevelopment.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("^User logs into his profile page$")
    public void user_logs_into_his_profile_page() throws Throwable
    {
        System.out.println("YAHA...");
    }

    @When("^He chooses to see the details about the blood pressure categorization$")
    public void he_chooses_to_see_the_details_about_the_blood_pressure_categorization() throws Throwable
    {
        System.out.println("YAHA...");
    }

    @Then("^He sees the AHA and ESC references$")
    public void he_sees_the_AHA_and_ESC_references() throws Throwable
    {
        System.out.println("YAHA...");
    }

}
