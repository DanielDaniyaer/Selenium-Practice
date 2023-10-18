package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angularpracticeAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("DanCobra");
		driver.findElement(By.name("email")).sendKeys("DanCobra123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Dan123");
		driver.findElement(By.xpath("//div/input[@type='checkbox']")).click();
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(dropdown);
		gender.selectByVisibleText("Female");
//		System.out.println(gender.getFirstSelectedOption().getText());
		Thread.sleep(5000);

		
		driver.findElement(By.name("inlineRadioOptions")).click();
		driver.findElement(By.name("bday")).sendKeys("02132023");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}                                                                  

}
