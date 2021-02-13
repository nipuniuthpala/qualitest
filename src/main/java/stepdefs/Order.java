package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.OrderPage;

public class Order {


    OrderPage orderPage=new OrderPage();


    @And("^user order an T-shirt and place the order$")
    public void orderTheItem(){
        orderPage.clickTShirts();
        orderPage.clickItem();
        orderPage.clickAddToCart();
        orderPage.proceedToCheckOut();
        Assert.assertEquals(orderPage.cartSummary(), "1 Product");
        orderPage.continueToCheckOut();
        orderPage.processAddress();
        orderPage.clickAgree();
        orderPage.clickProcessCarrier();
    }

    @Then("^user will see the the order history$")
    public void ValidateOrderHistory(){
        orderPage.viewCustomerAccount();
        orderPage.clickOrderHistory();
        Assert.assertEquals(orderPage.getItem(), "JDIPRMYDY");
    }
}
