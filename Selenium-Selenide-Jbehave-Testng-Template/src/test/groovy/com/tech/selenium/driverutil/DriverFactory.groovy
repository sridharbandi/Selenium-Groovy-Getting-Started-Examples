package com.tech.selenium.driverutil

import com.codeborne.selenide.Configuration

/**
 * Created by Sridhar Bandi on 11/07/19.
 */
class DriverFactory {

    def static setBrowser() {


        def browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase()
        def driverType = DriverType.valueOf(browserName)

        switch (driverType) {
            case DriverType.CHROME:
                System.setProperty("selenide.browser", "chrome");
                break
            case DriverType.FIREFOX:
                System.setProperty("selenide.browser", "firefox");
                break;
            case DriverType.EDGE:
                System.setProperty("selenide.browser", "edge");
                break;
            case DriverType.IE:
                System.setProperty("selenide.browser", "ie");
                break;
            case DriverType.OPERA:
                System.setProperty("selenide.browser", "opera");
                break;
            default:
                System.setProperty("selenide.browser", "chrome");
                break;
        }
        Configuration.startMaximized = true;
        Configuration.timeout = 60000;
    }

}