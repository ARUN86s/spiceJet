package spicejet;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseFile {
	 		
	       	
				
		
public static WebDriver driver = null;
		
	@BeforeClass
	public void basicConfig() {
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Duration timeoutDuration = Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
        driver.get("https://www.spicejet.com");
		}	
			
	@AfterClass
	public void close() {
	   // Close the browser or session
	   driver.close();
}	
}