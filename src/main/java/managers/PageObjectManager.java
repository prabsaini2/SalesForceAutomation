package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

import javax.security.auth.login.AccountException;

public class PageObjectManager {
    private WebDriver driver;
    private AccountPage accountPage;
    private CommonPage commonPage;
    private ContactsPage contactsPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private LeadsPage leadsPage;
    private OpportunitiesPage opportunitiesPage;
    private CasesPage casesPage;
    private TasksPage tasksPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
    }

    public AccountPage getAccountPage() {
        return (accountPage == null) ? accountPage = new AccountPage(driver) : accountPage;
    }

    public CommonPage getCommonPage() {
        return (commonPage == null) ? commonPage = new CommonPage(driver) : commonPage;
    }

    public ContactsPage getContactsPage() {
        return (contactsPage == null) ? contactsPage = new ContactsPage(driver) : contactsPage;
    }

    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public LoginPage getLoginPage() {

        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }
    public LeadsPage getLeadsPage(){

        return (leadsPage == null) ? leadsPage = new LeadsPage(driver) : leadsPage;
    }
    public OpportunitiesPage getOpportunitiesPage(){
        return (opportunitiesPage == null) ? opportunitiesPage = new OpportunitiesPage(driver) : opportunitiesPage;
    }
    public CasesPage getCasesPage(){
        return (casesPage == null) ? casesPage = new CasesPage(driver) : casesPage;
    }
    public TasksPage getTasksPage(){
               return (tasksPage == null)? tasksPage = new TasksPage(driver) : tasksPage;
    }

}
