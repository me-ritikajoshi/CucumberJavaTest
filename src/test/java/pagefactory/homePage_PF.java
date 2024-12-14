package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {

	@FindBy(xpath ="//a[.='Log out']")
	WebElement btn_logout;
	
	WebDriver driver;
	public homePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, loginPage_PF.class);
	}
	
	public void checkLogout() {
		btn_logout.click();
		
	}
}
