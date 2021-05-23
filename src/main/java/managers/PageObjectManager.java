package managers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
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
    private AndroidDriver androidDriver;
    private IOSDriver iosDriver;
    private AndroidAddNumbers androidAddNumbers;
    private MyApplication myapplication;
    private IosAddNumbers iosAddNumbers;


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;
    }
    public PageObjectManager(AndroidDriver androidDriver) {

        this.androidDriver = androidDriver;
    }

    public PageObjectManager(IOSDriver iosDriver) {

        this.iosDriver = iosDriver;
    }

    public AccountPage getAccountPage() {
        return (accountPage == null) ? accountPage = new AccountPage(driver) : accountPage;
    }

    public AndroidAddNumbers getAddNumber(){
        return (androidAddNumbers == null) ? androidAddNumbers = new AndroidAddNumbers(androidDriver) : androidAddNumbers;

    }

    public IosAddNumbers getIosAddNumbers(){
        return (iosAddNumbers == null) ? iosAddNumbers = new IosAddNumbers(iosDriver) : iosAddNumbers;
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
    public MyApplication getMyapplication(){
        return (myapplication == null) ? myapplication = new MyApplication(androidDriver) : myapplication;

    }

}
