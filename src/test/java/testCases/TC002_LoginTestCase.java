package testCases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_LoginTestCase extends BaseClass {

    @Test
    public void verifyLogin( ){
        try {
            //go to home page and click login
            logger.info("****starting  TC002*******");

            logger.info("go to home page and click login");
            HomePage homePage = new HomePage(this.driver);
            homePage.clickMyAccount();
            homePage.clickLogin();

            //pass the credentials
            logger.info("pass the credentials");
            LoginPage lg = new LoginPage(this.driver);
            lg.sendEmail(p.getProperty("email2"));
            lg.sendPwd(p.getProperty("password2"));
            lg.clickLoginBtn();

            MyAccountPage myAccountPage = new MyAccountPage(driver);


            //validate the Myaccount page is shown
            logger.info("validate the MyAccount page is shown");
            Assert.assertTrue(myAccountPage.myAccountDisplayed());
        } catch (AssertionError e){
            logger.error("Debug coming",e.getMessage());
            Assert.fail("Test failed due to assertion error: " + e.getMessage());
//            logger.e?
        }

        logger.info("****FINISH  TC002*******");


    }
}
