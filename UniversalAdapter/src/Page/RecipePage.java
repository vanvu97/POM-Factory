package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecipePage {
	
	@FindBy (css = "button.font-black")
	WebElement btnCloseVideo;
	@FindBy (css = ".list__btn > li:nth-child(1) > a:nth-child(1)")
	WebElement BtnRecipe;
	@FindBy (css = "input.ng-valid-maxlength")
	WebElement InputName;
	@FindBy (css = ".btn-hover-stroke-info")
	WebElement btnCreate;
	@FindBy (css = ".btn-stroke")
	WebElement btnNew;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[2]/div[2]/ng-include/div/div[2]/div/div/div[3]/a")
	WebElement DISK;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[2]/div[2]/ng-include/div/div[2]/div/div/div[4]/a")
	WebElement SOAP;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[2]/div[2]/ng-include/div/div[2]/div/div/div[5]/a")
	WebElement HTTP;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[2]/div[2]/ng-include/div/div[2]/div/div/div[6]/a")
	WebElement MAP;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/a/div[2]/h4")
	WebElement SOAP2;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/a/div[2]/h4")
	WebElement HTTP2;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[4]/a/div[2]/h4")
	WebElement MAP2;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[5]/a/div[2]/h4")
	WebElement DISK2;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[1]/a/div[2]/h4")
	WebElement to;
	
	@FindBy (css = "div.jtk-endpoint:nth-child(6) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement StartEnd;
	@FindBy (css = "div.jtk-endpoint:nth-child(9) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement SOAPStart;
	@FindBy (css = "div.jtk-endpoint:nth-child(8) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement SOAPEnd;
	@FindBy (css = "div.jtk-endpoint:nth-child(11) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement MAPStart;
	@FindBy (css = "div.jtk-endpoint:nth-child(10) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement MAPEnd;
	@FindBy (css = "div.jtk-endpoint:nth-child(13) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement DISKStart;
	@FindBy (css = "div.jtk-endpoint:nth-child(12) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement DISKEnd;
	@FindBy (css = "div.jtk-endpoint:nth-child(7) > svg:nth-child(1) > circle:nth-child(1)")
	WebElement End;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[3]/div[1]/a/i")
	WebElement SOAPConfig;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[3]/div/select")
	WebElement SOAPAction;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[3]/div/select/option[2]")
	WebElement ActionGet;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[3]/div/select/option[3]")
	WebElement ActionSend;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[5]/div[1]/div/input")
	WebElement sendWSDL_URL;
	@FindBy (css = "textarea.ng-pristine")
	WebElement sendEnvelope;
	@FindBy (css = "#save-btn")
	WebElement saveBTN;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[4]/div/div/button[1]")
	WebElement HTTPConnection;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[4]/div/div/div/div[1]/div/input")
	WebElement inpFileName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[5]/div/div/button[1]")
	WebElement HTTPOperation;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[5]/div/div/div/div[1]/div/input")
	WebElement inpFileName2;
	
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[4]/div[1]/a/i")
	WebElement MAPConfig;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[2]/div/div/button[1]")
	WebElement clickMap;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div[2]/form/div/div[1]/div[2]/div/div/div/div[1]/div/input")
	WebElement inpMapName;
	@FindBy (css = "li.abn-tree-row:nth-child(1) > a:nth-child(1) > span:nth-child(2)")
	WebElement selectMAP;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[3]/div/div/div/div[1]/div/div/div[5]/div[1]/a/i")
	WebElement DISKConfig;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div/form/div/div/div/div[3]/div/select")
	WebElement DISKAction;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div/form/div/div/div/div[3]/div/select/option[1]")
	WebElement DiskGet;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[2]/div[1]/ng-include/div/form/div/div/div/div[3]/div/select/option[2]")
	WebElement DiskSend;
	@FindBy (css = "div.form-group:nth-child(4) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
	WebElement DiskConnection;
	@FindBy (css = "div.form-group:nth-child(5) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
	WebElement DiskOperation;
	@FindBy (css = ".open > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	WebElement selectFileConfig;
	
	@FindBy (css = "div.di__ui-layout-action:nth-child(4) > button:nth-child(1)")
	WebElement btnSave;
	@FindBy (css = ".lobibox-notify")
	WebElement notiPopup;
	@FindBy (css = ".btn-success")
	WebElement btnExecute;

	String WSDL_URL = "https://stdemo508.smartturn.com/services/OccamService";
	String Envelope = "<x:Envelope xmlns:x=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ba=\"http://www.smartturn.com/services/OccamService/ba\" xmlns:occ=\"http://www.smartturn.com/services/occamtypes\">\n" + 
			"    <x:Header/>\n" + 
			"    <x:Body>\n" + 
			"        <ba:lookUpBusinessAffiliates>\n" + 
			"            <ba:inCredential>\n" + 
			"                <occ:UserId>admin@dicentral.com</occ:UserId>\n" + 
			"                <occ:Password>Test.123</occ:Password>\n" + 
			"            </ba:inCredential>\n" + 
			"        </ba:lookUpBusinessAffiliates>\n" + 
			"    </x:Body>\n" + 
			"</x:Envelope>";
			
	
	WebDriver driver;
	WebDriverWait wait;

	
	public RecipePage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void CreateSOAPRecipe(String RecipeName, String MapName, String OperationName, String ConnectionName) {
		
		try {
		    
			Thread.sleep(3000);
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		if (btnCloseVideo.isDisplayed()) {
			
			btnCloseVideo.click();
			
		}
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", BtnRecipe);
		
		InputName.sendKeys(RecipeName);
		
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", btnCreate);
		
		try {
		    
			Thread.sleep(2000);
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    } 
		
		final String JS_DRAG_AND_DROP = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEff"
				+ "ect:'',effectAllowed:'all',files:[],items:{},types:[],setData:f"
				+ "unction(format,data){this.items[format]=data;this.types.append("
				+ "format);},getData:function(format){return this.items[format];},"
				+ "clearData:function(format){}};var emit=function(event,target){v"
				+ "ar evt=document.createEvent('Event');evt.initEvent(event,true,f"
				+ "alse);evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);}"
				+ ";emit('dragstart',src);emit('dragenter',tgt);emit('dragover',tg"
				+ "t);emit('drop',tgt);emit('dragend',src);";

		JavascriptExecutor ShapeTo = (JavascriptExecutor) driver;

			
			ShapeTo.executeScript(JS_DRAG_AND_DROP, new Object[] { SOAP, to });
			
			Actions DropNe = new Actions(driver);
			
			DropNe.dragAndDropBy(SOAP2, 370, 104).build().perform();
			
			ShapeTo.executeScript(JS_DRAG_AND_DROP, new Object[] { MAP, to });
			
			DropNe.dragAndDropBy(MAP2, 133, 184).build().perform(); 
			
			ShapeTo.executeScript(JS_DRAG_AND_DROP, new Object[] { DISK, to });
			
			DropNe.dragAndDropBy(DISK2, 371, 188).build().perform(); 
			
			Actions DropConnect = new Actions(driver);
			
			DropConnect.dragAndDrop(StartEnd, SOAPStart).build().perform();
			
			DropConnect.dragAndDrop(SOAPEnd, MAPStart).build().perform();
			
			DropConnect.dragAndDrop(MAPEnd, DISKStart).build().perform();
			
			DropConnect.dragAndDrop(DISKEnd, End).build().perform();
			
//			------------------Configuration SOAP----------------------------
			
			DropNe.moveToElement(SOAP2).build().perform();
			
			SOAPConfig.click();
			
			executor.executeScript("arguments[0].click();", SOAPAction);
			
			executor.executeScript("arguments[0].click();", ActionGet);
			
			sendWSDL_URL.click();
			
			executor.executeScript("arguments[0].click();", sendWSDL_URL);
			
			sendWSDL_URL.sendKeys(WSDL_URL);
			
			sendEnvelope.sendKeys(Envelope);
			
			saveBTN.click();
			
			if(notiPopup.getText().contains("successful")) {
				
				System.out.println("The SOAP was saved successful!");
				
			}else {
				
				System.out.println("Save Failed");
				
			}
			
//			------------------Configuration MAP----------------------------
			
			DropNe.moveToElement(MAP2).build().perform();
			
			MAPConfig.click();
			
			executor.executeScript("arguments[0].click();", clickMap);
			
			inpMapName.sendKeys(MapName);
			

			try {
			    
				Thread.sleep(2000);
				
				selectMAP.click();
		    
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
		    } 
			
			executor.executeScript("arguments[0].click();", saveBTN);

			if(notiPopup.getText().contains("successful")) {
				
				System.out.println("The MAP was saved successful!");
				
			}else {
				
				System.out.println("Save Failed");
				
			}
			
//			------------------Configuration DISK----------------------------
			
			DropNe.moveToElement(DISK2).build().perform();
			
			DISKConfig.click();
			
			DISKAction.click();
			
			DiskSend.click();
			
			DiskConnection.click();
			
			DiskConnection.sendKeys(ConnectionName);
			
			selectFileConfig.click();
			
			DiskOperation.click();
			
			DiskOperation.sendKeys(OperationName);
			
			selectFileConfig.click();
			
			saveBTN.click();

			if(notiPopup.getText().contains("successful")) {
				
				System.out.println("The DISK was saved successful!");
				
			}else {
				
				System.out.println("Save Failed");
				
			}
			
			btnSave.click();
			
			if(notiPopup.getText().contains("successful")) {
				
				System.out.println("The recipe " + RecipeName + " was saved successful!");
				
			}else {
				
				System.out.println("Save Failed");
				
			}
			
			try {
			    
				Thread.sleep(2000);
				
				executor.executeScript("arguments[0].click();", btnExecute);
		    
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
		    } 
			
	}
			
			
//			-------------HH---HH--TTTTTTTT--TTTTTTTT--PPPPPPP------------
//			-------------HH---HH-----TT--------TT-----PP----PP-----------
//			-------------HHHHHHH-----TT--------TT-----PPPPPPP------------
//			-------------HH---HH-----TT--------TT-----PP-----------------
//			-------------HH---HH-----TT--------TT-----PP-----------------
			
	public void CreateHTTPRecipe(String RecipeName,String HttpConnectionFile, String HttpOperationFile, String MapName, String DiskOperationName, String DiskConnectionName) throws InterruptedException {
		
//			try {
//			    
//				Thread.sleep(3000);
//		    
//			} catch (InterruptedException e) {
//		    
//				e.printStackTrace();
//		    }   
//			
//			if (btnCloseVideo.isDisplayed()) {
//				
//				btnCloseVideo.click();
//				
//			} else {
//				
//				System.out.println("There is no ads");
//				
//			}
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			
			executor.executeScript("arguments[0].click();", BtnRecipe);
			
			InputName.sendKeys(RecipeName);
			
			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();", btnCreate);
			
			try {
			    
				Thread.sleep(2000);
		    
			} catch (InterruptedException e) {
		    
				e.printStackTrace();
		    } 
			
			final String JS_DRAG_AND_DROP = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEff"
				+ "ect:'',effectAllowed:'all',files:[],items:{},types:[],setData:f"
				+ "unction(format,data){this.items[format]=data;this.types.append("
				+ "format);},getData:function(format){return this.items[format];},"
				+ "clearData:function(format){}};var emit=function(event,target){v"
				+ "ar evt=document.createEvent('Event');evt.initEvent(event,true,f"
				+ "alse);evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);}"
				+ ";emit('dragstart',src);emit('dragenter',tgt);emit('dragover',tg"
				+ "t);emit('drop',tgt);emit('dragend',src);";

			JavascriptExecutor ShapeTo = (JavascriptExecutor) driver;
			
				Actions Drop2 = new Actions(driver);
	
				ShapeTo.executeScript(JS_DRAG_AND_DROP, new Object[] { HTTP, to });
				
				Drop2.dragAndDropBy(HTTP2, 370, 104).build().perform();
				
				ShapeTo.executeScript(JS_DRAG_AND_DROP, new Object[] { MAP, to });
				
				Drop2.dragAndDropBy(MAP2, 133, 184).build().perform(); 
				
				ShapeTo.executeScript(JS_DRAG_AND_DROP, new Object[] { DISK, to });
				
				Drop2.dragAndDropBy(DISK2, 371, 188).build().perform(); 
				
				Actions DropConnect2 = new Actions(driver);
				
				DropConnect2.dragAndDrop(StartEnd, SOAPStart).build().perform();
				
				DropConnect2.dragAndDrop(SOAPEnd, MAPStart).build().perform();
				
				DropConnect2.dragAndDrop(MAPEnd, DISKStart).build().perform();
				
				DropConnect2.dragAndDrop(DISKEnd, End).build().perform();
				
	//			------------------Configuration HTTP Client----------------------------
				
				Drop2.moveToElement(HTTP2).build().perform();
				
				SOAPConfig.click();
				
				executor.executeScript("arguments[0].click();", HTTPConnection);
				
				inpFileName.sendKeys(HttpConnectionFile);
				
				Thread.sleep(4000);
				
				if(selectFileConfig.getText().contains(HttpConnectionFile)) {
					
					String HTTPConectionFileName = selectFileConfig.getText();
					
					System.out.println(HTTPConectionFileName);
					
					selectFileConfig.click();
					
					System.out.println("The HTTP Connection File Was Seclected!");
					
				} else {
					
					String errorPage = "File not found";
					
					System.out.println("File not found");
					
					Assert.assertNotEquals(errorPage, errorPage);
					
				}
				
				Thread.sleep(1000);
				
				executor.executeScript("arguments[0].click();", HTTPOperation);
				
				inpFileName2.sendKeys(HttpOperationFile);
				
				Thread.sleep(4000);
				
				if(selectFileConfig.getText().contains(HttpOperationFile)) {
					
					String HTTPOperationFileName = selectFileConfig.getText();
					
					System.out.println(HTTPOperationFileName);
					
					selectFileConfig.click();
					
					System.out.println("The HTTP Operation File Was Seclected!");
					
				} else {
					
					String errorPage = "File not found";
					
					System.out.println("File not found");
					
					Assert.assertNotEquals(errorPage, errorPage);
					
				}
				
	//			-------------------------------
	
				saveBTN.click();
				
				if(notiPopup.getText().contains("successful")) {
					
					System.out.println("The SOAP was saved successful!");
					
				}else {
					
					System.out.println("Save Failed");
					
				}
				
	//			------------------Configuration MAP----------------------------
				
				Drop2.moveToElement(MAP2).build().perform();
				
				MAPConfig.click();
				
				executor.executeScript("arguments[0].click();", clickMap);
				
				inpMapName.sendKeys(MapName);
				
	
				try {
				    
					Thread.sleep(2000);
					
					selectMAP.click();
			    
				} catch (InterruptedException e) {
			    
					e.printStackTrace();
			    } 
				
				executor.executeScript("arguments[0].click();", saveBTN);
	
				if(notiPopup.getText().contains("successful")) {
					
					System.out.println("The MAP was saved successful!");
					
				}else {
					
					System.out.println("Save Failed");
					
				}
				
	//			------------------Configuration DISK----------------------------
				
				Drop2.moveToElement(DISK2).build().perform();
				
				DISKConfig.click();
				
				Thread.sleep(1000);
				
				executor.executeScript("arguments[0].click();", DISKAction);
				
				DiskSend.click();
				
				DiskConnection.click();
				
				DiskConnection.sendKeys(DiskConnectionName);
				
				selectFileConfig.click();
				
				DiskOperation.click();
				
				DiskOperation.sendKeys(DiskOperationName);
				
				selectFileConfig.click();
				
				saveBTN.click();
	
				if(notiPopup.getText().contains("successful")) {
					
					System.out.println("The DISK was saved successful!");
					
				}else {
					
					System.out.println("Save Failed");
					
				}
				
				btnSave.click();
				
				if(notiPopup.getText().contains("successful")) {
					
					System.out.println("The recipe " + RecipeName + " was saved successful!");
					
				}else {
					
					System.out.println("Save Failed");
					
				}
				
				try {
				    
					Thread.sleep(2000);
					
					executor.executeScript("arguments[0].click();", btnExecute);
			    
				} catch (InterruptedException e) {
			    
					e.printStackTrace();
			    } 
		
	}
	
}
