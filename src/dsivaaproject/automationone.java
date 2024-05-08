package dsivaaproject;

import java.time.Duration;

import org.openqa.selenium.By;

//import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automationone extends sivaone {
	

	public  static void elementtobeclickble(Duration time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,time );
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void Usenamefield()
	{	
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"xusername\"]"));
		elementtobeclickble(Duration.ofSeconds(20),Username );
		Username.sendKeys("adminuser@socrates");
	}
	System.out.println("fork is added to tthhhtht the github");
}
