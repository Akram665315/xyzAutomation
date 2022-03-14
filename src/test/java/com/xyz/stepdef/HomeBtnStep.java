package com.xyz.stepdef;

import com.xyz.pages.CustomerPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomeBtnStep {

    CustomerPage customerPage = new CustomerPage();

    @Then("verify that home button is visible on the welcome page")
    public void verifyThatHomeButtonIsVisibleOnTheWelcomePage() {
    String actualText = customerPage.getHomeBtnText();
        Assert.assertTrue(actualText.contains("Home"));
    }
}
