package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TasksPage {
    WebDriver driver;
    public TasksPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnSubjectSearch(){
        driver.findElement(By.xpath("//span[@title='Call']")).click();
    }
}
