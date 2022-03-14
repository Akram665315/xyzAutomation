package com.xyz.stepdef;

import com.xyz.pages.BankMangerPage;
import com.xyz.pages.HomePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HeaderLinksStep {

    BankMangerPage bankMangerPage = new BankMangerPage();

    @Then("verify that all {int} headerLinks are visible")
    public void verifyThatAllHeaderLinksAreVisible(int arg0) {
        String actualText1 = bankMangerPage.getOpenAccountHeaderText();
        String actualText2 = bankMangerPage.getAddCustomerHeaderText();
        String actualText3 = bankMangerPage.getCustomerHeaderText();
        Assert.assertTrue(actualText1.contains("Open"));
        Assert.assertTrue(actualText2.contains("Customer"));
        Assert.assertTrue(actualText3.contains("Customers"));
    }
}
