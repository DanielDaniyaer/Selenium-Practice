package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Dani");
		driver.findElement(By.name("inputPassword")).sendKeys("dani123");
//		driver.findElement(By.name("chkboxOne")).click();
//		driver.findElement(By.name("chkboxTwo")).click();
//		driver.findElement(By.className("signInBtn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
//		driver.findElement(By.cssSelector("#visitUSOne")).click();
//		driver.findElement(By.xpath("//button[@id='visitUSOne'])").click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Name'] ")).sendKeys("Dani");
		driver.findElement(By.cssSelector("input[placeholder='Name'")).sendKeys("Dani");
//		driver.findElement(By.xpath("//input[@placeholder='Email'] ")).sendKeys("Dani123");
		driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("Dani123");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number'] ")).sendKeys("123456");
//	 	driver.findElement(By.cssSelector("input[placeholder='Phone Number'")).sendKeys("123");
//		driver.findElement(By.xpath("//from/input[3]")).sendKeys("123");

		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).clear();
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
//		driver.close();
	}

}
