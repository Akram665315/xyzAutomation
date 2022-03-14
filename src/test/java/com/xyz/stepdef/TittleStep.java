package com.xyz.stepdef;

import com.xyz.pages.HomePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TittleStep {

    HomePage homePage = new HomePage();

    @Then("verify that tittle is visible")
    public void verifyThatTittleIsVisible() {
        String actualText = homePage.getMainTittleText();
        Assert.assertTrue(actualText.contains("Bank"));
    }
}
