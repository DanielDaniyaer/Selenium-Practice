package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleIntro {

	public static void main(String[] args) {
		
		
/*
 *   ****Chrome*****
 * 
//(Optional)	System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods close get
	//	ChromeDriver driver = new ChromeDriver();
		//FireFox - FireFoxDriver ->Methods close get
		//safari - SafariDriver -> Methods close get
		//WebDriver close get 
		//WebDriver methods + class methods
		WebDriver driver = new ChromeDriver();
		//Chromedriver.exe -> Chrome browser
		//WebDriver.chrome.driver -> value of path
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
*/		
/*		
//   *****FireFox******
		
		//geckodriver
		//webdriver.gecko.driver
//		System.setProperty("webdriver.gecko.driver","D:\\WebDrivers\\geckodriver-v0.32.1-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
*/		
		
//    ***Microsoft Edge ***
		//Microsoft Edge Driver
		System.setProperty("webdriver.edge.driver", "D:\\WebDrivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
