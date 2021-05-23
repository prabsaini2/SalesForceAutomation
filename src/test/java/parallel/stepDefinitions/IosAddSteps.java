package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import managers.DriverManager;
import managers.PageObjectManager;
import org.junit.Assert;

public class IosAddSteps {
    private TestContext testContext;
    private IOSDriver iosDriver;
    private PageObjectManager pageObjectManager;
    private DriverManager driverManager;

    public IosAddSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();

    }
    @Given("I enter first number in iOS APP")
    public void i_enter_first_number_in_iOS_APP() {
        pageObjectManager.getIosAddNumbers().enterFirstNumber();
        }




    @Given("I enter second number in iOS APP")
    public void i_enter_second_number_in_iOS_APP() {
        pageObjectManager.getIosAddNumbers().enterSecondNumber();

    }

    @When("I click on ADD button")
    public void i_click_on_ADD_button() {
        pageObjectManager.getIosAddNumbers().clickAdd();

    }

    @Then("I get the addition result in the result section")
    public void i_get_the_addition_result_in_the_result_section() {
        Assert.assertEquals("13",pageObjectManager.getIosAddNumbers().result());

    }
}
