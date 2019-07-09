package com.tech.selenium.tests

import cucumber.api.CucumberOptions
import cucumber.api.testng.AbstractTestNGCucumberTests

/**
 * Created by Sridhar Bandi on 09/07/19.
 */
@CucumberOptions(features = ["classpath:features/Google.feature"],
        glue = ["com.tech.selenium.stepdefinitions"],
        plugin = ["json:target/cucumber-report.json","html:target/cucumber-html"])

class TestRunner extends AbstractTestNGCucumberTests{

}
