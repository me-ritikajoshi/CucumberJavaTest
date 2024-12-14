package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
//	WebDriver driver;
//	
//	@Before
//	public void browserSetup() {
//		System.out.println("----------I am inside browser set up-------");
//		driver=new ChromeDriver();
//		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//	
//
//	@After
//	public void tearDown() {
//		System.out.println("----------I am inside tear down-------");
//
//		driver.close();
//		driver.quit();
//	}
//	
//	@BeforeStep
//	public static void beforeSteps() {
//		System.out.println("----------I am inside before steps-------");
//	}
//	
//	@AfterStep
//	public static void afterSteps() {
//		System.out.println("----------I am inside after steps-------");
//	}
//	
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		
//	}
//
//	@When("user enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//		
//	}
//
//	@And("clicks on the login button")
//	public void clicks_on_the_login_button() {
//		
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//		
//	}
}
