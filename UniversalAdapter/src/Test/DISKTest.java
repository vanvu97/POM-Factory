package Test;

import org.testng.annotations.Test;

import Page.DISKPage;
import Page.UCLoginPage;
import Utility.BaseTest;

public class DISKTest extends BaseTest{
	public static boolean bResult;
	UCLoginPage loginUC;
	DISKPage DiskOperation;
	
	@Test()
	public void login() {
		loginUC = new UCLoginPage(driver);
		DiskOperation = new DISKPage(driver);
		loginUC.LoginUC("admin", "123456");
		
		DiskOperation.CreateDiskOperation("Disk Operation Name");
		
		DiskOperation.CreateDiskConnection("Disk Connection Name","Directory");
		
	}
	
}
