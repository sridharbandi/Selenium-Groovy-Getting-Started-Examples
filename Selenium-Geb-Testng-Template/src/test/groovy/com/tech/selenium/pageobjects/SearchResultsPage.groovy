package com.tech.selenium.pageobjects

import geb.Page

/**
 * Created by Sridhar Bandi on 16/07/19.
 */
class SearchResultsPage extends Page{
    static at = { $("a#logo") }

    static content = {
        linkSelenium {$("a", text: contains("Selenium - Web Browser Automation"))}
    }

}
