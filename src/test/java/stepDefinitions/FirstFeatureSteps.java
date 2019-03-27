package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstFeatureSteps {
	
	WebDriver driver;

	@Given("^I do something$")
	public void i_do_something() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Automation//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^I click something$")
	public void i_click_something() throws Throwable {
	    driver.get("https://en.wikipedia.org/wiki/Software_testing");
		driver.manage().window().maximize();
	}

	@Then("^I have something$")
	public void i_have_something() throws Throwable {
	    System.out.println("This is TEST 01");
	}
}
