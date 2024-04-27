package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login {
	
	public static WebDriver driver;
	
	@Given("I Navigate to Login page")
	public void i_navigate_to_login_page() {
		

		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
	  
	}

	@When("I enter the valid email address")
	public void i_enter_the_valid_email_address() {
		System.out.println("enter email: ");
	    
	}

	@When("I entered the valid password")
	public void i_entered_the_valid_password() {
		System.out.println("Enter the correct password:  ");
	    
	}

	@When("I click on Login Button")
	public void i_click_on_login_button() {
		
		System.out.println("Click on Login Button:  ");
	}

	@Then("I should get successful Message")
	public void i_should_get_successful_message() {
		
		driver.quit();
		
		System.out.println("Succssfully close the browser: ");
	
	}



}
