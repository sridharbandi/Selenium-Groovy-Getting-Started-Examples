package com.tech.selenium.tests

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.fluentlenium.adapter.testng.FluentTestNg
import org.fluentlenium.core.annotation.Page
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.testng.annotations.Test

/**
 * Created by Sridhar Bandi on 13/07/19.
 */
class RunTest extends FluentTestNg {

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
