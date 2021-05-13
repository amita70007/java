package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils{

    public void fillRegistrationForm() throws InterruptedException {
        // click gender
        Thread.sleep(2000);
        waitForClickable(By.xpath("//input[@id='gender-male']"),3000);
        clickOnElement(By.xpath("//input[@id='gender-male']"));

        // fill first name and last name
        Thread.sleep(2000);
        waitForClickable(By.xpath("//input[@id='FirstName']"),2000);
        enterText(By.xpath("//input[@id='FirstName']"),"Vijay");
        Thread.sleep(2000);
        waitForClickable(By.xpath("//input[@id='FirstName']"),1000);
        enterText(By.xpath("//input[@id='LastName']"),"Patel");

        //Dropdown menu DOB selection
        selectFromDropDownMenuByVisibleText(By.name("DateOfBirthDay"),"15");
        selectFromDropDownMenuByVisibleText(By.name("DateOfBirthMonth"),"May");
        selectFromDropDownMenuByVisibleText(By.name("DateOfBirthYear"),"1970");

        //email address input
        enterText(By.xpath("//input[@id='Email']"),"testing"+timestamp.getTime()+"@test.com");

        //enter company name
        enterText(By.id("Company"),"Navu Limited");

        //newsleter selection
        clickOnElement(By.id("Newsletter"));

        //fill out the password input box
        enterText(By.id("Password"),"test2test");
        enterText(By.id("ConfirmPassword"),"test2test");

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
