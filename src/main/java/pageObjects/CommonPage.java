package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonPage {
    WebDriver driver;
    String textAreaXpath = "//*[text()='displayName']//following::textarea[1]";
    String inputXpath = "//*[text()='displayName']//following::input[1]";
    String dropDown = "//*[text()='displayName']//following::lightning-primitive-icon[1]";
    String searchOptionTab = "//div[@title='name']";


    public CommonPage(WebDriver driver) {
        this.driver = driver;

    }

    public String getTextAreaXpath() {

        return textAreaXpath;
    }

    public String getInputXpath() {

        return inputXpath;
    }

    public String getDropdown() {

        return dropDown;
    }

    public String getSearchOptionTab() {

        return searchOptionTab;
    }

    /*
    It add the right value to "displayName or variable passed in this method."
     */
    public String getTextAreaWebElementXpath(String displayName) {
        return getTextAreaXpath().replace("displayName", displayName);
    }

    public String getInputWebElementXpath(String displayName) {
        return getInputXpath().replace("displayName", displayName);
    }

    public String getDropdown(String displayName) {

        return getDropdown().replace("displayName", displayName);
    }

    public WebElement getTextAreaWebElement(String displayName) {
        return driver.findElement(By.xpath(getTextAreaWebElementXpath(displayName)));
    }

    public WebElement getInputWebElement(String displayName) {
        return driver.findElement(By.xpath(getInputWebElementXpath(displayName)));
    }

    public WebElement getDropdownWebElement(String displayName) {
        return driver.findElement(By.xpath(getDropdown(displayName)));
    }

    public void clickSalesForceWebElement(String displayName) {
        //getDropdownWebElement(displayName).click();
//         WebElement firstResult = new WebDriverWait(driver,(20000))
//              .until(ExpectedConditions.elementToBeClickable(By.xpath(getDropdown(displayName))));
//        firstResult.click();
        clickDropDownByJs(getDropdownWebElement(displayName), driver);

    }

    public void clickTextAreaWebElement(String displayName) {

        getInputWebElement(displayName).click();
    }

    public void fillSalesForceTextAreaWebElement(String displayName, String input) {
        getTextAreaWebElement(displayName).sendKeys(input);
    }

    public void fillSalesForceInputWebElement(String displayName, String input) {
        getInputWebElement(displayName).sendKeys(input);
    }

    //    public void clickOnNewAccount(){
//        driver.findElement(By.xpath("//one-app-nav-bar-menu-item[1]//a[1]//span[1]//lightning-icon[1]//lightning-primitive-icon[1]//*[local-name()='svg']")).click();
//    }
    public void clickSalesForceInputWebElement(String displayName) {

        getInputWebElement(displayName).click();
    }

    public void clickOnSave() {
        driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']//span[contains(@class,'label bBody')][contains(text(),'Save')]")).click();
    }

    public void clickOnNewContact() {
        driver.findElement(By.xpath("//lightning-icon[@class='slds-icon-utility-add slds-icon-text-default slds-m-right--x-small slds-shrink-none slds-icon_container']//lightning-primitive-icon//*[local-name()='svg']")).click();

    }

    public String get_Confirmation() {
        return driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();


    }

    public void deleteAccount() {


        driver.findElement(By.xpath("//*[@class = 'slds-col slds-no-flex slds-grid slds-grid_vertical-align-center horizontal actionsContainer']/ul//li[4]/div/div/div//div/a")).click();

        driver.findElement(By.xpath("//*[@class = 'branding-actions actionMenu popupTargetContainer uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default visible positioned']/div/ul/li[3]/a")).click();

        //driver.findElement(By.xpath("//*[@class = 'branding-actions actionMenu popupTargetContainer uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default visible positioned']/div/ul/li/a[@title='Sanjot']")).click();

        driver.findElement(By.xpath("//button[@title='Delete']")).click();
    }

    public String confirmItsHomePage() {
        return driver.findElement(By.xpath("//span[contains(text(),'Home')]")).getText();
    }

    public void clickDropDownByJs(WebElement element, WebDriver driver) {
        //Ref: https://www.youtube.com/watch?v=P6LBk_qzISg&list=LLls3LANdXHoKFrXIYiMK-cw&index=2&t=2402s Time:35 mins
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }

    public void clickOnPagesNewItemToCreateNew() {
// Initialize and wait till element(link) became clickable - timeout in 10 seconds
        WebElement firstResult = new WebDriverWait(driver, (20000))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='menuItemsWrapper']//child::lightning-primitive-icon")));
        firstResult.click();
    }

    public String getSearchOptionTabWebElementXpath(String name) {
        return getSearchOptionTab().replace("name", name);

    }

    public WebElement getSearchOptionTabWebElement(String name) {
        return driver.findElement(By.xpath(getSearchOptionTabWebElementXpath(name)));
    }

    public void clickGetSearchOptionTabElement(String name) {

        getSearchOptionTabWebElement(name).click();
    }
}

