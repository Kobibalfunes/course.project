package campus.pom.pages;

import campus.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    private final By menuBarProjectBTN = By.xpath("//ul[@id=\"navbarlist\"]/li[2]");
    private final By contactMeBTN = By.xpath("//a[normalize-space()='Contact Me']");
    private final By nameBox = By.cssSelector("input[placeholder='Enter your name']");
    private final By companyBox = By.cssSelector("input[placeholder='Enter your company name']");
    private final By emailBox = By.cssSelector("input[placeholder='Enter your email']");
    private final By textBox = By.xpath("(//textarea[@placeholder='Enter text here'])[1]");
    private final By clearBTN = By.xpath("//button[normalize-space()='Clear']");
    private final By reqPDF = By.xpath("//a[@href='files/Projects/Mobile Project/requirements.pdf']//img");

    private final By resume = By.cssSelector("img[alt='Open resume in a pdf file english']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load() {

        driver.get("https://kobibal.com/index.html");
        return this;
    }
    public HomePage clickMenuBarProjectBTN(){
        driver.findElement(menuBarProjectBTN).click();
        return this;
    }
    public HomePage clickContactMeBTN(){
        driver.findElement(contactMeBTN).click();
        return this;
    }
    public HomePage writeNameBox(){
        driver.findElement(nameBox).sendKeys("Kobi");
        return this;
    }
    public HomePage writeCompanyBox(){
        driver.findElement(companyBox).sendKeys("asdasdasd");
        return this;
    }
    public HomePage writeEmailBox(){
        driver.findElement(emailBox).sendKeys("asdf@asdas.com");
        return this;
    }
    public HomePage writeTextBox(){
        driver.findElement(textBox).sendKeys("asdasd asd as asd asfasf asdf");
        return this;
    }
    public HomePage clickClearBTN(){
        driver.findElement(clearBTN).click();
        return this;
    }
    public HomePage sleep(int numberOfSeconds) throws InterruptedException {
        Thread.sleep(numberOfSeconds);
        return this;
    }
    public HomePage clickReqPDF (){
        driver.findElement(reqPDF).click();
        return this;
    }
    public HomePage goBack(){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        return this;
    }
    public HomePage clickResume(){
        driver.findElement(resume).click();
        return this;
    }
}
