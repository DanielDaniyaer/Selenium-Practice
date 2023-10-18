package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	
	@Test
	public void login() {
		System.out.println("//selenium login");
		Assert.assertTrue(false);
	}
	
	@Test(dataProvider="getData")
	public void MobileLogin(String username, String password) {
		System.out.println("//Appium");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups= {"Smoke"})
	public void loginAPI() {
		System.out.println("//RestAPI Automation");
	}
	@BeforeSuite
	public void beforeSu() {
		System.out.println("FIRST ONE!!!!");
	}
	
	@AfterSuite
	public void afterSu() {
		System.out.println("LAST ONE!!!");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		data[2][0] ="ThirdUserName";
		data[2][1]="ThirdPassword";
		return data;
	}
	
}
