package pages;

import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

public class OrderPage extends LoginPage {

    public OrderPage() {

    }



    public void clickTShirts() {
       
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("(//a[@title=\"T-shirts\"])[2]")).click();
       

    }

    public void clickItem(){
        driver.findElement(By.xpath("//img[@title=\"Faded Short Sleeve T-shirts\"]")).click();
    }

    public void clickAddToCart() {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@name=\"Submit\"]")).click();
        driver.switchTo().defaultContent();
    }

    public void proceedToCheckOut() {
        driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")).click();
    }


    public String cartSummary() {
        String item = driver.findElement(By.id("summary_products_quantity")).getText();
        return item;
    }

    public void continueToCheckOut() {
        driver.findElement(By.xpath("//span[text()=\"Proceed to checkout\"]")).click();
    }

    public void processAddress() {
        driver.findElement(By.xpath("//button[@name=\"processAddress\"]")).click();
    }

    public void clickAgree() {
        driver.findElement(By.id("cgv")).click();
    }

    public void clickProcessCarrier() {
        driver.findElement(By.xpath("//button[@name=\"processCarrier\"]")).click();
    }

    public void viewCustomerAccount() {
        driver.findElement(By.xpath("//a[@title=\"View my customer account\"]")).click();
    }

    public void clickOrderHistory() {
        driver.findElement(By.xpath("//a[@title=\"Orders\"]")).click();
    }

    public String getItem() {
        String itemName = driver.findElement(By.xpath(("//a[@class=\"color-myaccount\"]"))).getText();
        return itemName;
    }

}
