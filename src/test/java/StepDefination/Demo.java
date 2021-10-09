package StepDefination;

import io.cucumber.java.en.Given;

public class Demo {

	@Given("user is on contactPage")
	public void user_is_on_contact_page() {

		System.out.println("user is on contactPage");
	}

	@Given("user is on DealsPage")
	public void user_is_on_deals_page() {
		System.out.println("user is on DealsPage");
	}


@Given("user is on CompaniesPage")
public void user_is_on_companies_page() {
    System.out.println("user is on CompaniesPage");
    
}

}
