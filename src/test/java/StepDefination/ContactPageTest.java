package StepDefination;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageTest extends BaseClass {

	@Given("user enter free CRM url")
	public void user_enter_free_crm_url() {
		//BaseClass.initlization();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("praf002@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		driver.findElement(By.xpath("//input[@name='password']/following::div[1]")).click();

	}

	@Then("user is on home page of free CRM")
	public void user_is_on_home_page_of_free_crm() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "Cogmento CRM";
		assertEquals(actualTitle, expectedTitle);
	}

	@Then("verify user is on home page or not")
	public void verify_user_is_on_home_page_or_not() {

		boolean logoStatus = driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();

		assertEquals(logoStatus, true);

	}

	@When("user click on contact link")
	public void user_click_on_contact_link() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

		Thread.sleep(4000);
	}

	@Then("user is on contact page")
	public void user_is_on_contact_page() {

		System.out.println("user is on contact Page");

		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	}

	@Then("user fillup the contact page details")
	public void user_fillup_the_contact_page_details() throws InterruptedException {

		driver.findElement(By.name("first_name")).sendKeys("amit");

		driver.findElement(By.name("last_name")).sendKeys("xyz");
		Thread.sleep(8000);

	}

}
