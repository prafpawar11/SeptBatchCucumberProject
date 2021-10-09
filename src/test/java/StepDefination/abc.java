package StepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class abc extends BaseClass {

	@Given("open fb application")
	public void open_fb_application() {
		BaseClass.initlization("https://en-gb.facebook.com/");
	}

	@When("enter valid {string}")
	public void enter_valid(String name) {
		driver.findElement(By.name("email")).sendKeys(name);
	}

	@When("entr pass {string}")
	public void entr_pass(String pass) throws InterruptedException {

		driver.findElement(By.name("pass")).sendKeys(pass);

	}

	@Then("homepage fb")
	public void homepage_fb() {

		System.out.println("User is on home page");
		driver.close();
	}

}
