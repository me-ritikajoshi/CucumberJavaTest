package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.homePage_PF;
import pagefactory.loginPage_PF;

public class LoginDemoSteps_PF {
	
//	WebDriver driver;
//	loginPage_PF login;
//	homePage_PF home;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("I am inside LoginDemoStep_PF class");
//		
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//		
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		
//		login=new loginPage_PF(driver);
//		
//		login.enterUserName(username);
//		login.enterPassword(password);
//		
////		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys(username);
////		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.btnClick();
//		
////		driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
//
//	}
//
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//		home= new homePage_PF(driver);
//		
//		home.checkLogout();
////		driver.findElement(By.xpath("//h1[contains(.,'Logged In Successfully')]")).isDisplayed();
//		driver.close();
//		driver.quit();
//		
//	}

}
