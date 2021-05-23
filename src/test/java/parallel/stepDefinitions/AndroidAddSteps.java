package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import managers.DriverManager;
import managers.PageObjectManager;
import org.junit.Assert;

public class AndroidAddSteps {
    private TestContext testContext;
    private AndroidDriver androidDriver;
    private PageObjectManager pageObjectManager;
    private DriverManager driverManager;

    public AndroidAddSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();

    }

    @Given("I enter first number")
    public void i_enter_first_number() {
       pageObjectManager.getAddNumber().enterFirstNumber();

    }

    @Given("I enter second number")
    public void i_enter_second_number() {
        pageObjectManager.getAddNumber().enterSecondNumber();

    }

    @When("I click on ADD")
    public void i_click_on_ADD() {
        pageObjectManager.getAddNumber().clickAdd();

    }

    @Then("I get the addition result")
    public void i_get_the_addition_result() {
        Assert.assertEquals("31",pageObjectManager.getAddNumber().result());

    }
}
