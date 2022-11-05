package dsivaaproject;

//import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class automationone {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		/*import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.chrome.ChromeDriver;

		import org.openqa.selenium.edge.EdgeDriver;

		import org.openqa.selenium.firefox.FirefoxDriver;

		public class SelIntroduction {

		public static void main(String[] args) {

		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();

		//Firefox

		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();
		}

		}*/




		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siva\\Desktop\\DSiva\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		driver.close();
		System.out.println("Automation testing");
		System.out.println("practice");
		//WebDriver driver=new ChromeDriver();
		//driver.get("www.google.com");
        //driver.close();
        //driver.quit();
		
		//Arrays :
		
		int[] arr= new int[5];
		arr[0]=344;
		arr[1]=232;
		arr[2]=233;
		
		System.out.println(arr[1]);
		
		//for loop

		for(int i=0; i<=arr.length; i++);
		
		{
			int i=0;
		System.out.println(arr[i]);
		}
	}}

	
 /*ArrayList<String>  a1 = new ArrayList<String>(); //ArryList store only string values
 a1.add("arraylisttestingone");
System.out.println(a1.get[0]);
 

}*/
