package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    HomePage homepage = new HomePage();
    RegisterPage register = new RegisterPage();

    @BeforeMethod
    public void open_browser(){
        homepage.openBrowser();
    }


    @AfterMethod
    public void close_browser(){

        homepage.closeBrowser();
    }
}
