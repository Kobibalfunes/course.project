package campus.pom.base;

import campus.pom.factory.DriverManager;
import campus.pom.utils.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
    public ExtentReports extent;
    public ExtentTest test;
    protected WebDriver driver;
    public ExtentReport exm = new ExtentReport(driver);

    @Parameters("browser")
    @BeforeMethod
    public void startDriver(@Optional ("EDGE") String browser) {
        driver = new DriverManager().initializeDriver(browser);
        PageFactory.initElements(driver, this);
/*        extent = exm.GetExtent();
        test = exm.createTest("Test", "By Kobi Balfunes The King");*/


    }

    @AfterMethod
    public void quitDriver() {
//        extent.flush();
        driver.quit();
    }
}
