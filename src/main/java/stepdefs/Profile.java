package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProfilePage;

public class Profile {

    ProfilePage profilePage=new ProfilePage();

    @When("^the user clicks on profile$")
    public void clickProfile(){
        profilePage.clickProfile();

    }

    @And("^user clicks on my personal information$")
    public void clickMyProfile(){
        profilePage.clickMyAccount();

    }

    @And("^user change the first name and save$")
    public void editMyProfile(){
        profilePage.editFirstName("NipuniEdit");
        profilePage.editPassword("Test1234");
        profilePage.clickSave();
    }

    @And("^user will see edited name$")
    public void validateEditMyProfile(){
        Assert.assertEquals(profilePage.getTextMyAccount(), "Nipuniedit Gunatilake");
    }

}
