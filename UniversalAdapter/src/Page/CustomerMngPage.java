package Page;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerMngPage {
	
	//Reach to Customer Management section
	@FindBy (css = "#monitor")
	WebElement btnMonitor;
	@FindBy (css = "li.menu-level-0:nth-child(7) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
	WebElement clickOnCustomerMng;
	@FindBy (css = ".glyphicon-plus-sign")
	WebElement addCustomer;
	@FindBy (css = "li.menu-level-0:nth-child(8) > ul:nth-child(2)")
	WebElement subMenu;
	@FindBy (css = "#ui-id-2")
	WebElement tabBilling;
	@FindBy (css = "#tab_2 > div.middle-west-billing.bg-white.ui-layout-pane.ui-layout-pane-west > div.content-inner.pad0A.box-h100 > ul > li:nth-child(1) > div.di__table > div > div.di__table-cell.width-xs-50.vert-middle > input")
	WebElement noOfRecipe;
	@FindBy (css = "#tab_2 > div.middle-west-billing.bg-white.ui-layout-pane.ui-layout-pane-west > div.content-inner.pad0A.box-h100 > ul > li:nth-child(2) > div.di__table > div > div.di__table-cell.width-xs-50.vert-middle > input")
	WebElement noOfRunningTime;
	@FindBy (css = "#tab_2 > div.middle-west-billing.bg-white.ui-layout-pane.ui-layout-pane-west > div.content-inner.pad0A.box-h100 > ul > li:nth-child(3) > div.di__table > div > div.di__table-cell.width-xs-50.vert-middle > input")
	WebElement noOfKB;
	@FindBy (css = "#tab_2 > div.middle-west-billing.bg-white.ui-layout-pane.ui-layout-pane-west > div.content-inner.pad0A.box-h100 > ul > li:nth-child(4) > div.di__table > div > div.di__table-cell.width-xs-50.vert-middle > input")
	WebElement noOfConnectors;

	
	//Create a Account
	@FindBy (css = "#collapse_fieldAccount > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
	WebElement inpAccountName;
	@FindBy (css = "input.ng-valid-email")
	WebElement inpEmail;
	@FindBy (css = "select.ng-pristine")
	WebElement accType;
	@FindBy (css = "select.form-control > option:nth-child(1)")
	WebElement trialType;
	@FindBy (css = "select.form-control > option:nth-child(2)")
	WebElement standardType;
	@FindBy (css = ".style-cb > span:nth-child(2)")
	WebElement btnEnable;
	@FindBy (css = "div.mrg10T:nth-child(3) > label:nth-child(1) > span:nth-child(2)")
	WebElement radioSynch;
	@FindBy (css = "div.mrg10T:nth-child(4) > label:nth-child(1) > span:nth-child(2)")
	WebElement radioEnable;
	@FindBy (css = "#collapse_fieldProfile > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
	WebElement inpCode;
	@FindBy (css = "input.ng-invalid-required")
	WebElement inpFullName;
	@FindBy (css = "div.form-group:nth-child(3) > div:nth-child(2) > input:nth-child(1)")
	WebElement inpAddress;
	@FindBy (css = "div.form-group:nth-child(4) > div:nth-child(2) > input:nth-child(1)")
	WebElement impCompany;
	@FindBy (css = "div.form-group:nth-child(5) > div:nth-child(2) > input:nth-child(1)")
	WebElement inpCountry;
	@FindBy (css = "div.form-group:nth-child(6) > div:nth-child(2) > input:nth-child(1)")
	WebElement inpCountryCode;
	@FindBy (css = "div.form-group:nth-child(7) > div:nth-child(2) > input:nth-child(1)")
	WebElement inpPhoneNo;
	@FindBy (css = "button.btn")
	WebElement btnSave;
	@FindBy (css = ".middle-south-billing > div:nth-child(1) > button:nth-child(1)")
	WebElement btnSave2;
	@FindBy (css = ".page-header > h1:nth-child(1)")
	WebElement getTitle;
	@FindBy (css = "div.mrg10T:nth-child(4) > label:nth-child(1) > input:nth-child(1)")
	WebElement setPassword;
	@FindBy (css = "div.ng-scope:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")
	WebElement newPassword;
	@FindBy (css = "input.ng-isolate-scope")
	WebElement retypeNewPassWord;
	@FindBy (css = "#data-table-customerList_filter > label:nth-child(1) > input:nth-child(1)")
	WebElement filterBox;
	@FindBy (css = ".sorting_1")
	WebElement chooseAccount;
	@FindBy (css = ".glyphicon-edit")
	WebElement btnEdit;
	@FindBy (css = "li.menu-level-0:nth-child(6) > a:nth-child(1) > span:nth-child(2)")
	WebElement btnBuild;
	@FindBy (css = ".dropdown-treemenu > ul:nth-child(4) > li:nth-child(1) > ul:nth-child(4)")
	WebElement listBuildProcess;
	@FindBy (css = "div.panel-table-cell:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
	WebElement fromDate;
	@FindBy (css = "button.btn:nth-child(2)")
	WebElement btnSearch;
	@FindBy (css = "a.btn:nth-child(4)")
	WebElement btnDelete;
	@FindBy (css = ".swal2-confirm")
	WebElement confirmDelete;
	@FindBy (css = "input.ng-dirty")
	WebElement checkEnable;
	@FindBy (css = "#collapse_fieldProfile > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")
	WebElement editFullName;
	@FindBy (css = "#collapse_fieldProfile > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)")
	WebElement editAddress;
	
	//Get table
	@FindBy (css = ".table")
	WebElement customerTable;
	@FindBy (css = ".table > tbody:nth-child(2)")
	WebElement customerTable2;
	
	//Notification
	@FindBy (css = ".lobibox-notify")
	WebElement Notification;
	@FindBy (css = ".has-error > div:nth-child(2) > p:nth-child(3)")
	WebElement wrongFormatEmail;
	@FindBy (css = ".lobibox-notify-wrapper")
	WebElement codeIsExist;
	@FindBy (css = ".lobibox-notify")
	WebElement createSuccessNoti;
	@FindBy (css = "div.has-error:nth-child(1) > div:nth-child(2) > p:nth-child(2)")
	WebElement errLimitPassword;
	@FindBy (css = ".has-error > div:nth-child(2) > p:nth-child(2)")
	WebElement emailRequireData;
	@FindBy (css = ".dataTables_empty")
	WebElement dataEmpty;
	
	//Button
	@FindBy (css = ".open > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")
	WebElement btnDeleteAccount;
	@FindBy (css = ".swal2-confirm")
	WebElement btnYesDelete;
	@FindBy (css = ".open > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
	WebElement btnSetPassword;
	
	//login Account Test
	@FindBy (css = ".acc-btn")
	WebElement profileIcon;
	@FindBy (css = "li.last:nth-child(2) > a:nth-child(1)")
	WebElement btnSignOut;
	
	//Login Page
	@FindBy (id = "Username")
	WebElement vUsername;
	@FindBy (id = "Password")
	WebElement vPassword;
	@FindBy (css = ".buttonGreen")
	WebElement btnLogin;
	
	public static Date date = new Date();
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");

	public static String formattedDate = sdf.format(date);
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public CustomerMngPage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 50);
		
		PageFactory.initElements(driver, this);
	}
	
	public void reachToCustomerSection() throws InterruptedException {
		
		Actions hover = new Actions(driver);
		
		hover.moveToElement(btnMonitor).build().perform();
		
		try {
	    
			Thread.sleep(5000);
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		clickOnCustomerMng.click();
		
//		String titleCustomerPage = getTitle.getText();
//		
//		Assert.assertEquals("Customer Management", titleCustomerPage);
	
	}
	
	public void AddCustomer(String AddOrDelete, String sAccountName, String sEmail, String sAccountType, String sEnable,String sNewPassword,String sRetypePassword, String sCode, 
			String sFullName, String sAddress, String Company, String sCountry, String CountryCode, String PhoneNo) throws InterruptedException {
		
		switch(AddOrDelete) {
		
		//--------------Add--------------
		
		case "Add":
			
			try {
			    
				Thread.sleep(3000);
		    
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
		    }   
			
			addCustomer.click();
			
			inpAccountName.sendKeys(sAccountName);
			
			inpEmail.sendKeys(sEmail + "@gmail.com");
			
			if(emailRequireData.isDisplayed()) {
				
				System.out.println("Required email");
				
			}
			
			accType.click();
			
			if(sAccountType.contains("Standard")) {
				
				System.out.println("Account Type : Standard");
				
				standardType.click();
				
			}else {
				
				System.out.println("Account Type : Trial");
				
				trialType.click();
				
			}
			
			if(sEnable.contains("Y")) {
				
				System.out.println("Is Enable : Yes");
				
				btnEnable.click();
				
			}else {
				
				System.out.println("Is Enable : No");
				
			}
			
			if(setPassword.isEnabled()) {

				System.out.println("Sending Password...");
				
				System.out.println("Password : " + sNewPassword);
				
				newPassword.sendKeys(sNewPassword);
				
				retypeNewPassWord.sendKeys(sRetypePassword);
				
			}else {
				
				setPassword.click();
				
				System.out.println("Sending Password...");
				
				System.out.println("Password : " + sNewPassword);
				
				newPassword.sendKeys(sNewPassword);
				
				retypeNewPassWord.sendKeys(sRetypePassword);
				
			}
			
//			if(!errLimitPassword.isDisplayed()) {
	//
//				System.out.println(errLimitPassword.getText().trim());
//				
//				Assert.assertNotEquals(errLimitPassword.getText().trim(), "Your password has at least 8 characters, maximize 20 characters.");
//				
//			}
			
			inpCode.sendKeys(sCode);
			
			inpFullName.sendKeys(sFullName);
			
			inpAddress.sendKeys(sAddress);
			
			impCompany.sendKeys(Company);
			
			inpCountry.sendKeys(sCountry);
			
			inpCountryCode.sendKeys(CountryCode);
			
			inpPhoneNo.sendKeys(PhoneNo);
			
			tabBilling.click();
			
			try {
				 
				Thread.sleep(1000);
		
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
				
		    }   
			
			noOfRecipe.sendKeys("999");
			
			noOfRunningTime.sendKeys("9999");
			
			noOfRecipe.sendKeys("9999");
			
			noOfKB.sendKeys("9999");
			
			noOfConnectors.sendKeys("999");
			
			btnSave2.click();
			
			try {
				
		        
				Thread.sleep(1000);
		
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
				
		    }   
//			
//			if(createSuccessNoti.getText().contains("The new account has created")) {
//			
//				System.out.println("Create Account : " + sAccountName + " Successful");
//				
//			}else if(Notification.getText().contains("Email has existed in system")) {
//			
//				System.out.println("Email "+ sEmail + "@gmail.com" +" is existed. Please use another email");
//		
//			}else if(wrongFormatEmail.getText().contains("Wrong format")) {
//				
//				System.out.println("Wrong email format.");
//			
//			}else if (codeIsExist.getText().contains("Code has existed in system")) {
//				
//				System.out.println("Code has existed in system. Please use another email");
//				
//			}
//			
//			String getCreateAccount = Notification.getText();
//			
//			if(getCreateAccount.contains("The new account has created.")) {
//				
//				System.out.println("Create account Successfully!!!");
//				
//			}
			
			break;
			
		//--------------Edit--------------
			
		case "Edit":
			
			filterBox.sendKeys(sAccountName);
			
			Thread.sleep(2000);
			
			fromDate.clear();
			
			fromDate.sendKeys("09/09/2019");
			
			btnSearch.click();
			
			try {
		        
				Thread.sleep(1000);
				
				chooseAccount.click();
				
				btnEdit.click();
		
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
				
		    } 
			
			inpEmail.click();
			
			if(sEmail.isEmpty()) {
				
				System.out.println("No Change");
				
			}else {
				
				inpEmail.clear();
				
				inpEmail.sendKeys(sEmail + "@gmail.com");
				
			}
			
			accType.click();
			
			if(sAccountType.contains("Standard")) {
				
				System.out.println("Account Type : Standard");
				
				standardType.click();
				
			}else {
				
				System.out.println("Account Type : Trial");
				
				trialType.click();
				
			}
			
			String checkEnableKind = checkEnable.getText();
			
			if(sEnable.contains("Y")) {
				
				if(checkEnableKind.isEmpty()) {
					
					checkEnable.click();
					
					System.out.println("Is Enable : Yes");
					
				}else {
					
					System.out.println("Is Enable : Yes");
					
				}
				
			}else if(sEnable.contains("N")) {
				
				if(checkEnableKind.isEmpty()) {
					
					System.out.println("Is Enable : No");
					
				}else {
					
					btnEnable.click();
					
					System.out.println("Is Enable : No");
					
				}
				
			}
			
			if(checkEnableKind.isEmpty()) {

				System.out.println("No password to change");
				
			}else {
				
				setPassword.click();
				
				System.out.println("Sending Password...");
				
				System.out.println("Password : " + sNewPassword);
				
				newPassword.sendKeys(sNewPassword);
				
				retypeNewPassWord.sendKeys(sRetypePassword);
				
			}
			
//			if(!errLimitPassword.isDisplayed()) {
	//
//				System.out.println(errLimitPassword.getText().trim());
//				
//				Assert.assertNotEquals(errLimitPassword.getText().trim(), "Your password has at least 8 characters, maximize 20 characters.");
//				
//			}
			
			if(sFullName.isEmpty()) {
				
				System.out.println("No change...");
				
			}else {
				
				editFullName.clear();
				
				editFullName.sendKeys(sFullName);
				
			}
			
			if(sAddress.isEmpty()) {
				
				System.out.println("No change...");
				
			}else {
				
				editAddress.clear();
				
				editAddress.sendKeys(sAddress);
				
			}
			
			if(Company.isEmpty()) {
				
				System.out.println("No change...");
				
			}else {
				
				impCompany.clear();
				
				impCompany.sendKeys(Company);
				
			}
			
			if(sCountry.isEmpty()) {
				
				System.out.println("No change...");
				
			}else {
				
				inpCountry.clear();
				
				inpCountry.sendKeys(sCountry);
				
			}
			
			if(CountryCode.isEmpty()) {
				
				System.out.println("No change...");
				
			}else {
				
				inpCountryCode.clear();
				
				inpCountryCode.sendKeys(CountryCode);
				
			}
			
			if(PhoneNo.isEmpty()) {
				
				System.out.println("No change...");
				
			}else {
				
				inpPhoneNo.clear();
				
				inpPhoneNo.sendKeys(PhoneNo);
				
			}
			
			break;
			
		//--------------Delete--------------
			
		case "Delete":
			
			filterBox.sendKeys(sAccountName);
			
			Thread.sleep(2000);
			
			fromDate.clear();
			
			fromDate.sendKeys("09/09/2019");
			
			btnSearch.click();
			
			try {
		        
				Thread.sleep(1000);
				
				chooseAccount.click();
				
				btnDelete.click();
		
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
				
		    } 
			
			String errorDelete = Notification.getText().trim();
			
			if(errorDelete.contains("The system does not allow to delete enabled account.")) {
				
				btnEdit.click();
				
				Actions atc = new Actions(driver);
				
				atc.moveToElement(radioSynch).doubleClick(radioSynch).click().build().perform();
				
				btnSave.click();
				
				try {
			        
					Thread.sleep(1000);
			
				} catch (InterruptedException e) {
			    
					e.printStackTrace();
					
			    } 
				
				filterBox.sendKeys(sAccountName);
				
				Thread.sleep(1000);
				
				fromDate.clear();
				
				fromDate.sendKeys("09/09/2019");
				
				btnSearch.click();
				
				String getAccountDelete = chooseAccount.getText().trim();
				
				if(getAccountDelete.contains(sAccountName)) {
					
					chooseAccount.click();
					
					btnDelete.click();
					
					confirmDelete.click();
					
					System.out.println("Delete Account" + sAccountName + "Successful!!");
					
				}else {
					
					System.out.println("Account " + sAccountName + " is not present!!!");
					
				}
				
			}else{
				
				confirmDelete.click();
				
				System.out.println("Delete Account" + sAccountName + "Successful!!");
				
			}
			
			break;
			
			default:
				
				System.out.println("Processing...");
		
		}
		
		
	}
	
	public void loginAccoutTest(String sAccountName, String sNewPassword) {
		
		Actions actions = new Actions(driver);
		
	  	actions.moveToElement(profileIcon).click().build().perform();
		
		try {
			
	        
			Thread.sleep(5000);
			
	    } 
		
		catch (InterruptedException e) {
	    
			e.printStackTrace();
			
	    }   
		
		btnSignOut.click();
		
		vUsername.sendKeys(sAccountName);
		
		vPassword.sendKeys(sNewPassword);
		
		btnLogin.click();
		
		try {
			
	        
			Thread.sleep(1000);
	    } 
		
		catch (InterruptedException e) {
	    
			e.printStackTrace();
			
	    }   
		
		String getProfileQuest = profileIcon.getText().trim();
		
		Assert.assertEquals(getProfileQuest, sAccountName);
		
		System.out.println("Login Guest Account Successful!");
		
		Actions actions2 = new Actions(driver);
		
	  	actions2.moveToElement(btnMonitor).click().build().perform();
		
		List<WebElement> guestMonitor = subMenu.findElements(By.tagName("li"));
		
		int getGuestMonitor = guestMonitor.size();		
		
		for(int i = 0; i < getGuestMonitor; i++) {
			
			String getListGuestMonitor = guestMonitor.get(i).getText();
			
			System.out.println("List Monitor of the user include : " + getListGuestMonitor);
			
		}
		
		try {
	        
			Thread.sleep(1000);
			
			Actions actions4 = new Actions(driver);
			
		  	actions4.moveToElement(btnBuild).click().build().perform();
		  	
		  	List<WebElement> getBuildList = listBuildProcess.findElements(By.tagName("li"));
		  	
		  	int listBuildProcessSize = getBuildList.size();
		  	
		  	for (int i = 0; i < listBuildProcessSize; i++) {
		  		
		  		String buildProcessName = getBuildList.get(i).getText().trim();
		  		
		  		System.out.println(buildProcessName);
		  		
		  	}
		  	
	    } 
		
		catch (InterruptedException e) {
	    
			e.printStackTrace();
			
	    }   
		
	}

}
