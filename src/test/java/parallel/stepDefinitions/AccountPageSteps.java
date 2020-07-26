package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.DriverManager;
import managers.PageObjectManager;
import org.junit.Assert;

public class AccountPageSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;
    public AccountPageSteps(TestContext testContext) {
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

    @Given("I login to SalesForce website")
    public void i_login_to_SalesForce_website() {
        pageObjectManager.getLoginPage().openSalesForce();
        pageObjectManager.getLoginPage().loginAsValidUser();
    }

    @When("I click on Accounts tab dropdown")
    public void i_click_on_Accounts_tab_dropdown() {
    pageObjectManager.getCommonPage().clickSalesForceWebElement("Accounts");

    }

    @Then("I click on New Account")
    public void i_click_on_New_Account() {
        pageObjectManager.getCommonPage().clickOnNewAccount();

    }

    @Then("I fill the New Account form")
    public void i_fill_the_New_Account_form() {
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Account Name","Sanjot");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Fax","25948257");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Website","Getskills.com");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Employees","10");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Annual Revenue","100000");
        pageObjectManager.getCommonPage().fillSalesForceTextAreaWebElement("Description","Testing");
        pageObjectManager.getCommonPage().fillSalesForceTextAreaWebElement("Billing Street","231 Hepburn Road");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing City","Auckland");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing State/Province","Auckland");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing Zip/Postal Code","0602");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing Country","New Zealand");
        pageObjectManager.getCommonPage().clickSalesForceInputWebElement("Copy Billing Address to Shipping Address");
    }

    @Then("I click on Save")
    public void i_click_on_Save() {
        pageObjectManager.getCommonPage().clickOnSave();


    }

    @Then("I am back on Home page")
public void i_am_back_on_Home_page() {
       // Assert.assertEquals("New Account | Salesforce", driverManager.getDriver().getTitle());
           Assert.assertEquals("Sanjot",pageObjectManager.getCommonPage().get_Confirmation());


    }

    @And("I delete the created Account")
public void iDeleteTheCreatedAccount() {
pageObjectManager.getCommonPage().deleteAccount();

    }


    @And("I fill details {string} {string} {string} {string}")
    public void iFillDetails(String name, String fax, String billingStreet, String billingCountry) {

        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Account Name",name);
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Fax",fax);
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Website","Getskills.com");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Employees","10");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Annual Revenue","100000");
        pageObjectManager.getCommonPage().fillSalesForceTextAreaWebElement("Description","Testing");
        pageObjectManager.getCommonPage().fillSalesForceTextAreaWebElement("Billing Street",billingStreet);
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing City","Auckland");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing State/Province","Auckland");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing Zip/Postal Code","0602");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Billing Country",billingCountry);
        pageObjectManager.getCommonPage().clickSalesForceInputWebElement("Copy Billing Address to Shipping Address");

    }

    @Then("Verify the account is created for {string}")
    public void verifyTheAccountIsCreatedFor(String name) {
        Assert.assertEquals(name,pageObjectManager.getCommonPage().get_Confirmation());
    }
}

