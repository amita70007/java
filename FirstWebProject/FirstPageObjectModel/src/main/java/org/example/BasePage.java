package org.example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePage extends LoadProperty {
    //public static WebDriver driver;
    public void openBrowser() throws IOException {

        System.out.println("launching Web browser");
        //new browser setting
        readProperty();
        setBrowser();
        setBrowserConfig();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(Url);

        }
    public void closeBrowser(){
        driver.close();
    }


}
