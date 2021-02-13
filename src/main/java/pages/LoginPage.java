package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class LoginPage {


    protected static WebDriver driver;
    public LoginPage(){}



    public  void loadDriver(){
         driver=utilities.DriverFactory.open("chrome");
         driver.manage().window().maximize();
    }

    public void loadUrl(){
        driver.get("http://automationpractice.com/");
    }

    public void clickSignIn(){

        driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
    }

    public void setUserName(String userName){
        driver.findElement(By.id("email")).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    public void clickSubmit(){
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public void quitDriver(){
        driver.quit();
}


    public static boolean takeScreenshot(final String name)
    {
        String screenshotDirectory = System.getProperty("screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
    }
}
