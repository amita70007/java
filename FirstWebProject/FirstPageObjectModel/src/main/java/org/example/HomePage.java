package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    /*public void openBrowser() {
        System.out.println("launching Web browser");
        // Chrome browser setting

        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browser\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }*/


    public void clickRegister() {
        clickOnElement(By.linkText("Register"));
    }



}