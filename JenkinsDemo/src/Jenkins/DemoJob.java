package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoJob {
	
	@Test
	public void demoJob() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
		
		String PageTitle = driver.getTitle();
		System.out.println("This is the page title:" + PageTitle);
		System.out.println("THIS IS THE NEW CHANGES TO IMPLEMENT FROM FIXES BRANCH");
	
			
		System.out.println("Hello atuomation tester your program ran sucesfully");
		Thread.sleep(4000);
		driver.quit();
		
	}
	

}
