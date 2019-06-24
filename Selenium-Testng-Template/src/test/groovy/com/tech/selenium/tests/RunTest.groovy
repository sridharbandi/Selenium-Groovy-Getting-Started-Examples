package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

/**
 * Created by Sridhar Bandi on 24/06/19.
 */
class RunTest{

    WebDriver browser
    GoogleSearchPage googleSearchPage
    SearchResultsPage searchResultsPage

    @BeforeTest
    void setUp() {
        browser = DriverFactory.driver
        googleSearchPage = new GoogleSearchPage(browser)
        searchResultsPage = new SearchResultsPage(browser)
    }

    @Test
    void testGoogleSearch() {
        googleSearchPage.openURL()
        googleSearchPage.searchFor("Selenium")
        Assert.assertTrue(searchResultsPage.seleniumPresent())
    }

    @AfterTest
    void tearDown() {
        browser.quit()
    }

}
