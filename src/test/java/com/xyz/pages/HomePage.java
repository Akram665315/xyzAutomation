package com.xyz.pages;

import com.xyz.base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.xyz.base.TestBase.driver;

public class HomePage extends PageObject{

    @FindBy(css = "[ng-click=\"manager()\"]")
    WebElement bankMangerLoginBtn;

    @FindBy(css = "[ng-click=\"customer()\"]")
    WebElement customerLoginBtn;

    @FindBy(css = "[class=\"mainHeading\"]")
    WebElement mainTittle;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void goToCustomerLogin(){
        customerLoginBtn.click();
        waitInSeconds(1);
    }

   public void goToBankMangerLogin(){
       bankMangerLoginBtn.click();
       waitInSeconds(1);
   }

   public String getMainTittleText(){
        return mainTittle.getText();
   }
}
