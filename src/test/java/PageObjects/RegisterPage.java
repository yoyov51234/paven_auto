package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage{

    //constructor
    public RegisterPage(WebDriver driver){
        super(driver);
    }


    //locators
    @FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
    WebElement txt_Firstname;

    @FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
    WebElement txt_lastname;

    @FindBy(how = How.XPATH, using = "//input[@id='input-email']")
    WebElement txt_email;

    @FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
    WebElement txt_telephone;
    @FindBy(how = How.XPATH, using = "//input[@id='input-password']")
    WebElement txt_pwd;
    @FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
    WebElement txt_pwd_confirm;
    @FindBy(how = How.XPATH, using = "//input[@name='agree']")
    WebElement checkbox_agree;
    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    WebElement btn_Continue;

    @FindBy(xpath = "//*[@id='content']/h1")
    WebElement msgConfirmation;


    //actions
    public void  sendFirstName(String firstName){
        txt_Firstname.sendKeys(firstName);
    }
    public void  sendLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }
    public void  sendEmail(String email){
        txt_email.sendKeys(email);
    }
    public void  sendPhone(String phone){
        txt_telephone.sendKeys(phone);
    }
    public void  sendPWD(String pwd){
        txt_pwd.sendKeys(pwd);
    }
    public void  confirmPWD(String pwd){
        txt_pwd_confirm.sendKeys(pwd);
    }

    public  void  checkAgree(){
        checkbox_agree.click();
    }

    public  void  clickContinue(){
        //sol1
        btn_Continue.click();
    }
    public String getConfirmationMessage(){
        try {return msgConfirmation.getText();


    } catch (Exception e){
        return e.getMessage();
        }
    }


}
