package campus.pom;

import campus.pom.base.BasePage;
import campus.pom.base.BaseTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class CaseTest extends BaseTest {


    @FindBy(xpath = "//ul[@id=\"navbarlist\"]/li[2]")
    WebElement menuBarProjectBTN;

    @FindBy(xpath = "//a[normalize-space()='Contact Me']")
    WebElement contactMe;

    @FindBy(css = "input[placeholder='Enter your name']")
    WebElement nameBox;

    @FindBy(css = "input[placeholder='Enter your company name']")
    WebElement companyBox;
    @FindBy(css = "input[placeholder='Enter your email']")
    WebElement emailBox;
    @FindBy(xpath = "(//textarea[@placeholder='Enter text here'])[1]")
    WebElement textBox;
    @FindBy(css = "button[type='submit']")
    WebElement submitBTN;
    @FindBy(xpath = "//button[normalize-space()='Clear']")
    WebElement clearBTN;
    @FindBy(xpath = "//a[@href='files/Projects/Mobile Project/requirements.pdf']//img")
    WebElement reqPDF;
    @FindBy(xpath = "//a[@href='files/Projects/Mobile Project/myVisit STR.pdf']//img")
    WebElement strPDF;


    @Test
    public void asdad() throws InterruptedException, IOException, AWTException {
        new BasePage(driver).load();
        menuBarProjectBTN.click();
        contactMe.click();
        nameBox.sendKeys("Kobi");
        companyBox.sendKeys("The King");
        emailBox.sendKeys("asd@asd.com");
        textBox.sendKeys("asdas asd as das dasd asd asd asd ");
        clearBTN.click();
        menuBarProjectBTN.click();
        reqPDF.click();
        driver.navigate().back();
        Thread.sleep(1000);



                Thread.sleep(3000);


    }

}
