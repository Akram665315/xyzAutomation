package com.xyz.stepdef;

import com.xyz.pages.BankMangerPage;
import com.xyz.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.xyz.base.TestBase.driver;

public class OpenAccountStep {

    BankMangerPage bankMangerPage = new BankMangerPage();

    @And("click on open account header link")
    public void clickOnOpenAccountHeaderLink() {
        bankMangerPage.clickOpenAccountModal();
    }

    @And("select a customer name and currency then click the process")
    public void selectACustomerNameAndCurrencyThenClickTheProcess() {
        bankMangerPage.selectValidInfoThenSubmitInfo();
    }

    @Then("verify account has been opened")
    public void verifyAccountHasBeenOpened() {
        String actualText = driver.switchTo().alert().getText();
        Assert.assertTrue(actualText.contains("successfully"));
    }
}
