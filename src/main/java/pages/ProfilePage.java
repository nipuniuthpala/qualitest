package pages;

import org.openqa.selenium.By;


public class ProfilePage extends LoginPage {




    public ProfilePage() {

    }

    public void clickProfile() {
        driver.findElement(By.xpath("//a[@title=\"View my customer account\"]")).click();
    }

    public void clickMyAccount() {
        driver.findElement(By.xpath("//a[@title=\"Information\"]")).click();
    }

    public void editFirstName(String name) {
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys(name);
    }

    public void editPassword(String password) {
        driver.findElement(By.id("old_passwd")).sendKeys(password);
    }

    public void clickSave() {
        driver.findElement(By.xpath("//button[@name=\"submitIdentity\"]")).click();
    }

    public String getTextMyAccount() {
        String name = driver.findElement(By.xpath("//a[@title=\"View my customer account\"]")).getText();
        return name;
    }

}
