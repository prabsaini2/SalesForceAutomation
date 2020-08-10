package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage {
    WebDriver driver;

   @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="Login")
    WebElement login;



    public LoginPage()  {
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
    public void loginAsValidUser() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/Prab/IdeaProjects/salesforce-auto/credentials/config.properties");

        Properties prop = new Properties();
        prop.load(fis);
        String userName = prop.getProperty("uname");
        String pword = prop.getProperty("pwd");


        getUsername().sendKeys(userName);
        getPassword().sendKeys(pword);
        getLogin().click();

    }
    public void openSalesForce(){

        driver.get("https://login.salesforce.com/?locale=au");
    }

}
