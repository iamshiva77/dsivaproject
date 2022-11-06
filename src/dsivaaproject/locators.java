package dsivaaproject;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class locators  extends automationone {
	
	

	
	public static void main(String[] args) throws InterruptedException {
		getDriver();
		
		driver.get("https://admin5.beta-wspbx.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Usenamefield();
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc@12345");//password
		driver.findElement(By.xpath("//*[@id=\"mainlogin\"]/div/div/input[2]")).click(); //View Manager
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"tab3\"]/a")).click(); //User Search
		driver.findElement(By.xpath("//*[@id=\"deepsearch_topfrm\"]")).sendKeys("aaatestingdeev");//username enter in serach
		driver.findElement(By.xpath("//*[@id=\"UserMainAction\"]/input[31]")).click(); //Go button
		Thread.sleep(5000);
		
		WebElement exopand=driver.findElement(By.xpath("//div[@id='div_collapse_1_aaatestingdeev@socrates']/a"));
		System.out.println("text--->"+driver.findElement(By.xpath("//div[@class='expandCollapseName userMaxWidth']")).getText());
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", exopand);
		String text=driver.findElement(By.xpath("//strong[contains(text(),'User Info')]")).getText();
		System.out.println("etxt----->"+text);
		Thread.sleep(5000);
		
		elementtobeclickble(Duration.ofSeconds(20), driver.findElement(By.id("maximized_icon_aaatestingdeev@socrates")));
		
		driver.findElement(By.id("maximized_icon_aaatestingdeev@socrates")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement aa=driver.findElement(By.xpath("//*[@id='tab4']/a"));
		Actions action=new Actions(driver);
		action.moveToElement(aa).perform();
		WebElement bb=driver.findElement(By.id("tab4_18"));
		bb.click();

		driver.close();
		
		
		
		
	}
}