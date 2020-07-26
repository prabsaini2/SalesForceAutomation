package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="Login")
    WebElement login;

    public LoginPage() {
    }


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getUsername() {

        return username;
    }

    public WebElement getPassword() {

        return password;
    }

    public WebElement getLogin() {

        return login;
    }
    public void loginAsValidUser(){
        getUsername().sendKeys("prabsaini2-57fd@force.com");
        getPassword().sendKeys("Monday10");
        getLogin().click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    public void openSalesForce(){

        driver.get("https://login.salesforce.com/?locale=au");
    }

}
