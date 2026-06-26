package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenShotUtil {
    public static String takeScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
        File destFile = new File(path);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;  // Return path to attach in ExtentReports
    }
}
