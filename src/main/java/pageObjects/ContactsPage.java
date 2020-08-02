package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage {
    WebDriver driver;
//    String searchOptionTab = "//div[@title='name']";

    public ContactsPage(WebDriver driver) {

        this.driver=driver;
    }
//    public String getSearchOptionTab(){
//
//        return searchOptionTab;
//    }
//    public String getSearchOptionTabWebElementXpath(String name){
//        return getSearchOptionTab().replace("name",name);
//
//    }
//    public WebElement getSearchOptionTabWebElement(String name) {
//        return driver.findElement(By.xpath(getSearchOptionTabWebElementXpath(name)));
//    }
//    public void clickGetSearchOptionTabElement(String name){
//
//        getSearchOptionTabWebElement(name).click();
//    }

}
