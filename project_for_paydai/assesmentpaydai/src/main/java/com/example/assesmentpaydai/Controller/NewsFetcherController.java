package com.example.assesmentpaydai.Controller;

import com.example.assesmentpaydai.Model.NewsArticlee;
import com.example.assesmentpaydai.Service.NewsFetcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsFetcherController {


    @Autowired
    private NewsFetcherService newsFetcherService;

    @GetMapping("/fetchNews")
    public List<NewsArticlee> fetchNews() {
        String query = "indian sports news";
        return newsFetcherService.fetchNewsArticles(query);
    }

}
