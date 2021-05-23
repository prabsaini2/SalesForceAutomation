package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AndroidAddNumbers {
    AndroidDriver androidDriver;


public AndroidAddNumbers(AndroidDriver androidDriver){

    this.androidDriver=androidDriver;
}

public void enterFirstNumber() {

    androidDriver.findElementById("firstNumberEditText").sendKeys("22");
}
    public void enterSecondNumber() {
        androidDriver.findElementById("secondNumberEditText").sendKeys("9");

}
    public void clickAdd() {

    androidDriver.findElementById("addBtn").click();
    }
    public String result(){

    return androidDriver.findElementById("resultTextView").getText();

    }


    }








