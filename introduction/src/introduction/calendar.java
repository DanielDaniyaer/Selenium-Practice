package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[id='travel_date']")).click();
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		int count = driver.findElements(By.className("flatpickr-day")).size();
		for(int i=0;i<count;i++) {
			String text =  driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
			
		}
		
	}

}
