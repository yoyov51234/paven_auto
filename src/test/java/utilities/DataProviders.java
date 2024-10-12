package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    @DataProvider(name="LoginData")
    public String[][] getData() throws IOException {
        // taking xls file from testData
        String path =".\\testData\\Opencart_LoginData.xlsx";



        return new String[0][];
    }


    
}
