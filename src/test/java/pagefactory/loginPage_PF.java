package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {

	@FindBy(xpath = "//input[contains(@id,'username')]")
	@CacheLookup
	WebElement txt_username;

	@FindBy(xpath = "//input[contains(@id,'password')]")
	WebElement txt_password;

	@FindBy(xpath = "//button[contains(.,'Submit')]")
	WebElement btn_login;
	
	WebDriver driver;
	public loginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, loginPage_PF.class);
	}

	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void btnClick() {
		btn_login.click();
	}
}
