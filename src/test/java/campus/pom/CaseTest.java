package campus.pom;

import campus.pom.base.BaseTest;
import campus.pom.pages.HomePage;
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
    public void test() throws InterruptedException, IOException, AWTException {
        HomePage homePage = new HomePage(driver);
/*        homePage.load().
                clickMenuBarProjectBTN().
                clickContactMeBTN().
                writeNameBox().
                writeCompanyBox().
                writeEmailBox().
                writeTextBox().
                sleep(2000).
                clickClearBTN().
                clickMenuBarProjectBTN().
                clickReqPDF().
                sleep(1000).
                goBack().
                load().
                clickResume().
                sleep(1000)
                .goBack();*/

        homePage.load();
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
