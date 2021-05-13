package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductSearch extends Utils {
    static String searchWord;
    public void productName(String searchWord) throws InterruptedException {


        // search product with name of nike
        enterText(By.xpath("//input[@id='small-searchterms']"), searchWord);
        clickOnElement(By.cssSelector("button[type='submit']"));
        Thread.sleep(2000);
    }
    public void productVerify(){
        List<WebElement> elements = null;
        //checking all product listed after search
        List<WebElement> products = driver.findElements(By.className("item-box"));
        boolean result1 = false;
        for (WebElement product : products) {
            //System.out.println(product.getText());
            if (product.getText().toLowerCase().contains("nike")) {
                result1 = Boolean.TRUE;
            } else {
                result1 = Boolean.FALSE;
            }
        }
        if (result1);{
            System.out.println("YES! All product contain word :"+searchWord);
        }
        Assert.assertTrue(result1);
    }
}