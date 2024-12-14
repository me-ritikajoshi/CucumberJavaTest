package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	protected WebDriver driver;
	 private By txt_username = By.xpath("//input[contains(@id,'username')]");

	 private By txt_password = By.xpath("//input[contains(@id,'password')]");

	 private By btn_submit = By.xpath("//button[contains(.,'Submit')]");
	
	 private By btn_loginMessage=By.xpath("//h1[contains(.,'Logged In Successfully')]");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
//		if(!driver.getTitle().equals("Practice test Automation")) {
//			throw new IllegalStateException("This is not the login Page.The current page is" +driver.getCurrentUrl());
//		}
	}

	public void enterUserName(String username) {

		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(btn_submit).click();
	}
	public void loginmsg() {
		driver.findElement(btn_loginMessage);
	}

	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_submit).click();
		driver.findElement(btn_loginMessage);

	}
	
	

}
