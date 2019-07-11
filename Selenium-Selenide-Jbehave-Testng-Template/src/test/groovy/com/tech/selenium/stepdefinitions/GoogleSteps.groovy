package com.tech.selenium.stepdefinitions


import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.jbehave.core.annotations.BeforeScenario
import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.Then
import org.jbehave.core.annotations.When
import org.junit.Assert

/**
 * Created by Sridhar Bandi on 11/07/19.
 */
class GoogleSteps {

    GoogleSearchPage googleSearchPage
    SearchResultsPage searchResultsPage

    @BeforeScenario
    def setUp() {
        googleSearchPage = new GoogleSearchPage()
        searchResultsPage = new SearchResultsPage()
    }

    @Given("User is on Google search page")
    def userOnGooglePage() {
        googleSearchPage.openURL()
    }

    @When("User searches for Selenium")
    def userSearches() {
        googleSearchPage.searchFor("Selenium")
    }

    @Then("User can see Selenium results")
    def userSeesResults() {
        Assert.assertTrue(searchResultsPage.getLnkSelenium().isDisplayed())
    }

}

