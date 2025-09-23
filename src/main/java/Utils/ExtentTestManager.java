package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {
    static Map<Long, ExtentTest> testMap = new HashMap<>();
    static ExtentReports extent = ExtentManager.getInstance();

    public static synchronized ExtentTest getTest() {
        return testMap.get(Thread.currentThread().getId());
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.createTest(testName, desc);
        testMap.put(Thread.currentThread().getId(), test);
        return test;
    }
}
