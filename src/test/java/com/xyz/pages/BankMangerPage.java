package com.xyz.pages;

import com.xyz.base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.util.Strings;

import static com.xyz.base.TestBase.driver;

public class BankMangerPage extends PageObject{
    @FindBy(css = "[ng-class=\"btnClass1\"]")
    WebElement addCustomer_headerLink;

    @FindBy(css = "[ng-model=\"fName\"]")
    WebElement firstname_textField;

    @FindBy(css = "[ng-model=\"lName\"]")
    WebElement lastname_textField;

    @FindBy(css = "[ng-model=\"postCd\"]")
    WebElement zipCode_textField;

    @FindBy(css = "[class=\"btn btn-default\"]")
    WebElement addCustomerBtn;

    @FindBy(css = "[ng-class=\"btnClass2\"]")
    WebElement openAccount_headerLink;

    @FindBy(id = "userSelect")
    WebElement customerSelectDropdown;

    @FindBy(id = "currency")
    WebElement currencySelectDropdown;

    @FindBy(css = "[type=\"submit\"]")
    WebElement processBtn;

    @FindBy(css = "[ng-class=\"btnClass3\"]")
    WebElement customers_headerLink;


    public BankMangerPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickAddCustomerHeaderLink(){
        addCustomer_headerLink.click();
        waitInSeconds(1);
    }

    public void enterAddNewCustomerInfo(String firstname,String lastname,String zipcode){
        firstname_textField.sendKeys(firstname);
        lastname_textField.sendKeys(lastname);
        zipCode_textField.sendKeys(zipcode);
        addCustomerBtn.click();
        waitInSeconds(1);
    }

    public void clickOpenAccountModal(){
        openAccount_headerLink.click();
        waitInSeconds(1);
    }

    public void selectValidInfoThenSubmitInfo(){
        Select customerDropdown = new Select(customerSelectDropdown);
        Select currencyDropdown = new Select(currencySelectDropdown);
        customerDropdown.selectByIndex(5);
        waitInSeconds(1);
        currencyDropdown.selectByIndex(1);
        waitInSeconds(1);
        processBtn.click();
        waitInSeconds(1);
    }

    public String getAddCustomerHeaderText(){
        return addCustomer_headerLink.getText();
    }

    public String getOpenAccountHeaderText(){
        return openAccount_headerLink.getText();
    }

    public String getCustomerHeaderText(){
        return customers_headerLink.getText();
    }



}