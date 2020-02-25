package Test;

import org.testng.annotations.Test;

import Page.GetDocumentTrackingPage;
import Page.UCLoginPage;
import Utility.BaseTest;

public class GetDocumentTrackingTest extends BaseTest{
	UCLoginPage loginUC;
	GetDocumentTrackingPage DMT;
	
	@Test()
	public void login() {
		loginUC = new UCLoginPage(driver);
		DMT = new GetDocumentTrackingPage(driver);
		loginUC.LoginUC("VV01312020", "VV01312020");
		
		DMT.CreateXMLProfile("01312020 - Daily - 10m/1d");
	}
	
}
