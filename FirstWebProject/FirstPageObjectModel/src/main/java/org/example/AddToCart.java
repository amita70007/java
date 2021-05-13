package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AddToCart extends Utils {

    public void addCartCheck() throws InterruptedException {
        // click on computer

       clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
       // driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
        Thread.sleep(2000);

        //click on notbook
        waitForClickable(By.xpath("//li[@class='inactive']//a[normalize-space()='Notebooks']"),5000);
        clickOnElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Notebooks']"));
        //driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Notebooks']")).click();
        Thread.sleep(2000);

        //click on software
        waitForClickable(By.xpath("//li[@class='inactive']//a[normalize-space()='Software']"),5000);
        clickOnElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Software']"));

        Thread.sleep(2000);

        //List<WebElement> elementName2 = driver.findElements(By.className("item-box"));

        //finding no of elements found & checking add to cart button
        List<WebElement> products2 = driver.findElements(By.className("item-box"));
        System.out.println("No of pruduct found is :"+ products2.size());
        boolean result2 = false;
        for(WebElement product:products2) {

            if (product.getText().toLowerCase().contains("add to cart")) {
                            }
            else {
                result2 = true;
                System.out.println("** Product which does not have Add to Car to Cart button :>> "+product.getText()+ " <<");
            }

        }
        if (!result2){
            System.out.println("*****************************************");
            System.out.println("YES! All product has Add to Cart Button");
            System.out.println("*****************************************");
        }
        else{
            System.out.println("*****************************************");
            System.out.println("NO! All products do not have Add to Cart Button");
            System.out.println("*****************************************");
        }
        Assert.assertFalse(result2);
    }

}
