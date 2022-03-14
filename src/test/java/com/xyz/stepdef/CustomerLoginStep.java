package com.xyz.stepdef;

import com.xyz.pages.CustomerPage;
import com.xyz.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.xyz.base.TestBase.driver;

public class CustomerLoginStep {

    HomePage homePage = new HomePage();
    CustomerPage customerPage = new CustomerPage();

    @And("click customer login")
    public void clickCustomerLogin() {
        homePage.goToCustomerLogin();
    }

    @And("select a customer then click login")
    public void selectACustomerThenClickLogin() {
        customerPage.selectCustomerName();
    }

    @Then("verify that customer is logged in")
    public void verifyThatCustomerIsLoggedIn() {
        String actualText = customerPage.getWelcomeText();
        Assert.assertTrue(actualText.contains("Hermoine"));
    }
}
