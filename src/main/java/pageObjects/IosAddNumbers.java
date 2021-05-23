package pageObjects;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.WebElement;


public class IosAddNumbers {
    IOSDriver iosDriver;
    public IosAddNumbers(IOSDriver iosDriver){
        this.iosDriver=iosDriver;
    }

    public void enterFirstNumber(){

        //iosDriver.findElementById("09000000-0000-0000-CC0A-000000000000").sendKeys("5");
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"AddNumbers\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]").sendKeys("5");
    }
    public void enterSecondNumber(){
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"AddNumbers\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]").sendKeys("8");
    }

    public void clickAdd(){
        iosDriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Return");
       iosDriver.findElementByXPath("//XCUIElementTypeButton[@name=\"ADD\"]").click();

    }

    public String result(){


        return iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"AddNumbers\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText").getText();
    }

}
