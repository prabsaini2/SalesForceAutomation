package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadsPage {
    WebDriver driver;

    public LeadsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnNewLead(){
        driver.findElement(By.xpath("//one-app-nav-bar-item-root[2]//one-app-nav-bar-item-dropdown[1]//div[1]//one-app-nav-bar-menu-button[1]//div[1]//div[1]//slot[1]//one-app-nav-bar-menu-item[1]//a[1]//span[1]//lightning-icon[1]//lightning-primitive-icon[1]//*[local-name()='svg']")).click();
    }
    public void clickOnDropDownAndSelect(){
        Select dropdown = new Select(driver.findElement(By.className("Select")));
        dropdown.selectByVisibleText("Mr.");
    }

}
