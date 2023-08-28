package campus.pom.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ExtentReport {


    public ExtentReports extent;
    public ExtentSparkReporter htmlReporter;
    public ExtentTest test;
    public DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    public Date today = Calendar.getInstance().getTime();
    public String reportDate = df.format(today);
    public String filePath = "D:\\QA\\Files\\" + reportDate + "\\exReport.html";

    public ExtentReport(WebDriver driver) {
    }


    public ExtentTest createTest(String name, String description) {
        test = extent.createTest(name, description);
        return test;
    }

    public ExtentReports GetExtent() {
        new File("d:\\" + reportDate).mkdirs();
        if (extent != null)

            return extent; //avoid creating new instance of html file
        extent = new ExtentReports();
        extent.attachReporter(getHtmlReporter());
        return extent;
    }

    public ExtentSparkReporter getHtmlReporter() {
        htmlReporter = new ExtentSparkReporter(filePath);
        htmlReporter.config().setDocumentTitle("QAV automation report");
        htmlReporter.config().setReportName("Regression cycle");
        return htmlReporter;
    }

    public String CaptureScreen(WebDriver driver) throws AWTException, IOException {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("ddHHmmss"));
        String folderPath = ("D:\\QA\\Files\\" + reportDate);
        String imagePath = folderPath + "/pic" + time + ".jpg";
        TakesScreenshot oScn = (TakesScreenshot) driver;
        File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
        File oDest = new File(imagePath);
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, oDest);
        return imagePath;
    }


}

