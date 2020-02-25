package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Links;

public class UCLoginPage {
	
	@FindBy (id = "Username")
	WebElement vUsername;
	@FindBy (id = "Password")
	WebElement vPassword;
	@FindBy (css = ".buttonGreen")
	WebElement btnLogin;
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public UCLoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginUC(String vUser, String vPass) {
		
		driver.get(Links.URL_UC_QCCIP);
		
		vUsername.sendKeys(vUser);
		
		vPassword.sendKeys(vPass);
		
		btnLogin.click();
	}
	
}
