package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {


	@Test
	public void day2() {
		System.out.println("good");
	}
	
	@BeforeMethod
	public void beforeMe() {
		System.out.println("Before every Method in day2 class");
	}
}
