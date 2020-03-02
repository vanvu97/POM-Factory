package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vuvan\\Downloads\\Driver\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
////		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//		options.addArguments("--disable-extensions");
//		options.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	
//	@AfterMethod
//	
//public void tearDOwn() {
//		
//		driver.close();
//		
//	}
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
//			String directory = Links.PATH_TO_EXCEL_Customer;
//			 
////			 FileInputStream fis = new FileInputStream(directory);
////			 
////			 Workbook workbook = new XSSFWorkbook(fis);
////			 
////			 Sheet sheet = workbook.getSheetAt(0);
////			 
////			 Row row = sheet.getRow(1);
////			 
////			 Cell cell = row.createCell(16);
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
//			 Cell cell = row.createCell(17);
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
//			String directory = Links.PATH_TO_EXCEL_Customer;
//			 
////			 FileInputStream fis = new FileInputStream(directory);
////			 
////			 Workbook workbook = new XSSFWorkbook(fis);
////			 
////			 Sheet sheet = workbook.getSheetAt(0);
////			 
////			 Row row = sheet.getRow(1);
////			 
////			 Cell cell = row.createCell(16);
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
//			 Cell cell = row.createCell(17);
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
//	}

}
