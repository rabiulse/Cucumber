package stepdefinitions;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("I Navigate to Login page")
	public void i_navigate_to_login_page() {
		
		System.out.println("loginSuucssfull: ");
	  
	}

	@When("I enter the valid email address")
	public void i_enter_the_valid_email_address() {
		System.out.println("enter email: ");
	    
	}

	@When("I entered the valid password")
	public void i_entered_the_valid_password() {
		System.out.println("passerf ");
	    
	}

	@When("I click on Login Button")
	public void i_click_on_login_button() {
		
		System.out.println("Click on Login Button:  ");
	}

	@Then("I should get successful Message")
	public void i_should_get_successful_message() {
		System.out.println("Successfuly validated  ");
	
	}



}
