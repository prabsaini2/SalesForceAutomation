package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.DriverManager;
import managers.PageObjectManager;

public class ContactsPageSteps {
    private TestContext testContext;
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public ContactsPageSteps(TestContext testContext) {
        this.testContext=testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }
    @Then("I click on Contacts tab dropdown")
    public void i_click_on_Contacts_tab_dropdown() {
        pageObjectManager.getCommonPage().clickSalesForceWebElement("Contacts");

    }
    @Then("I click on New Contacts")
    public void i_click_on_New_Contacts() {
        pageObjectManager.getCommonPage().clickOnPagesNewItemToCreateNew();
    }
    @Then("I fill new Contact Form")
    public void i_fill_new_Contact_Form() {
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("First Name","Sanjot");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Last Name","Saini");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Mobile","0272121313");
        pageObjectManager.getCommonPage().clickTextAreaWebElement("Account Name");
        pageObjectManager.getCommonPage().clickGetSearchOptionTabElement("Contact Test");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Email","Sanjot26@gmail.com");
        pageObjectManager.getCommonPage().fillSalesForceInputWebElement("Title","Tester");
    }
}
