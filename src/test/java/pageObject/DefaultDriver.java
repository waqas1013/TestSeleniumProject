package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import utility.Helper;

import java.util.Optional;

public class DefaultDriver {
    private WebDriver webDriver;
    public WebDriver launchURL(Optional<String> browserMode) {
        if (browserMode.isPresent()) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable-gpu");
            webDriver = new ChromeDriver(chromeOptions);
        } else {
            System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
            webDriver = new SafariDriver();
        }
        webDriver.manage().window().maximize();
        webDriver.get(new Helper().readDataFromFile("url"));
        return webDriver;
    }

    public void tearDown(){
        webDriver.quit();
    }
}
