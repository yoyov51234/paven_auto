package Practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {


    public static void main(String[] args) {
        Logger logger= LogManager.getLogger();
        System.out.println(logger);

    }

}
