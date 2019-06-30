package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;
	LOginOR object;
	
	@Given("Alex on home page")
	public void alex_on_home_page() {
		System.setProperty("webdriver.gecko.driver","resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	   
	}

	@When("Alex entered {string} and {string}")
	public void alex_entered_and(String string, String string2) {
	   object = new LOginOR(driver);
	   System.out.println("user enters user credentials");
	   object = new LOginOR(driver);
	   object.userN.sendKeys(string);
	   object.passW.sendKeys(string2);
	   object.login.click();
	   
	}

	@When("Alex clicks on login button.")
	public void alex_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Alex should be logged in")
	public void alex_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
}
