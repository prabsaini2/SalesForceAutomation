package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.DriverManager;
import managers.PageObjectManager;
import org.junit.Assert;

public class LoginPageSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public LoginPageSteps (TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }
    @Then("Confirm login is done")
    public void confirm_login_is_done() {
        Assert.assertEquals("Home",pageObjectManager.getCommonPage().confirmItsHomePage());

    }

    @Then("I am on Home Page")
    public void i_am_on_Home_Page() {
        Assert.assertEquals("Home",pageObjectManager.getCommonPage().confirmItsHomePage());

    }

}
