package net.xeric.demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is the Spring configuration file that allows us to get the webdriver.
 */
//@Configuration
public class TestConfig {

//	@Bean(destroyMethod = "quit", name = "webDriver")
//	public WebDriver getWebDriver() {
//
//		final WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		return driver;
//	}
}
