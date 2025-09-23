package Locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final By USERNAME_FIELD = By.xpath("//input[@id='login']");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id='password']");
    public static final By LOGIN_BUTTON   = By.xpath("//input[@id='loginButton']");
    public static final By LOGIN_PAGE   = By.xpath("//span[text()='Administration System']");
    public static final By ORG_NAME   = By.xpath("//input[@id='admin_searchText']");
    public static final By SEARCH_BUTTON   = By.xpath("//button[text()='Search']");
}
