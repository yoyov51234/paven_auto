package TestBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public Logger logger; //注意这里的 导入的包
        //   import org.apache.logging.log4j.LogManager;
        //import org.apache.logging.log4j.Logger;
    public Properties p;


    @BeforeClass
    @Parameters({"os","browser"})
    public void setup(@Optional String os, String browser) throws IOException {
        try {

            //loading config.properties file
            FileReader file = new FileReader("./src//test//resources//config.properties");
            p = new Properties();
            p.load(file);

            logger = LogManager.getLogger(this.getClass());
            System.out.println(logger);

            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser name");
                    return;
            }


            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://tutorialsninja.com/demo");
            driver.get(p.getProperty("appURL"));
            driver.manage().window().maximize();

            //这里应该验证url是否打开, 第二个URL现在没法知道， 所以这里通过了实际上不可以的
            Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/");

        } catch (Exception ae){
            logger.error("normal exception:", ae);

        } catch (AssertionError e){
            logger.error("assertion error:",e);
            Assert.fail("failed", e);
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    public String randomString(int count){
        return  RandomStringUtils.randomAlphabetic(count);
    }

    public String randomNumber(int count){
        return  RandomStringUtils.randomNumeric(count);
    }

    public String randomAlphanumeric(int count){

        return  RandomStringUtils.randomAlphanumeric(count);
    }
}
