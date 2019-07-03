package com.tech.selenium.steps

import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import net.thucydides.core.annotations.Step
import net.thucydides.core.steps.ScenarioSteps

/**
 * Created by Sridhar Bandi on 02/07/19.
 */
class SearchSteps extends ScenarioSteps {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Step
    void openURL(){
        googleSearchPage.open()
    }

    @Step
    void searchFor(String searchterm){
        googleSearchPage.searchFor(searchterm)
    }

    @Step
    def seleniumLinkPresent(){
        return searchResultsPage.seleniumPresent()
    }
}
