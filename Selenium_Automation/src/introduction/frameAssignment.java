package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameAssignment {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top'")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle'")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
