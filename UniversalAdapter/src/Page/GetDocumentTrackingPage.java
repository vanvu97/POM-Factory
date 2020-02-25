package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetDocumentTrackingPage {
	
	@FindBy (css = "#data-table-documentTracking")
	WebElement documentTrackingTable;

	@FindBy (css = "button.font-black")
	WebElement btnCloseVideo;
	
	@FindBy (css = "#monitor")
	WebElement btnMonitor;
	
	@FindBy (xpath = "/html/body/div[1]/div/ul/li[6]/ul/li[1]/a")
	WebElement DocumentTracking;
	
	@FindBy (xpath = "/html/body/div[2]/div/document-tracking/div/div/div/div[1]/form/div/div[1]/div[1]/div[1]/div/input")
	WebElement fromDate;
	
	@FindBy (css = "button.btn:nth-child(2)")
	WebElement btnSearch;
	
	@FindBy (xpath = "/html/body/div[2]/div/document-tracking/div/div/div/div[1]/div[3]/div/div/div[1]/div[2]/label/select")
	WebElement listNumber;
	
	@FindBy (xpath = "/html/body/div[2]/div/document-tracking/div/div/div/div[1]/div[3]/div/div/div[1]/div[2]/label/select/option[4]")
	WebElement number50;
	
	@FindBy (xpath = "//*[@id=\"data-table-documentTracking_next\"]")
	WebElement btnNext;
	
	@FindBy (xpath = "/html/body/div[2]/div/document-tracking/div/div/div/div[1]/div[3]/div/div/div[1]/div[1]/label/input")
	WebElement filterName;
	
	
	WebDriver driver;
	WebDriverWait wait;

	
	public GetDocumentTrackingPage(WebDriver driver) {
		
		this.driver = driver;
		
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void CreateXMLProfile(String RecipeName) {
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		try {
		    
			Thread.sleep(3000);
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		if (btnCloseVideo.isDisplayed()) {
			
			btnCloseVideo.click();
			
		}
		
		Actions hover = new Actions(driver);
		
		hover.moveToElement(btnMonitor).build().perform();
		
		executor.executeScript("arguments[0].click();", DocumentTracking);

		
		try {
		    
			Thread.sleep(1000);
			
			fromDate.click();
			
			fromDate.clear();
			
			fromDate.sendKeys("02/06/2019");
			
//			btnSearch.click();
			
			filterName.click();
			
			filterName.sendKeys(RecipeName);
			
			Thread.sleep(3000);
			
			executor.executeScript("arguments[0].click();", listNumber);
			
			listNumber.click();
			
			executor.executeScript("arguments[0].click();", number50);
			
			number50.click();

			
			
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		try 	{
		    
			Thread.sleep(2000);
			
			List<WebElement> tableRows = documentTrackingTable.findElements(By.tagName("tr"));
			
			int rowCount = tableRows.size();
			
			for (int row = 0; row < rowCount; row++) {
				
				List<WebElement> columnsRow = documentTrackingTable.findElements(By.tagName("td"));
				
				int countRowDoc = columnsRow.size();
				
				for(int rowDoc = 0; rowDoc < countRowDoc; rowDoc++) {
					
					String rowtex3 = columnsRow.get(rowDoc).getText();
					
					System.out.println(rowtex3);
					
//					if(rowDoc == 1 || rowDoc == 4 || rowDoc == 5 || rowDoc == 6 || rowDoc == 7 || rowDoc == 10) {
//						
//						String rowtex2 = columnsRow.get(rowDoc).getText();
//						
//						System.out.println(rowtex2);
//						
//						int[] countRowDoc2 = {columnsRow.size()};
//						
//						for(int a : countRowDoc2) {
//							System.out.println(a);
//						}
//						
//					}
					
				}
				
							
				Thread.sleep(3000);
				
				executor.executeScript("arguments[0].click();", btnNext);
				
				Thread.sleep(3000);

			}
	    
		} catch (InterruptedException e) {
	    
			e.printStackTrace();
	    }   
		
		
	}
	
}
