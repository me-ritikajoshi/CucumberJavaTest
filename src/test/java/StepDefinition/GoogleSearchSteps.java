package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver=null;

//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step - browser is open");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside step - user is on google search page");
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("user enter a text in search box")
//	public void user_enter_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside step - user entwesa text in search box");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		Thread.sleep(5000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside step - hits enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside step - user is navigated to search results");
//		driver.getPageSource().contains("Online Course");
//		driver.close();
//		driver.quit();
//	}
}
