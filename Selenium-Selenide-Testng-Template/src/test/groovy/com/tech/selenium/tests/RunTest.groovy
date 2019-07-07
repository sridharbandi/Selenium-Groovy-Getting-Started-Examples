package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

/**
 * Created by Sridhar Bandi on 07/07/19.
 */
class RunTest {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @BeforeTest
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
