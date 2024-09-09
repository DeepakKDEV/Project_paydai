# <h1 align = "center"> Assignment: Develop an HTTP Service to Fetch News URLs from Google
News
___ 
<p align="center">

</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

--------------

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">API Setup:

Endpoint: /fetchNews
Method: GET
Description: This endpoint retrieves news article URLs based on a search term.
Fetching News Articles:

Input: Provide the search term as a query parameter in the URL (e.g., /fetchNews?query=indian%20sports%20news).
Process:
Use Selenium to automate browser interactions.
Navigate to Google News.
Enter the search term in the search box and submit.
Extract URLs from the search results page using XPath queries.
</p>


<!-- Technologies Used -->
## Technologies Used
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency


<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080/fetchNews.
### Controller:
- It consists of a class named APIController which basically controls the flow of data.
 @GetMapping 

### API Reference
   @GetMapping("/fetchNews")
    public List<NewsArticlee> fetchNews() {
        String query = "indian sports news";
        return newsFetcherService.fetchNewsArticles(query);
    }


<!-- Contact -->
## Summary
Create an HTTP API endpoint /fetchNews that uses Selenium to search Google News for a given term. Extract news article URLs from the search results using XPath queries. The service accepts a search term via a query parameter, processes it to get the news URLs, and returns them in a JSON format. Manage the browser lifecycle manually and deploy the service to a cloud provider for public access.
- Maild Id :  deepak76311@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> 