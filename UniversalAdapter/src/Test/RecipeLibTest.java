package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.ActivatedProcessPage;
import Page.RecipeLibPage;
import Page.UCLoginPage;
import Utility.BaseTest;
import Utility.Links;
import Utility.RecipeFromLibExcel;

public class RecipeLibTest extends BaseTest{
	UCLoginPage loginUC;
	RecipeLibPage RecLib;
	
	ActivatedProcessPage schedule;
	
	@Test(dataProvider="RecipeLib")
	public void login(String sProcessName, String setTime, String recurTime, String runKinds, String sOption, String sDescription) throws InterruptedException {
		
		loginUC = new UCLoginPage(driver);
		
		RecLib = new RecipeLibPage(driver);
		
		schedule = new ActivatedProcessPage(driver);
		
		loginUC.LoginUC("VV02252020", "VV02252020");
		
		RecLib.CreateSchedule("!!!vvHTTP", sProcessName);
		
		schedule.doucumenentTrackingPgs();
		  
		schedule.scheduleSection(sProcessName, sDescription);
		  
		schedule.runOnetime(setTime, recurTime,runKinds , sOption, sProcessName);
		
	}
	
	@DataProvider(name = "RecipeLib")
	public Object[][] dataProvider() throws Exception {
		
	     Object[][] testObjArray = RecipeFromLibExcel.getTableArray(Links.PATH_TO_EXCEL_RecipeLib,"LibRecipe", 1);

	     return (testObjArray);
    
	}
	
	
}
