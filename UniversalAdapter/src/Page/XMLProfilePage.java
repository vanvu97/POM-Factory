package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XMLProfilePage {
	
	@FindBy (css = "button.font-black")
	WebElement btnCloseVideo;
	@FindBy (css = ".btn-stroke")
	WebElement btnNew;	
	@FindBy (css = "select.form-control")
	WebElement selectType;
	@FindBy (css = "select.form-control > optgroup:nth-child(3) > option:nth-child(1)")
	WebElement XMLprofile;
	@FindBy (css = "input.ng-invalid")
	WebElement inpName;
	@FindBy (css = ".btn-hover-stroke-info")
	WebElement btnCreate;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[1]/div/div/div[3]/button")
	WebElement btnImport;
	@FindBy (css = "#import_file")
	WebElement importFile;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[1]/button[4]")
	WebElement btnExpandAll;
	@FindBy (css = ".btn-hover-stroke-green")
	WebElement btnSave;
	@FindBy (css = "li.uib-tab:nth-child(3)")
	WebElement hoverActivates;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a/uib-tab-heading/a")
	WebElement closeActivates;
	@FindBy (css = ".lobibox-notify")
	WebElement notificationPopup;
	
	
	WebDriver driver;
	WebDriverWait wait;

	
	public XMLProfilePage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void CreateXMLProfile(String SourceName, String TargetName) {
		
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
			
			XMLprofile.click();
			
			inpName.sendKeys(SourceName);
			
			executor.executeScript("arguments[0].click();", btnCreate);
			
			btnImport.click();
			
			importFile.sendKeys("C:\\Users\\vuvan\\Desktop\\Sublime\\1Special.xml");
	    
			executor.executeScript("arguments[0].click();", btnCreate);
			
//			btnExpandAll.click();
			
			Thread.sleep(1000);

			executor.executeScript("arguments[0].click();", btnSave);
			
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		if(notificationPopup.isDisplayed()) {
			
			String Notification = notificationPopup.getText();
			
			System.out.println(Notification);
			
		}
		
		Actions actions = new Actions(driver);
	  	actions.moveToElement(hoverActivates).click().build().perform();
	  	executor.executeScript("arguments[0].click();", closeActivates);
		
		try {
	
			executor.executeScript("arguments[0].click();", btnNew);
	
			Thread.sleep(1000);
			
			selectType.click();
			
			executor.executeScript("arguments[0].click();", selectType);
			
			XMLprofile.click();
			
			inpName.sendKeys(TargetName);
			
			executor.executeScript("arguments[0].click();", btnCreate);
			
			btnImport.click();
			
			importFile.sendKeys("C:\\Users\\vuvan\\Desktop\\Sublime\\1Special.xml");
	    
			executor.executeScript("arguments[0].click();", btnCreate);
			
//			btnExpandAll.click();
			
			Thread.sleep(1000);

			executor.executeScript("arguments[0].click();", btnSave);
			
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }  
		
		if(notificationPopup.isDisplayed()) {
			
			String Notification = notificationPopup.getText();
			
			System.out.println(Notification);
			
		}
	
		
	}
	
}
