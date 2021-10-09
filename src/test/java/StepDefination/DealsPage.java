package StepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPage  extends BaseClass{

	@When("user click on deals link")
	public void user_click_on_deals_link() {
	   driver.findElement(By.xpath("//a[@href='/deals']")).click();
	}
	@Then("user is on deals page")
	public void user_is_on_deals_page() {
			String actualUrl=driver.getCurrentUrl();
			if(actualUrl.contains("deals"))
			{
				System.out.println("user is on deals page");
			}else {
				System.out.println("user is not on deals page");
			}
			
	}
	@Then("user click on create button of deals page")
	public void user_click_on_create_button_of_deals_page() {
		 driver.findElement(By.xpath("//a[@href='/deals/new']")).click();
	}
	@Then("user enter title of create new deal")
	public void user_enter_title_of_create_new_deal() {
	    driver.findElement(By.name("title")).sendKeys("Automation Test Engineer");
	}
	@When("user click on access public button")
	public void user_click_on_access_public_button() {
	
		driver.findElement(By.xpath("//button[@class='ui small fluid positive toggle button']")).click();
		
	}
	@Then("we can select drop down name")
	public void we_can_select_drop_down_name() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='twelve wide field']")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//div[@class='twelve wide field']/following::span[1]")).click();
		
	}

}
