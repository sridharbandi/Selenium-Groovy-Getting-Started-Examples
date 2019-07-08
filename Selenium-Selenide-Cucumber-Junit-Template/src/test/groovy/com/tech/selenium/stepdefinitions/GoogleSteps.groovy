package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.junit.Assert

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.Before

/**
 * Created by Sridhar Bandi on 08/07/19.
 */

GoogleSearchPage googleSearchPage
SearchResultsPage searchResultsPage

Before() {
    DriverFactory.setBrowser();
    googleSearchPage = new GoogleSearchPage()
    searchResultsPage = new SearchResultsPage()
}

Given(~"User is on Google search page") { ->
    googleSearchPage.openURL()
}

When(~"User searches for Selenium") { ->
    googleSearchPage.searchFor("Selenium")
}

Then(~"User can see Selenium results") { ->
    Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed())
};
