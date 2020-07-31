package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CasesPage {
    WebDriver driver;
    public CasesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnDroopDownForCaseOrigin(){
        driver.findElement(By.xpath("//*[text()='Case Origin']//following::a[1]")).click();

    }
    public void clickOnDdOption() {
        driver.findElement(By.xpath("//a[@role='menuitemradio' and @title='Phone']")).click();
    }
}
