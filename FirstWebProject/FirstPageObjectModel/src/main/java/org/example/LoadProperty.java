package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    static String browser;
    static WebDriver driver;
    public static String FirstName;
    public static String LastName;
    static String DateOfBirthDay;
    static String DateOfBirthMonth;
    static String DateOfBirthYear;
    static String Company;
    static String Password;
    static String Url;




    public static void readProperty() throws IOException {
        Properties prop=new Properties();
        FileInputStream ip= new FileInputStream("src\\test\\Resources\\TestData\\config.properties");
        //FileInputStream ip= new FileInputStream("C:\\Users\\NAVYA\\IdeaProjects\\FirstObjectModel\\src\\test\\Resources\\TestData\\config.properties");
        prop.load(ip);
        FirstName = prop.getProperty("FirstName");
        LastName = prop.getProperty("LastName");
        DateOfBirthDay = prop.getProperty("DateOfBirthDay");
        DateOfBirthMonth = prop.getProperty("DateOfBirthMonth");
        DateOfBirthYear = prop.getProperty("DateOfBirthYear");
        Company = prop.getProperty("Company");
        Password = prop.getProperty("Password");
        Url = prop.getProperty("url");

    }
    public static void setBrowser() throws IOException {
        Properties prop=new Properties();
        FileInputStream ip= new FileInputStream("src\\test\\Resources\\TestData\\config.properties");
        //FileInputStream ip= new FileInputStream("C:\\Users\\NAVYA\\IdeaProjects\\FirstObjectModel\\src\\test\\Resources\\TestData\\config.properties");
        prop.load(ip);
        browser = prop.getProperty("browser");
    }
    public static void setBrowserConfig(){

        if(browser.contains("Chrome")){
            // Chrome browser setting
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.contains("Firefox")){
            // Firefox driver setting
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Browser\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.contains("IE")){
            // Defining System Property for the IEDriver
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\Browser\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }
        else if(browser.contains("Edge")){
            // Set Edge the driver path
            System.setProperty("webdriver.edge.driver", "src\\test\\Resources\\Browser\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
    }
    public static void setUrl(){

    }




}
