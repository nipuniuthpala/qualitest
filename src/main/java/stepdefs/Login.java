package stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class Login {

LoginPage loginPage=new LoginPage();
    @BeforeMethod
    @Given("^user is on the website$")

        public void login(){
        loginPage.loadDriver();
        loginPage.loadUrl();


    }
    @BeforeMethod
    @When("^the user clicks on sign in and sign with username and password$")
    public void submitUsernamePassword(){
        loginPage.clickSignIn();
        loginPage.setUserName("nipuniuthpala@gmail.com");
        loginPage.setPassword("Test1234");
        loginPage.clickSubmit();

    }

    @AfterMethod
    @Then("^user closes the browser$")
    public void quit(){
        loginPage.quitDriver();



    }




}
