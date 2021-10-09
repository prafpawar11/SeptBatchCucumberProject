package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Mumbai {

	@Before
	public void m1() {
		System.out.println("Before hook");
	}
	
	@After
	public void m2() {
		System.out.println("After hook ");
		
	}
	
	@BeforeStep
	public void setUp() {
		System.out.println("Before Step ");//1   4
	}
		
	@AfterStep
	public void tearDown() {
		System.out.println("After step"); //3  6
		System.out.println("================================");
	}
	
}
