package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.junit.Assert
import org.openqa.selenium.WebDriver

import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.Hooks.Before
import static cucumber.api.groovy.EN.*

/**
 * Created by Sridhar Bandi on 26/06/19.
 */

WebDriver browser
GoogleSearchPage googleSearchPage
SearchResultsPage searchResultsPage

Before() {
    browser = DriverFactory.driver
    googleSearchPage = new GoogleSearchPage(browser)
    searchResultsPage = new SearchResultsPage(browser)
}

Given(~"User is on Google search page") { ->
    googleSearchPage.openURL()
}

When(~"User searches for Selenium") { ->
    googleSearchPage.searchFor("Selenium")
}

Then(~"User can see Selenium results") { ->
    Assert.assertTrue(searchResultsPage.seleniumPresent())
};

After() {
    browser.quit()
}