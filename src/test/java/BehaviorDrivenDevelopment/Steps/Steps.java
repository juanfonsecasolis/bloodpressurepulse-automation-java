package BehaviorDrivenDevelopment.Steps;

import Helper.WebDriverHelper;
import PageObjectModelPageFactory.Pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class Steps {

    protected WebDriver driver;
    protected MainPage mainPage;

    @Given("^User logs into his profile page$")
    public void user_logs_into_his_profile_page() throws Throwable
    {
        String userId = "xxyn4pz8yhb0i7n"; // TODO: parameterize
        System.out.println("Opening the browser and starting the application...");
        WebDriverHelper helper = new WebDriverHelper();
        driver = helper.getDriver();
        mainPage = helper.getMainPage();
        mainPage.loginAsUser(userId);
    }

    @When("^He filters by an ESC-ESH category$")
    public void he_filters_by_an_ESCESH_category() throws Throwable
    {
        System.out.println("Filtering by category...");
        String searchTermEscEsh = "optimal";
        mainPage.filterByEscEsh(searchTermEscEsh); // TODO: parameterize
    }

    @Then("^He sees only measurements with the specified category$")
    public void he_sees_only_measurements_with_the_specified_category() throws Throwable
    {
        System.out.println("Verifying that all data corresponds to the chosen tag...");
        String searchTermEscEsh = "optimal";  // TODO: parameterize
        List<String> labelsEscEsh = mainPage.getAllEscEshColumnValues();
        System.out.println("Number of values found in the column: "+labelsEscEsh.size());
        Assert.assertTrue(labelsEscEsh.stream().allMatch(label -> label.equals(searchTermEscEsh)));
    }

}
