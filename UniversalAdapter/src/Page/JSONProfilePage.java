package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSONProfilePage {
	
	@FindBy (css = "button.font-black")
	WebElement btnCloseVideo;
	@FindBy (css = ".btn-stroke")
	WebElement btnNew;	
	@FindBy (css = "select.form-control")
	WebElement selectType;
	@FindBy (css = "select.ng-invalid > optgroup:nth-child(3) > option:nth-child(2)")
	WebElement JSONprofile;
	@FindBy (css = "input.ng-invalid")
	WebElement inpName;
	@FindBy (css = ".btn-hover-stroke-info")
	WebElement btnCreate;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[1]/div/div/div[3]/button")
	WebElement btnImport;
	@FindBy (css = "#import_file")
	WebElement importFile;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[3]/ng-include/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[1]/button[4]")
	WebElement btnExpandAll;
	@FindBy (css = ".btn-hover-stroke-green")
	WebElement btnSave;
	@FindBy (css = "li.uib-tab:nth-child(3)")
	WebElement hoverActivates;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a/uib-tab-heading/a")
	WebElement closeActivates;
	@FindBy (css = ".lobibox-notify")
	WebElement notificationPopup;
	@FindBy (css = ".success")
	WebElement btnUpload;
	
	
	WebDriver driver;
	WebDriverWait wait;

	
	public JSONProfilePage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void CreateJSONProfile(String HttpProfileSourceName, String HttpProfileTargetName) {
		
//		try {
//		    
//			Thread.sleep(3000);
//	    
//		} catch (InterruptedException e) {
//	    
//			e.printStackTrace();
//	    }   
//		
//		if (btnCloseVideo.isDisplayed()) {
//			
//			btnCloseVideo.click();
//			
//		} else {
//			
//			System.out.println("Ads already closed");
//			
//		}
//		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		Actions actions = new Actions(driver);
		
//		actions.moveToElement(hoverActivates).click().build().perform();
//		
//	  	executor.executeScript("arguments[0].click();", closeActivates);
		
		executor.executeScript("arguments[0].click();", btnNew);
		
		try {
		    
			Thread.sleep(1000);
			
			selectType.click();
			
			executor.executeScript("arguments[0].click();", selectType);
			
			JSONprofile.click();
			
			inpName.sendKeys(HttpProfileSourceName);
			
			executor.executeScript("arguments[0].click();", btnCreate);

			executor.executeScript("arguments[0].click();", btnImport);
			
			importFile.sendKeys("C:\\Users\\vuvan\\Desktop\\Sublime\\2SpecificJSON.json");
	    
			executor.executeScript("arguments[0].click();", btnUpload);
			
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
		
		
		
		
	  	actions.moveToElement(hoverActivates).click().build().perform();
	  	
	  	executor.executeScript("arguments[0].click();", closeActivates);
		
		try {
			
			Thread.sleep(2000);
	
			executor.executeScript("arguments[0].click();", btnNew);
			
			selectType.click();
			
			executor.executeScript("arguments[0].click();", selectType);
			
			JSONprofile.click();
			
			inpName.sendKeys(HttpProfileTargetName);
			
			executor.executeScript("arguments[0].click();", btnCreate);
			
			executor.executeScript("arguments[0].click();", btnImport);
			
			importFile.sendKeys("C:\\Users\\vuvan\\Desktop\\Sublime\\2SpecificJSON.json");
	    
			executor.executeScript("arguments[0].click();", btnUpload);
			
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
		
		actions.moveToElement(hoverActivates).click().build().perform();
	  	executor.executeScript("arguments[0].click();", closeActivates);
	
		
	}
	
}
