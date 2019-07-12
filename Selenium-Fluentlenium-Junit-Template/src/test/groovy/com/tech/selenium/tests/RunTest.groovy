package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.fluentlenium.adapter.junit.FluentTest
import org.fluentlenium.core.annotation.Page
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 12/07/19.
 */
class RunTest extends FluentTest {

    @Page
    GoogleSearchPage googleSearchPage
    @Page
    SearchResultsPage searchResultsPage

    @Override
    WebDriver newWebDriver() {
        return DriverFactory.driver
    }

    @Test
    void testGoogleSearch() {
        googleSearchPage.openURL()
        googleSearchPage.searchFor("Selenium")
        Assert.assertTrue(searchResultsPage.seleniumPresent())
    }

}
