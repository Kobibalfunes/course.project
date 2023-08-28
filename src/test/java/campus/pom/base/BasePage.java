package campus.pom.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void load (){
        driver.get("https://kobibal.com/index.html");
    }

}
