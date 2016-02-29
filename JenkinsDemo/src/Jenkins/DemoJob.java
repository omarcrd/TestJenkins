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
			
		System.out.println("Hello atuomation tester your program ran sucesfully");
		Thread.sleep(4000);
		driver.quit();
		
	}
	

}
