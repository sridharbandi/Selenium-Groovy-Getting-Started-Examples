package com.tech.selenium.tests

import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import geb.spock.GebSpec

/**
 * Created by Sridhar Bandi on 17/07/19.
 */
class RunTest extends GebSpec {

    def "Google search Test"() {
        given:
        to GoogleSearchPage

        when:
        searchFor("Selenium")

        then:
        at SearchResultsPage
        assert linkSelenium.displayed
    }
}
