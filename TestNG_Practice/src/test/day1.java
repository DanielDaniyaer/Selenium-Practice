package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

//	public static void main(String[] args) {
//		
//	}

	@Parameters({"URL"})
	@Test
	public void Demo(String urlname) {
		System.out.println("hello");
		System.out.println(urlname);
	}
	
	@Test(groups= {"Smoke"})
	public void SecondDemo() {
		System.out.println("bye");
	}
	
	@AfterTest
	public void lastOne() {
		System.out.println("Last");
	}
	
	@BeforeTest
	public void prere() {
		System.out.println("First");
	}
	@BeforeMethod
	public void beforeMe() {
		System.out.println("Before every Method in day1 class");
	}
}
