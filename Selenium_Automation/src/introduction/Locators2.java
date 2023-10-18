package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert; 

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
//		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","D:\\WebDrivers\\geckodriver-v0.32.1-win32\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "D:\\WebDrivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}

	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("div[class='forgot-pwd-container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] passwordArrays =passwordText.split("'");
		String password = passwordArrays[1].split("'")[0];
		return password;

	}
}
