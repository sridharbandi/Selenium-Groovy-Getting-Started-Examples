package com.tech.selenium.pageobjects

import geb.Page
import org.openqa.selenium.By
import org.openqa.selenium.Keys

/**
 * Created by Sridhar Bandi on 16/07/19.
 */
class GoogleSearchPage extends Page {

    static at = { title == "Google" }

    static content = {
        searchBox {$(By.name("q"))}
    }

    def searchFor(searchText){
        searchBox << searchText
        searchBox << Keys.RETURN
    }
}
