package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.SampleJunit;

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
	
	SampleJunit sampleJunit = new SampleJunit();
	   
	   @Test
	   public void testAddTwoNumbers() {	
	      System.out.println("Running test for adding two numbers");    
	      assertEquals(4, sampleJunit.addTwoNumbers(1, 3));     
	   }
	   
	   
	   @Test
	   public void testsubtractTwoNumbers() {	
	      System.out.println("Running test for adding two numbers");    
	      assertEquals(2, sampleJunit.addTwoNumbers(3, 1));     
	   }
	


}
