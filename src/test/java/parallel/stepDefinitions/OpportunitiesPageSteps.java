package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.DriverManager;
import managers.PageObjectManager;

public class OpportunitiesPageSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public OpportunitiesPageSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }
    @Then("I click on Opportunity dropdown")
    public void i_click_on_Opportunity_dropdown() {
        pageObjectManager.getCommonPage().clickSalesForceWebElement("Opportunities");

    }

    @Then("I click on New Opportunity")
    public void i_click_on_New_Opportunity() {
        pageObjectManager.getOpportunitiesPage().clickOnNewOpportunity();

    }

    @Then("I fill new Opportunity Form")
    public void i_fill_new_Opportunity_Form() {
        pageObjectManager.getCommonPage().clickSalesForceInputWebElement("Close Date");
        pageObjectManager.getOpportunitiesPage().selectDate();
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Opportunity Name","SF Project");
        pageObjectManager.getCommonPage().clickTextAreaWebElement("Account Name");
        pageObjectManager.getContactsPage().clickGetSearchOptionTabElement("Opp Test");
        pageObjectManager.getOpportunitiesPage().clickOnDroopDown();
        pageObjectManager.getOpportunitiesPage().clickOnDdOption();

    }

}
