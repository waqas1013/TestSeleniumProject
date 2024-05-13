package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Helper {
    public String readDataFromFile(String propertyKey) {
        String propertyValue = "";

        try{
            InputStream input = new FileInputStream("/Users/waqas/Development/SeleniumProjects/TestSeleniumProject/src/test/resources/test_data/login_details");
            Properties prop = new Properties();
            prop.load(input);
            propertyValue = prop.getProperty(propertyKey);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return propertyValue;
    }
}
