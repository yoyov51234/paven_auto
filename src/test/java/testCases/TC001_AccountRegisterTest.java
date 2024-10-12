package testCases;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import TestBase.BaseClass;
import org.apache.poi.xddf.usermodel.chart.XDDFErrorBars;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC001_AccountRegisterTest extends BaseClass {

    /*   // 如果 BaseClass 只有默认构造函数，则此构造函数是多余的*/
//     TC001_AccountRegisterTest(){
//           super();
//       }

    @Test
    public void verify_account_registration(){

        try{

            logger.info("***** Staring  TC001_AccountRegisterTest ****");

            HomePage homePage = new HomePage(driver);
            homePage.clickMyAccount();
            logger.info("Clicked on My Account Link");
            homePage.clickRegister();
            logger.info("Clicked on Register Link");



            RegisterPage registerPag = new RegisterPage(driver);
            logger.info("Providing customer details");
            String email= randomString(10).concat("@163.com");

            registerPag.sendEmail(email);
//            registerPag.sendEmail(p.getProperty("email"));

            registerPag.sendFirstName(randomString(5).toUpperCase());
            registerPag.sendLastName(randomString(6).toUpperCase());
            registerPag.sendPhone(randomNumber(10));
            String pwd= randomAlphanumeric(10);

            System.out.println(email +' ' + pwd);

            registerPag.sendPWD(pwd);
            registerPag.confirmPWD(pwd);

            registerPag.checkAgree();
            registerPag.clickContinue();

            logger.info("Validating expected message");
            String confmsg= registerPag.getConfirmationMessage();

//            Assert.assertEquals(confmsg, "Your Account Has Been Created!");

            if(confmsg.equals("Your Account Has Been Created!")){
                Assert.assertTrue(true);
            } else{

//                Assert.assertTrue(false);

                logger.error("Test failed.."); //这里
                // 没有异常抛出呀 怎么看
                logger.debug("debug log is printing  ...");
                Assert.assertTrue(false);
            }

        } catch (AssertionError e){
            logger.error("error message", e);

            Assert.fail();


        }

        logger.info("***** Ending  TC001_AccountRegisterTest ****");



    }


}
