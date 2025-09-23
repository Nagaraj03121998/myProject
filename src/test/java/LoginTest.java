import Pages.LoginPage;
import Utils.ConfigReader;
import Utils.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage;
    @BeforeMethod
    public void goToLoginPage() {
        driver.get(ConfigReader.getProperty("baseUrl"));
        Reporter.log("User launches the browser and enter the URL");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        ExtentTestManager.startTest("testValidLogin", "Verify valid login");
        String username=ConfigReader.getProperty("username");
        String password=ConfigReader.getProperty("password");
        ExtentTestManager.getTest().log(Status.INFO, "User Enters the Username and Password.");
        loginPage.login(username,password);
        ExtentTestManager.getTest().log(Status.INFO, "Clicked on Login button.");
        Assert.assertTrue(loginPage.isLoginPageDisplayed()," User login to the page successfully");
        ExtentTestManager.getTest().log(Status.PASS, "User successfully logged in to the application");
        loginPage.searchOrgName(ConfigReader.getProperty("orgname"));
        loginPage.shadowUserLogin(ConfigReader.getProperty("shadowUser"));
    }
}
