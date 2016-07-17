package net.xeric.demos.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author glick
 * This is the Spring configuration file that allows us to get the webdriver.
 */
@Configuration
public class WebDriverProvider {

  private WebDriver webDriver;

  @Bean(destroyMethod = "quit", name = "")
  public WebDriver getWebDriver() {

    String browserName = System.getProperty("browser.name", "phantomjs");

    switch (browserName) {
      case "firefox":
        webDriver = new FirefoxDriver();
        break;
      case "phantomjs":
        webDriver = new PhantomJSDriver();
        break;
      case "chromedriver":
        webDriver = new ChromeDriver();
        break;
    }

    webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    return webDriver;
  }
}
