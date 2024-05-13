package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Helper;

public class LoginScreen {
    private final WebDriver webDriver;
    private final Helper helper;

    public LoginScreen(WebDriver webDriver) {
        this.webDriver = webDriver;
        helper = new Helper();
    }
    public void enterLoginDetails() {
        webDriver.findElement(By.name("uid")).sendKeys(helper.readDataFromFile("username"));
        webDriver.findElement(By.name("password")).sendKeys(helper.readDataFromFile("password"));
        //webDriver.findElement(By.name("btnLogin")).click();
    }
}