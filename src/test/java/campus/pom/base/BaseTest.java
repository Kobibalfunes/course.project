package campus.pom.base;

import campus.pom.utils.ExtentReport;
import campus.pom.factory.DriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    public ExtentReport exm = new ExtentReport(driver);

    @BeforeMethod
    public void startDriver() {
        driver = new DriverManager().initializeDriver();
        PageFactory.initElements(driver, this);
        extent = exm.GetExtent();
        test = exm.createTest("Test", "By Kobi Balfunes The King");


    }

    @AfterMethod
    public void quitDriver() {
        extent.flush();
        driver.quit();
    }
}
