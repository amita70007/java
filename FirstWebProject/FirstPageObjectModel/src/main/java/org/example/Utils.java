package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;

public class Utils extends BasePage{

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void locateElement(By by){ driver.findElement(by);}

    public static void enterText (By by, String text ){
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement (By by){
        return driver.findElement(by).getText();
    }

    public static void waitForClickable (By by, int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementToBeVisible(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public static void selectFromDropDownMenuByVisibleText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropDownMenuByValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }
    public static void selectFromDropDownMenuByIndex(By by, String index){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(index);
    }






}
