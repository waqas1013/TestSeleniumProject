package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.DefaultDriver;
import pageObject.LoginScreen;
import java.util.Optional;

public class LoginTest {
    public DefaultDriver defaultDriver;
    public LoginScreen loginScreen;

    @BeforeTest
    public void setupDriver(){
        defaultDriver = new DefaultDriver();
    }

    @BeforeMethod
    public void setupBrowser(){
        WebDriver webDriver = defaultDriver.launchURL(Optional.ofNullable(System.getProperty("browserMode")));
        loginScreen = new LoginScreen(webDriver);
    }
    @Test
    public void testLogin(){
        loginScreen.enterLoginDetails();
        defaultDriver.tearDown();
    }

}
