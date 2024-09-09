package com.example.assesmentpaydai;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class selenium {
    public static void main(String[] args) {


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");

//        String baseURL = "https://learn.letskodeit.com";
//        WebDriver driver;
//
//        System.setProperty("webdriver.chrome.driver", "/Users/atomar/Documents/workspace_personal/libs/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.get(baseURL);
//        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
//        driver.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");
//
//        // Quit the browser after actions are completed
//        driver.quit();


    }
}
