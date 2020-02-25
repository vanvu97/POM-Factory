package Test;

import org.testng.annotations.Test;

import Page.JSONProfilePage;
import Page.UCLoginPage;
import Utility.BaseTest;

public class JSONProfileTest extends BaseTest{
	UCLoginPage loginUC;
	JSONProfilePage JSON;
	
	@Test()
	public void login() {
		loginUC = new UCLoginPage(driver);
		JSON = new JSONProfilePage(driver);
		loginUC.LoginUC("VV02052020", "VV02052020");
		
		JSON.CreateJSONProfile("222Source JSON TestAuto","T222arget JSON TestAuto");
	}
	
}
