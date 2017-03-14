package automationFramework;

import org.openqa.selenium.WebDriver;

public class HomepageTest {

	public static final String HOME = "home";
	
	public void assertHomepagTitleIsHome(WebDriver driver, String site){
		
		driver.get(site);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//Would normally write to a JSON string or XML file to handle all the outputs
		if(title.toLowerCase().contains(HOME))
			System.out.println("Successfully opened the website ".concat(site));
		else
			System.out.println("Could not open the website ".concat(site));
		
	    driver.quit();		
	}
	
	
}
