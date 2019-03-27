package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondFeatureSteps {

	WebDriver driver;
	
	@Given("^I want something$")
	public void i_want_something() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Automation//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^I will have something$")
	public void i_will_have_something() throws Throwable {
		driver.get("https://www.bbc.co.uk/news");
	}

	@Then("^I get something$")
	public void i_get_something() throws Throwable {
		System.out.println("This is the 2nd feature");
	}
}
