package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 23/06/19.
 */
class RunTest{

    WebDriver browser
    GoogleSearchPage googleSearchPage
    SearchResultsPage searchResultsPage

    @Before
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

    @After
    void tearDown() {
        browser.quit()
    }

}
