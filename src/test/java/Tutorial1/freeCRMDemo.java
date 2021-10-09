package Tutorial1;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import StepDefination.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class freeCRMDemo extends BaseClass {

	@Given("user enter free CRM url")
	public void user_enter_free_crm_url() {
		BaseClass.initlization("https://ui.cogmento.com/");
	}

	@When("user enter valid data")
	public void user_enter_valid_data(DataTable dataTable) throws InterruptedException {

		List<List<String>> userlist = dataTable.asLists();

		String uname=userlist.get(0).get(0);
		String pass=userlist.get(0).get(1);
		
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		
		Thread.sleep(5000);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		// driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("user is on home page of free CRM")
	public void user_is_on_home_page_of_free_crm() {

		// String name = driver.findElement(By.className("user-display")).getText();
		// System.out.println(name);

		driver.close();
	}
}
