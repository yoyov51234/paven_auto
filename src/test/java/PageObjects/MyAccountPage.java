package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MyAccountPage extends BasePage{

    // constructor
    public MyAccountPage(WebDriver driver){
        super(driver);

    }

    //locators
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement msgHeading;

    //action

    public boolean myAccountDisplayed(){
        try{return   msgHeading.isDisplayed();}
        catch (Exception e){
            return  false;
        }


    }


}


