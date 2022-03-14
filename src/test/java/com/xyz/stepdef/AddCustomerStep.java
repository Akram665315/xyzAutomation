package com.xyz.stepdef;

import com.xyz.pages.BankMangerPage;
import com.xyz.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.xyz.base.TestBase.driver;

public class AddCustomerStep {

    HomePage homePage = new HomePage();
    BankMangerPage bankMangerPage = new BankMangerPage();

    @Given("user lands on xyz bank homepage")
    public void user_lands_on_xyz_bank_homepage() throws InterruptedException {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(3000);
    }

    @Given("click on bank manger login")
    public void click_on_bank_manger_login() {
        homePage.goToBankMangerLogin();
    }

    @Given("click add customer")
    public void click_add_customer() {
        bankMangerPage.clickAddCustomerHeaderLink();
    }

    @Given("enter valid info then click add customer")
    public void enter_valid_info_then_click_add_customer() {
        bankMangerPage.enterAddNewCustomerInfo("Akram", "Nuradeen", "20147");
    }

    @Then("verify customer has been added")
    public void verify_customer_has_been_added() {
        String actualText = driver.switchTo().alert().getText();
        Assert.assertTrue(actualText.contains("added"));
    }

}
