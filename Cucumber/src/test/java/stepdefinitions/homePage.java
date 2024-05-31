package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homePage {
	public static WebDriver driver;

	@Given("Test Navigate to Login page")
	public void Test_navigate_to_login_page() {

		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");

	}

	@Then("I validate the Homepage logo display")
	public void i_validate_Homepage_logoDisplay() {

		System.out.println("SuSuccssfully close the browser:ccssfully close the browser: ");
		driver.quit();

	}

	@Given("User is on login page")

	public void user_is_on_login_page() {

		System.out.println("User is on login page ");

	}

	@When("^User login into application with (.*) and (.*)$")

	public void user_login_into_application(String username, String password) {

		System.out.println("User name :  " + username + " " + "Passowrd" + password);

	}

	@Then("Home page is displayed")
	public void home_displayed() {

		System.out.println("Home page is displayed: ");

	}
	
	@Then("Card details displayed")
	public void Card_displayed()
	{
		System.out.println("Card details displayed ");
		
	}
	

}
