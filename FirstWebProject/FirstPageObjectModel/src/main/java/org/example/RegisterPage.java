package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

public class RegisterPage extends Utils{


    public void fillRegistrationForm() throws InterruptedException, IOException {
        readProperty();

        // click gender
        Thread.sleep(2000);
        waitForClickable(By.xpath("//input[@id='gender-male']"),3000);
        clickOnElement(By.xpath("//input[@id='gender-male']"));

        // fill first name and last name
        Thread.sleep(2000);
        //waitForClickable(By.xpath("//input[@id='FirstName']"),2000);
        enterText(By.xpath("//input[@id='FirstName']"),FirstName);
        Thread.sleep(2000);
        //waitForClickable(By.xpath("//input[@id='FirstName']"),1000);
        enterText(By.xpath("//input[@id='LastName']"),LastName);

        //Dropdown menu DOB selection
        selectFromDropDownMenuByVisibleText(By.name("DateOfBirthDay"),DateOfBirthDay);
        selectFromDropDownMenuByVisibleText(By.name("DateOfBirthMonth"),DateOfBirthMonth);
        selectFromDropDownMenuByVisibleText(By.name("DateOfBirthYear"),DateOfBirthYear);

        //email address input
        enterText(By.xpath("//input[@id='Email']"),"testing"+timestamp.getTime()+"@test.com");

        //enter company name
        enterText(By.id("Company"),Company);

        //newsleter selection
        clickOnElement(By.id("Newsletter"));

        //fill out the password input box
        enterText(By.id("Password"),Password);
        enterText(By.id("ConfirmPassword"),Password);

        //click on register button
        waitForClickable(By.name("register-button"),2000);
        clickOnElement(By.name("register-button"));

    }

    public void registrationSuccessfull(){
        String expectedTitleText = "Your registration completed";
        String titleTextActual = getTextFromElement(By.xpath("//div[@class='result']"));
        //System.out.println(titleTextActual);
        Assert.assertEquals(titleTextActual,expectedTitleText, "Your test case is failed");



    }


}
