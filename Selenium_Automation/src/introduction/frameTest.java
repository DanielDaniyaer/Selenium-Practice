package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a = new Actions(driver);
		WebElement draggableBox = driver.findElement(By.cssSelector("#draggable"));
		WebElement targetBox = driver.findElement(By.cssSelector("#droppable"));
		a.clickAndHold().dragAndDrop(draggableBox, targetBox).build().perform();
		driver.switchTo().defaultContent();

	}

}
