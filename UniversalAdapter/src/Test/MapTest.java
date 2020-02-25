package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Page.MapPage;
import Page.UCLoginPage;
import Utility.BaseTest;

public class MapTest extends BaseTest{
	UCLoginPage loginUC;
	MapPage Map;
	
	
	@Test()
	public void login() throws AWTException {
		loginUC = new UCLoginPage(driver);
		Map = new MapPage(driver);
		loginUC.LoginUC("VV02052020", "VV02052020");
		
		Map.CreateMapEditor("Source XML TestAuto","Target XML TestAuto", "Test Map Editor");
	
	}
	
}
