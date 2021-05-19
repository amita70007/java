package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    // click on register button link from homepage
    public void clickRegister() {
        clickOnElement(By.linkText("Register"));
    }



}