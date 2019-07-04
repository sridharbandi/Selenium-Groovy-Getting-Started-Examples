package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RunTest {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Before
    void setUp(){
        DriverFactory.setBrowser();
        googleSearchPage = new GoogleSearchPage();
        searchResultsPage = new SearchResultsPage();
    }

    @Test
    void exampleTest(){
        //Write your test here
        googleSearchPage.openURL();
        googleSearchPage.searchFor("Selenium");
        Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed());
    }
}
