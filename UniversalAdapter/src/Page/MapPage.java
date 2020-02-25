package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MapPage {
	
	@FindBy (css = "button.font-black")
	WebElement btnCloseVideo;
	@FindBy (css = ".btn-stroke")
	WebElement btnNew;	
	@FindBy (css = "select.form-control")
	WebElement selectType;
	@FindBy (xpath = "/html/body/div[1]/div/div/form/div[2]/div/div[1]/div[1]/select/optgroup[3]/option")
	WebElement MapEditor;
	@FindBy (css = "input.ng-invalid")
	WebElement inpName;
	@FindBy (css = ".btn-hover-stroke-info")
	WebElement btnCreate;
	@FindBy (css = ".lobibox-notify")
	WebElement notificationPopup;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[1]/div[1]/button")
	WebElement sourceProfile;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[1]/div/button")
	WebElement targetProfile;
	@FindBy (xpath = "//*[@id=\"sourceProfileName\"]")
	WebElement chooseSource;
	@FindBy (xpath = "//*[@id=\"targetProfileName\"]")
	WebElement ChooseTarget;
	@FindBy (css = ".open > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	WebElement firstSelect;
	
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[3]/ul/li/span")
	static
	WebElement firstSourceElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[3]/ul/li")
	static
	WebElement firstTargetElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[2]/div/ul/li/ul/li[2]/ul/li[1]/span/span[3]")
	WebElement secondSourceElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[2]/div/ul/li/ul/li[2]/ul/li[1]/span/span[3]")
	WebElement secondTargetElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[1]/span/span[3]")
	WebElement thirdSourceElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[1]/span/span[3]")
	WebElement thirdTagetElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[2]/ul/li/span/span[3]")
	WebElement fourthSourceElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[2]/ul/li/span/span[3]")
	WebElement fourthTargetElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[3]/ul/li/span/span[3]")
	WebElement fifthSourceElement;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[3]/ul/li/span/span[3]")
	WebElement fifthTargetElement;
	@FindBy (css = ".btn-hover-stroke-green")
	WebElement btnSave;
	@FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a/uib-tab-heading/a")
	WebElement closeActivates;
	
	
	
	WebDriver driver;
	WebDriverWait wait;

	
	public MapPage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void CreateMapEditor(String HttpProfileSourceName, String HttpProfileTargetName, String importMapName) throws AWTException {
	
		try {
		    
			Thread.sleep(3000);
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		if (btnCloseVideo.isDisplayed()) {
			
			btnCloseVideo.click();
			
		} else {
			
			System.out.println("Not!");
			
		}
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript("arguments[0].click();", btnNew);
		
		try {
		    
			Thread.sleep(1000);
			
			selectType.click();
			
			executor.executeScript("arguments[0].click();", selectType);
			
			MapEditor.click();
			
			inpName.sendKeys(importMapName);
	    
			executor.executeScript("arguments[0].click();", btnCreate);
				
			executor.executeScript("arguments[0].click();", sourceProfile);

//			chooseSource.sendKeys(HttpProfileSourceName);
			
			Thread.sleep(3000);
			
			firstSelect.click();
			
			executor.executeScript("arguments[0].click();", targetProfile);
			
//			ChooseTarget.sendKeys(HttpProfileTargetName);
			
			Thread.sleep(3000);
			
			firstSelect.click();
			
			Actions DragDrop = new Actions(driver);
			
			Thread.sleep(1000);
			
			
			
//			drawBorder(driver, firstSourceElement, firstTargetElement);
			
			
//			DragDrop.clickAndHold(firstSourceElement).moveToElement(firstTargetElement).release().build().perform();
			
			 Point coordinates1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[1]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[2]/ul/li")).getLocation();
			 Point coordinates2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div/div[2]/div/div[3]/div[2]/div/ul/li/ul/li[2]/ul/li[2]/ul/li[2]/ul/li")).getLocation(); 
			 Robot robot = new Robot();           
			 robot.mouseMove(coordinates1.getX(), coordinates1.getY());
			 robot.mousePress(InputEvent.BUTTON1_MASK);
			 robot.mouseMove(coordinates2.getX(), coordinates2.getY());
			 robot.mouseRelease(InputEvent.BUTTON1_MASK);								
			 Thread.sleep(2000);
			 
//			 final String java_script =
//					 "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
//					                 "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
//					                 "ction(format,data){this.items[format]=data;this.types.append(for" +
//					                 "mat);},getData:function(format){return this.items[format];},clea" +
//					                 "rData:function(format){}};var emit=function(event,target){var ev" +
//					                 "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
//					                 "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
//					                 "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
//					                 "'drop',tgt);emit('dragend',src);";
//
//			 executor.executeScript(java_script, firstSourceElement, firstTargetElement);
//					         Thread.sleep(2000);
//					         
//					         executor.executeScript(java_script, new Object[] { firstSourceElement, firstTargetElement });
		
			
//			dragAndDrop(driver);
			
//			DragDrop.dragAndDrop(secondSourceElement, secondTargetElement).build().perform();
//			
//			DragDrop.dragAndDrop(thirdSourceElement, thirdTagetElement).build().perform();
//			
//			DragDrop.dragAndDrop(fifthSourceElement, fifthTargetElement).build().perform();
			
//			btnSave.click();
			
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }  
		
//		executor.executeScript("arguments[0].click();", closeActivates);
		
	}
	
	public static void drawBorder(WebDriver driver, WebElement firstSourceElement2, WebElement firstTargetElement2)
    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='2px solid green'", firstSourceElement);
        
        jse.executeScript("arguments[0].style.border='2px solid green'", firstTargetElement);
    }
//	
//	public static void dragAndDrop(WebDriver driver)
//    {
//        JavascriptExecutor js = (JavascriptExecutor) driver; 
//
//        js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
//                + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
//                + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
//                + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
//                + "\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
//                + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
//                + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
//                + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
//                + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
//                + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
//                + "var dropEvent = createEvent('drop');\n"
//                + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
//                + "var dragEndEvent = createEvent('dragend');\n"
//                + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
//                + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
//                + "simulateHTML5DragAndDrop(source,destination);", firstSourceElement, firstTargetElement);
//  
//    
//    }
	
}
