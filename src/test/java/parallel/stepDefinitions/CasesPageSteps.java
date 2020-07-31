package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.DriverManager;
import managers.PageObjectManager;

public class CasesPageSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public CasesPageSteps (TestContext testContext){
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

    @Then("I click on Case tab dropdown")
    public void i_click_on_Case_tab_dropdown() {
        pageObjectManager.getCommonPage().clickSalesForceWebElement("Cases");

    }

    @Then("I click on New Case")
    public void i_click_on_New_Case() {
        pageObjectManager.getOpportunitiesPage().clickOnNewOpportunity();

    }

    @Then("I fill new Case Form")
    public void i_fill_new_Case_Form() {
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Web Email","prabsaini2@gmail.com");
        pageObjectManager.getCasesPage().clickOnDroopDownForCaseOrigin();
        pageObjectManager.getCasesPage().clickOnDdOption();

    }

}
