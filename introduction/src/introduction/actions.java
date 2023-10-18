package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		WebElement serchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(serchBox).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").doubleClick().build().perform();
		WebElement account = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(account).contextClick().build().perform();
		
	}

}
