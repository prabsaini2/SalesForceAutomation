package managers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    WebDriver driver;
    AndroidDriver androidDriver;
    IOSDriver iosDriver;

public WebDriver createWebDriver() {

    WebDriverManager.chromedriver().setup();
    //with the above step we do not have to use old method which is -->System.setProperty("webdriver.chrome.driver","/Users/Prab/IdeaProjects/selenium-testsales/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    return driver;
}
    public AndroidDriver setUpAndroidDriver() {

    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
             capabilities.setCapability("VERSION", "11");
            capabilities.setCapability("deviceName", "Emulator");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.example.myapplication");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("appActivity", "com.example.myapplication");
            try{
                this.androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            return androidDriver;

    }
    public IOSDriver setUpiOSDriver() {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("platformVersion", "14.0");
            capabilities.setCapability("deviceName", "iPod touch");
            capabilities.setCapability("platformName","iOS");
            capabilities.setCapability("bundleId","com.prab.AddNumbers");
            capabilities.setCapability("udid","CED04E89-3DBB-4FA1-A9B7-0140101348B4");
            try {
                this.iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            return iosDriver;

        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }

    }
public WebDriver getDriver(){
    if(driver == null) driver = createWebDriver();
    return driver;

}
    public AndroidDriver getAndroidDriver(){
        if(androidDriver == null) androidDriver = setUpAndroidDriver();
        return androidDriver;

    }
    public IOSDriver getIosDriver(){
        if(iosDriver == null) iosDriver = setUpiOSDriver();
        return iosDriver;

    }

}
