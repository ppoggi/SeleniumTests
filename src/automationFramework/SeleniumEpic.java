package automationFramework;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumEpic {

	public static final String EPIC_GAMES = "https://www.epicgames.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/PatrickPoggi/Documents/workspace/selenium_scripts/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		HomepageTest homepageTest = new HomepageTest();

		homepageTest.assertHomepagTitleIsHome(driver, EPIC_GAMES);  				
	}
}
