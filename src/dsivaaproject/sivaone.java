package dsivaaproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sivaone {
	public static WebDriver driver;
   
	
	
	
		public static void getDriver() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sivaramakrishna\\Desktop\\sivaa\\Siva_A\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 
		}


}