package com.xyz.pages;

import com.xyz.base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.xyz.base.TestBase.driver;

public class CustomerPage extends PageObject {

    @FindBy(id = "userSelect")
    WebElement customerSelectNameDropdown;

    @FindBy(css = "[class=\"btn btn-default\"]")
    WebElement loginBtn;

    @FindBy(css = "[class=\"fontBig ng-binding\"]")
    WebElement welcome_headerText;

    @FindBy(css = "[ng-click=\"home()\"]")
    WebElement homeBtn_onWelcomePage;

    public CustomerPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectCustomerName() {
        Select customerNameDropdown = new Select(customerSelectNameDropdown);
        customerNameDropdown.selectByIndex(1);
        waitInSeconds(1);
        loginBtn.click();
        waitInSeconds(1);
    }

    public String getWelcomeText(){
        return welcome_headerText.getText();
    }

    public String getHomeBtnText(){
        return  homeBtn_onWelcomePage.getText();
    }
}
