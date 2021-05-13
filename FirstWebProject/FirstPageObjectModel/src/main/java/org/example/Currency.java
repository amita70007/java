package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Currency extends Utils {
    public String currentCurrency;
    public String changedCurrency;

    public void changeCurrency() {

        clickOnElement(By.xpath("//select[@id='customerCurrency']"));
        //change currency
        selectFromDropDownMenuByVisibleText(By.xpath("//select[@id='customerCurrency']"),"Euro");

        //currentCurrency2 = driver.findElement(By.xpath("//span[contains(text(),'€1032.00')]")).getText();
        //Assert.assertEquals(currentCurrency2.charAt(0),'€');


    }
    public void verifyCurrencyChange(){
        waitForElementToBeVisible(By.xpath("//span[contains(text(),'€1032.00')]"),3000);
        changedCurrency = getTextFromElement(By.xpath("//span[contains(text(),'€1032.00')]"));
        Assert.assertEquals(changedCurrency.charAt(0),'€');


    }
}