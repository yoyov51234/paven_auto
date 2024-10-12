package PageObjects;

import TestBase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // constructor
    public LoginPage(WebDriver driver){
       super(driver);
    }

    //locators
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement textPwd;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement btnLogin;




    //actions
    public void sendEmail(String email){
        txtEmail.sendKeys(email);
//        txtEmail.sendKeys(p.getProperty("email2");

    }

    public void sendPwd(String pwd){
        txtEmail.sendKeys(pwd);

    }

    public  void  clickLoginBtn(){
        btnLogin.click();
    }
}
