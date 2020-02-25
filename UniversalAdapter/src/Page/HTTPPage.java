package Page;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HTTPPage {
	
	@FindBy (css = "button.font-black")
	WebElement btnCloseVideo;
	@FindBy (css = ".btn-stroke")
	WebElement btnNew;	
	@FindBy (css = "select.form-control")
	WebElement selectType;
	@FindBy (css = "select.form-control > optgroup:nth-child(5) > option:nth-child(3)")
	WebElement HTTPOperation;
	@FindBy (css = "select.form-control > optgroup:nth-child(6) > option:nth-child(3)")
	WebElement HTTPConnection;
	@FindBy (css = "input.ng-invalid")
	WebElement inpName;
	@FindBy (css = ".btn-hover-stroke-info")
	WebElement btnCreate;
	@FindBy (css = ".btn-hover-stroke-green")
	WebElement btnSave;
	@FindBy (css = "li.uib-tab:nth-child(3)")
	WebElement hoverActivates;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a/uib-tab-heading/a")
	WebElement closeActivates;
	@FindBy (css = "select.ng-not-empty")
	WebElement connectionAction;
	@FindBy (css = "select.ng-not-empty > option:nth-child(2)")
	WebElement actionSend;
	@FindBy (css = ".checkbox > label:nth-child(1) > input:nth-child(1)")
	WebElement checkDiskOperation;
	@FindBy (css = "div.card-body:nth-child(3) > div:nth-child(2) > div:nth-child(2) > select:nth-child(1)")
	WebElement fileNamingOption;
	@FindBy (css = "div.card-body:nth-child(3) > div:nth-child(2) > div:nth-child(2) > select:nth-child(1) > option:nth-child(4)")
	WebElement errorIfExist;
	@FindBy (css = ".col-sm-8 > input:nth-child(1)")
	WebElement impDirectory;
	@FindBy (css = ".lobibox-notify")
	WebElement notificationPopup;
	
	
	WebDriver driver;
	WebDriverWait wait;
	Logger log = Logger.getLogger("devpinoyLogger");

	
	public HTTPPage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void CreateHttpOperation(String OperationName) {
		
		try {
		    
			Thread.sleep(3000);
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		if (btnCloseVideo.isDisplayed()) {
			
			btnCloseVideo.click();
			
		}
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].click();", btnNew);
		
		try {
		    
			Thread.sleep(1000);
			
			selectType.click();
			
			executor.executeScript("arguments[0].click();", selectType);
			
			HTTPOperation.click();
			
			executor.executeScript("arguments[0].click();", HTTPOperation);
			
			inpName.sendKeys(OperationName);
			
			executor.executeScript("arguments[0].click();", btnCreate);
			
			Thread.sleep(2000);
			
			executor.executeScript("arguments[0].click();", btnSave);
			
//			btnSave.click();
			
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		if(notificationPopup.isDisplayed()) {
			
			String Notification = notificationPopup.getText();
			
			System.out.println(Notification);
			
		}
		
	}
	
	
	public void CreateHttpConnection (String ConnectionName, String UrlDirectory) {
		
		Actions actions = new Actions(driver);
		
	  	actions.moveToElement(hoverActivates).click().build().perform();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].click();", closeActivates);
		
		executor.executeScript("arguments[0].click();", btnNew);
		
		try {
		    
			Thread.sleep(1000);
			
			selectType.click();
			
			executor.executeScript("arguments[0].click();", selectType);
			
			HTTPConnection.click();
			
			inpName.sendKeys(ConnectionName);
			
			executor.executeScript("arguments[0].click();", btnCreate);
			
			Thread.sleep(2000);
			
			impDirectory.sendKeys(UrlDirectory);
			
			btnSave.click();
			
			if(notificationPopup.isDisplayed()) {
				
				String Notification = notificationPopup.getText();
				
				System.out.println(Notification);
				
			}
			
			
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		System.out.println("HTTP Client Done!");
		
	}
	
}
