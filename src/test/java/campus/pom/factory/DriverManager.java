package campus.pom.factory;

import campus.pom.constant.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public WebDriver initializeDriver(String browser) {
        WebDriver driver;
        browser = System.getProperty("browser", browser);

        driver = switch (Constants.valueOf(browser)) {
            case CHROME -> driver = new ChromeDriver();
            case FIREFOX -> driver = new FirefoxDriver();
            case EDGE -> driver = new EdgeDriver();
            default -> throw new IllegalStateException("Invalid browser name " + browser);
        };
//        driver.manage().window().setPosition(new Point(2000, 0));
        driver.manage().window().maximize();
        return driver;
    }
}
