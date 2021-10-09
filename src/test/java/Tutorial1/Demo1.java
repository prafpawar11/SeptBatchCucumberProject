package Tutorial1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import StepDefination.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 extends BaseClass {

	
	@Given("open fb application")
	public void open_fb_application() {
	   BaseClass.initlization("https://en-gb.facebook.com/");
	}
	@When("enter valid username and password")
	public void enter_valid_username_and_password() throws IOException {
		driver.findElement(By.name("email")).sendKeys("Username1");
		driver.findElement(By.name("pass")).sendKeys("Password1");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File(System.getProperty("user.dir")+"/ScreenShot/"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(f, dist);
		
	}
	@Then("homepage fb")
	public void homepage_fb() throws InterruptedException {

		System.out.println(driver.getTitle());
		Thread.sleep(7000);
		driver.close();
	}

}
