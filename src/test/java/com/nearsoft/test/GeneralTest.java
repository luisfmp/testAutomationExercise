/**
 *
 */
package com.nearsoft.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author lmartinez
 *
 */
public abstract class GeneralTest {
	protected static WebDriver driver;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		if (driver != null) {
            driver.quit();
        }
	}
}
