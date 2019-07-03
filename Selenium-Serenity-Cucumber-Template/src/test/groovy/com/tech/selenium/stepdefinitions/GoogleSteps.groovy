package com.tech.selenium.stepdefinitions


import com.tech.selenium.steps.SearchSteps
import org.junit.Assert
import static cucumber.api.groovy.Hooks.Before
import static cucumber.api.groovy.EN.*

SearchSteps searchSteps;

Before() {
    searchSteps = new SearchSteps()
}

Given(~"User is on Google search page") { ->
    searchSteps.openURL()
}

When(~"User searches for Selenium") { ->
    searchSteps.searchFor("Selenium")
}

Then(~"User can see Selenium results") { ->
    Assert.assertTrue(searchSteps.seleniumLinkPresent())
};


