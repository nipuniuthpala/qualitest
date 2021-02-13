package utilities;

import common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver open(String browserType){
        if(browserType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER );
            return new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER );
            return new ChromeDriver();
        }

    }
}
