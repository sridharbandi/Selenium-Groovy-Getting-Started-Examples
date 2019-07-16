import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.opera.OperaDriver

baseUrl = 'https://www.google.com/'

WebDriverManager.chromedriver().setup()
driver = { new ChromeDriver() }

environments {
    "chrome" {
        WebDriverManager.chromedriver().setup()
        driver = { new ChromeDriver() }
    }
    "firefox" {
        WebDriverManager.firefoxdriver().setup()
        driver = { new FirefoxDriver() }
    }
    "edge" {
        WebDriverManager.edgedriver().setup()
        driver = { new EdgeDriver() }
    }
    "ie" {
        WebDriverManager.iedriver().setup()
        driver = { new InternetExplorerDriver() }
    }
    "opera" {
        WebDriverManager.operadriver().setup()
        _driver = { new OperaDriver() }
    }
}

reportsDir = "target/reports"

waiting {
    timeout = 6
    retryInterval = 0.5
    slow { timeout = 12 }
    reallySlow { timeout = 24 }
}