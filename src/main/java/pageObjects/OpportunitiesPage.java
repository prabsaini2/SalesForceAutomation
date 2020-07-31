package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class OpportunitiesPage {
    WebDriver driver;

    public OpportunitiesPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnNewOpportunity(){
// Initialize and wait till element(link) became clickable - timeout in 10 seconds
        WebElement firstResult = new WebDriverWait(driver,(20000))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='menuItemsWrapper']//child::lightning-primitive-icon")));
        firstResult.click();
        //driver.findElement(By.xpath("//div[@class='menuItemsWrapper']//child::lightning-primitive-icon")).click();
    }
    public void selectDate() {
        String month = "JULY";
        String day = "29";
        while (true) {
            String text = driver.findElement(By.xpath("//h2[@class='monthYear']")).getText();
            if (text.equals(month)) {
                break;
            } else {
                driver.findElement(By.xpath("//a[@class='navLink nextMonth']")).click();
            }
        }
        driver.findElement(By.xpath("//div[@class='scroller slds-datepicker']//div//table//tbody//tr//td//span[contains(text(),"+day+") and @class= 'slds-day weekday DESKTOP uiDayInMonthCell--default']")).click();
    }
//    public void getDropDown(){
//        Select dropdown = new Select(driver.findElement(By.className("select")));
//        dropdown.selectByIndex(2);
//
//    }
    public void clickOnDroopDown(){
        driver.findElement(By.xpath("//*[text()='Stage']//following::a[1]")).click();

    }
    public void clickOnDdOption(){
        driver.findElement(By.xpath("//a[@role='menuitemradio' and @title='Qualification']")).click();
    }
}


