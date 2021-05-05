package com.amitatesting.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;


public class HomeWork1 {

    //setting up web browser
    public String baseUrl = "https://demo.nopcommerce.com/";
    String driverPath = "src\\test\\Resources\\Browser\\chromedriver.exe";
    public WebDriver driver ;

    @BeforeMethod
    //@BeforeTest
    //open web browser function
    public void openBrowser() {
        System.out.println("launching Web browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test
        public void verifyMcbookPrice(){
        driver.get(baseUrl);
        // find price of Apple MacBook Pro 13-inch
        //driver.findElement(By.xpath("//div[@class='header-logo']"));
        String expectedPrice = "$2,000.00";
        String actualPrice = driver.findElement(By.xpath("(//span[@class='price actual-price'])[2]")).getText();
        //checking price with expected price
        Assert.assertEquals(actualPrice,expectedPrice);
    }

    @Test
        public void buidOwnComputer(){
        //opening home page
        driver.get(baseUrl);

        // clicking build your own computer link
        driver.findElement(By.linkText("Build your own computer")).click();

        //selecting processor 2.2GHz by using select methom from dropdown menu
        Select SelectProcessor= new Select(driver.findElement(By.id("product_attribute_1")));
        SelectProcessor.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");

        //selecting Ram from dropdown menu
        Select SelectRAM= new Select(driver.findElement(By.id("product_attribute_2")));
        SelectRAM.selectByVisibleText("4GB [+$20.00]");

        //HDD select
        driver.findElement(By.id("product_attribute_3_6")).click();

        //OS select
        driver.findElement(By.id("product_attribute_4_9")).click();

        // Software select ticking
        driver.findElement(By.id("product_attribute_5_11")).click();
        driver.findElement(By.id("product_attribute_5_12")).click();

        // add to cart button click
        driver.findElement(By.id("add-to-cart-button-1")).click();

        // successful add cart check
        String addCartSuccess = driver.findElement(By.xpath("//div[@class='bar-notification success']")).getText();
        System.out.println(addCartSuccess);
        String successMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(successMessage,addCartSuccess, "add cart is successfull");

    }

    @Test
    public void VerifyRegisterPage1() {
        //timestamp function to use current time
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        driver.get(baseUrl);

        // click on register link to go to register page
        driver.findElement(By.linkText("Register")).click();

        // fill out form on register page
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("register-button"))));
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vijay");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");

        //DropDown menu selection for DOB
        Select SelectDay= new Select(driver.findElement(By.name("DateOfBirthDay")));
        //SelectDay.selectByVisibleText("26");
        SelectDay.selectByValue("26");
        Select SelectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        SelectMonth.selectByVisibleText("May");
        Select SelectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        SelectYear.selectByVisibleText("1970");

        //give input to below boxes
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("testing"+timestamp.getTime()+"@test.com");
        System.out.println("Email used: testing"+timestamp.getTime()+"@test.com");

        driver.findElement(By.id("Company")).sendKeys("Navu ltd");
        driver.findElement(By.id("Newsletter")).click();
        //WebDriverWait wait=new WebDriverWait(driver,20);

        driver.findElement(By.id("Password")).sendKeys("test2test");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test2test");
        driver.findElement(By.name("register-button")).click();
        String expectedTitleText = "Your registration completed";
        String titleTextActual = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(titleTextActual);
        Assert.assertEquals(titleTextActual,expectedTitleText, "Your test case is failed");

    }

    @Test
    public void compareProductTest() throws InterruptedException {

        driver.get(baseUrl);
        driver.findElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[2]")).click();
        driver.findElement(By.linkText("product comparison")).click();
        String expectedTitle = "Compare products";
        String actualTitle = driver.findElement(By.xpath("//div[h1=('Compare products')]")).getText();
        Assert.assertEquals(actualTitle,expectedTitle, "you are not on comparison page");
        //clearing product list
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/a")).click();
        String expectedResult2 = "You have no items to compare.";
        String actualResult2 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div")).getText();
        Assert.assertEquals(actualResult2,expectedResult2);

    }

    @AfterMethod
    //@AfterTest
    public void closeBrowser(){
        driver.close();
    }

}
