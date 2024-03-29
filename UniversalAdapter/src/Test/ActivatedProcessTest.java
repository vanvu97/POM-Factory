package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.ActivatedProcessPage;
import Page.UCLoginPage;
import Utility.BaseTest;
import Utility.Links;
import Utility.ScheduleExcelFile;

public class ActivatedProcessTest extends BaseTest{
	
	UCLoginPage loginUC;
	ActivatedProcessPage activatePgs;
	
	@Test(dataProvider="loginData"/*, invocationCount = 3*/)
  public void createShedule(String sProcessName, String setTime, String recurTime, String runKinds, String sOption, String sDescription) throws InterruptedException {
	  
	  loginUC = new UCLoginPage(driver);
	  
	  activatePgs = new ActivatedProcessPage(driver);
	  
	  loginUC.LoginUC("VV02242020", "VV02242020");
	  
	  activatePgs.doucumenentTrackingPgs();
	  
	  activatePgs.scheduleSection(sProcessName, sDescription);
	  
	  activatePgs.runOnetime(setTime, recurTime,runKinds , sOption, sProcessName);
	  
  }
  
  @DataProvider(name = "loginData")
  public Object[][] dataProvider() throws Exception {
		
		Object[][] testObjArray = ScheduleExcelFile.getTableArray(Links.PATH_TO_EXCEL_Schedule,"CreateSchedule", 1);

		return (testObjArray);
		
	}
  
//  @AfterMethod
//	public void tearDown(ITestResult testResult) throws IOException {	  
//      
//		if (testResult.getStatus() == ITestResult.FAILURE) { 
//      
//			String directory = Links.PATH_TO_IMG;
//      	
//			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//      	
//			FileUtils.copyFile(screenshot, new File(directory));
//      	
//			System.out.print("Screenshot is captured and stored in your " + directory);
//      
//		}
//		
//		if (testResult.getStatus() == ITestResult.FAILURE) { 
//			
//			String directory = Links.PATH_TO_EXCEL_Schedule;
//			 
////			 FileInputStream fis = new FileInputStream(directory);
////			 
////			 Workbook workbook = new XSSFWorkbook(fis);
////			 
////			 Sheet sheet = workbook.getSheetAt(0);
////			 
////			 Row row = sheet.getRow(1);
////			 
////			 Cell cell = row.createCell(15);
////			 
////			 cell.setCellValue("FAILED");
////			 
////			 FileOutputStream fos = new FileOutputStream(directory);
////			 
////			 workbook.write(fos);
////			 
////			 fos.close();
//			
//			 
//			 FileInputStream fis = new FileInputStream(directory);
//			 
//			 Workbook workbook = new XSSFWorkbook(fis);
//			 
//			 Sheet sheet = workbook.getSheetAt(0);
//			 
//			 int lastRow = sheet.getLastRowNum();
//			 
//			 for(int i=1; i<=lastRow; i++){
//			 
//			 Row row = sheet.getRow(i);
//			 
//			 Cell cell = row.createCell(15);
//			 
//			 cell.setCellValue("FAILED");
//			 
//			 }
//			 
//			 FileOutputStream fos = new FileOutputStream(directory);
//			 
//			 workbook.write(fos);
//			 
//			 fos.close();
//			
//		}else {
//			
//			String directory = Links.PATH_TO_EXCEL_Schedule;
//			 
////			 FileInputStream fis = new FileInputStream(directory);
////			 
////			 Workbook workbook = new XSSFWorkbook(fis);
////			 
////			 Sheet sheet = workbook.getSheetAt(0);
////			 
////			 Row row = sheet.getRow(1);
////			 
////			 Cell cell = row.createCell(15);
////			 
////			 cell.setCellValue("PASSED");
////			 
////			 FileOutputStream fos = new FileOutputStream(directory);
////			 
////			 workbook.write(fos);
////			 
////			 fos.close();
//			
//			 
//			 FileInputStream fis = new FileInputStream(directory);
//			 
//			 Workbook workbook = new XSSFWorkbook(fis);
//			 
//			 Sheet sheet = workbook.getSheetAt(0);
//			 
//			 int lastRow = sheet.getLastRowNum();
//			 
//			 for(int i=1; i<=lastRow; i++){
//			 
//			 Row row = sheet.getRow(i);
//			 
//			 Cell cell = row.createCell(15);
//			 
//			 cell.setCellValue("PASSED");
//			 
//			 }
//			 
//			 FileOutputStream fos = new FileOutputStream(directory);
//			 
//			 workbook.write(fos);
//			 
//			 fos.close();
//			
//		}
//
//		driver.close();
  
//	}
  
}
