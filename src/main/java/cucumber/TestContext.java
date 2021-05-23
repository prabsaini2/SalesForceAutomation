package cucumber;

import io.appium.java_client.android.AndroidDriver;
import managers.DriverManager;
import managers.PageObjectManager;

public class TestContext {
    //this class will help to instantiate webdrivermanager and pageobjectmanager
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;


    public TestContext() {
        driverManager = new DriverManager();
        //pageObjectManager = new PageObjectManager(driverManager.getDriver());
        //pageObjectManager = new PageObjectManager(driverManager.getAndroidDriver());
       pageObjectManager = new PageObjectManager(driverManager.getIosDriver());

    }
    public DriverManager getWebDriverManager() {

        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {

        return pageObjectManager;
    }


}





