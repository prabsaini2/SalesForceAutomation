package parallel.stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.DriverManager;
import managers.PageObjectManager;
import pageObjects.TasksPage;

public class TasksPageSteps {
    TestContext testContext;
    PageObjectManager pageObjectManager;
    DriverManager driverManager;
    public TasksPageSteps(TestContext testContext){
        this.testContext = testContext;
        pageObjectManager = testContext.getPageObjectManager();
        driverManager = testContext.getWebDriverManager();
    }

    @Then("I click on Tasks dropdown")
    public void i_click_on_Tasks_dropdown() {
        pageObjectManager.getCommonPage().clickSalesForceWebElement("Tasks");
    }

    @Then("I click on New Task")
    public void i_click_on_New_Task() {
        pageObjectManager.getCommonPage().clickOnPagesNewItemToCreateNew();

    }

    @Then("I fill new Task Form")
    public void i_fill_new_Task_Form() {
        pageObjectManager.getCommonPage().clickSalesForceInputWebElement("Subject");
        pageObjectManager.getTasksPage().clickOnSubjectSearch();



    }
}
