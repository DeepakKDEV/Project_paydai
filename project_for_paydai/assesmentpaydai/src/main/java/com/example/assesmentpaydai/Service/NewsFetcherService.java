package com.example.assesmentpaydai.Service;
import com.example.assesmentpaydai.Model.NewsArticlee;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class NewsFetcherService {

    public List<NewsArticlee> fetchNewsArticles(String query) {

        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<NewsArticlee> newsArticles = new ArrayList<>();

        driver.get("https://news.google.com/");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/main/div[2]"));
        searchBox.sendKeys(query);
        searchBox.submit();


        try {
            Thread.sleep(2000); // Adjust as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> articles = driver.findElements(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/main/div[2]"));

        for (WebElement article : articles) {
            String url = article.getAttribute("href");
            if (url != null && !url.contains("google.com")) {  // Filter out ad results
                newsArticles.add(new NewsArticlee(url));
            }
        }

        // Ensure the WebDriver is closed properly
        driver.quit();

        return newsArticles;
    }

}

