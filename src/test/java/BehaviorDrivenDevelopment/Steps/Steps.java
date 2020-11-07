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

    @Given("^User logs into his profile page as (.*)$")
    public void user_logs_into_his_profile_page(String userId) throws Throwable
    {
        System.out.println("Opening the browser and starting the application...");
        WebDriverHelper helper = new WebDriverHelper();
        driver = helper.getDriver();
        mainPage = helper.getMainPage();
        mainPage.loginAsUser(userId);
    }

    @When("^He filters by an (.*) category$")
    public void he_filters_by_an_escEsh_category(String escEshCategory) throws Throwable
    {
        System.out.println("Filtering by category...");
        mainPage.filterByEscEsh(escEshCategory);
    }

    @Then("^He sees only results with the specified (.*) category$")
    public void he_sees_only_measurements_with_the_specified_category(String escEshCategory) throws Throwable
    {
        System.out.println("Verifying that all data corresponds to the chosen tag...");
        List<String> labelsEscEsh = mainPage.getAllEscEshColumnValues();
        System.out.println("Number of values found in the column: "+labelsEscEsh.size());
        Assert.assertTrue(
                0==labelsEscEsh.size()
                || labelsEscEsh.stream().allMatch(label -> label.equals(escEshCategory)));
    }

}
