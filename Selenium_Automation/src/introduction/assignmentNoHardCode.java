package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignmentNoHardCode {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("label[for='bmw']")).click();
		String selectedOption = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		WebElement dropdownOptions = driver.findElement(By.id("dropdown-class-example"));
		Select options = new Select(dropdownOptions);
		options.selectByVisibleText(selectedOption);
		driver.findElement(By.id("name")).sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();
		String nameFromAlert =driver.switchTo().alert().getText().split("Hello")[1].split(",")[0].trim();
		Assert.assertEquals(nameFromAlert, selectedOption);
		driver.switchTo().alert().accept();
	}

}
