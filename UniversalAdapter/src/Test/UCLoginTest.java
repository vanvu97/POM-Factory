package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.UCLoginPage;
import Utility.AdminExcel;
import Utility.BaseTest;

public class UCLoginTest extends BaseTest{
	UCLoginPage loginUC;
	
	@Test(dataProvider="loginAdmin")
	public void login(String userName, String password) {
		loginUC = new UCLoginPage(driver);
		loginUC.LoginUC(userName, password);
	}
	@DataProvider(name = "loginAdmin")
	public Object[][] dataProvider() throws Exception {
		String filePath = System.getProperty("user.dir")+"\\src\\data\\";
		
	     Object[][] testObjArray = AdminExcel.getTableArray(filePath + "LoginAdmin.xlsx","loginAdmin", 1);

	     return (testObjArray);
	     
	}
	
}
