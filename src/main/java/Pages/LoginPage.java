package Pages;

import Locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;                                   // Global variable

    public LoginPage(WebDriver driver) {
      this.driver=driver;                                       // Constructor
    }

    public void enterUsername(String username) {
        driver.findElement(LoginPageLocators.USERNAME_FIELD).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginPageLocators.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(LoginPageLocators.LOGIN_BUTTON).click();
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(LoginPageLocators.LOGIN_PAGE).isDisplayed();
    }

    public boolean isOrgPageDisplayed() {
        return driver.findElement(LoginPageLocators.ORG_PAGE).isDisplayed();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public void enterOrgName(String orgname) {
        driver.findElement(LoginPageLocators.ORG_NAME).sendKeys(orgname);
    }

    public void clickSearch() {
        driver.findElement(LoginPageLocators.SEARCH_BUTTON).click();
    }

    public void searchOrgName(String orgname){
        enterOrgName(orgname);
        clickSearch();
    }

    public void searchForShadowUser(String username){

    }

    public void shadowUserLogin(String username){
        searchForShadowUser(username);
//        clickShadowLogin();                         // need to implement by selecting value from dropdown
    }
}
