package campus.pom.factory;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public WebDriver initializeDriver() {
        WebDriver driver;

        String browser = System.getProperty("browser");

        switch (browser) {
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalStateException("Invalid browser name " + browser);
        }

        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();
        return driver;
    }
}