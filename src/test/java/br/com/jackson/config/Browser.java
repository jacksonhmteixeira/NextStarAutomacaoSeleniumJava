package br.com.jackson.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Browser {

    public WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "htmlunit"); //VM Argument: -Dbrowser=firefox
        switch (webdriver) {
            case "firefox":
                return initFirefoxDriver();
            case "chrome":
                return initChromeDriver();
            default:
                return new HtmlUnitDriver();
        }
    }

    private  WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver",
                "driver/chromedriver");
        return new ChromeDriver();
    }

    private  WebDriver initFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\stepp\\Desktop\\curso-bdd\\workspace\\leilao\\drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }
}
