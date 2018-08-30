package stepDefinition;

import cucumber.api.java.en.Given;	
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Login_testdefinition 
{
	
	@Given("^User navigates to Jenkins$")
	public void user_navigates_to_Jenkins() throws Throwable
	{
	   
		System.out.println("User navigates to Jenkins");  
	}

	@When("^User Clicks on login button$")
	public void user_Clicks_on_login_button() throws Throwable {
	    
		 System.out.println("execute cuucmber scripts");
	}

	@Then("^login page needs to be displayed$")
	public void login_page_needs_to_be_displayed() throws Throwable {
	   
		System.out.println("results displayed in qmetry");
	}


}
