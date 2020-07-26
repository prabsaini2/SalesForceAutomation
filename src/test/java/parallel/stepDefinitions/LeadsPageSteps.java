package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.DriverManager;
import managers.PageObjectManager;

public class LeadsPageSteps {

    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public LeadsPageSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

    @Then("I click on Leads tab dropdown")
    public void i_click_on_Leads_tab_dropdown() {
        pageObjectManager.getCommonPage().clickSalesForceWebElement("Leads");

    }

    @Then("I click on New Lead")
    public void i_click_on_New_Lead() {
        pageObjectManager.getLeadsPage().clickOnNewLead();

    }

    @Then("I fill new Lead Form")
    public void i_fill_new_Lead_Form() {
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("First Name","Manjit");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Last Name","Sahota");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Company","JAG");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Title","HOD");

    }
}
