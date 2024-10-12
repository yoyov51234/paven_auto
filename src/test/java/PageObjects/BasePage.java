package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this); // 代码的这里我不太理解 ， 你能讲给我听吗？  就是 this 代表的是 这个实体吗？ 这个basepage的实体？
    }
}
