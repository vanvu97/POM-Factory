package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.CustomerMngPage;
import Page.UCLoginPage;
import Utility.BaseTest;
import Utility.CustomerExcelFile;
import Utility.Links;

public class CustomerMngTest extends BaseTest {
  
	UCLoginPage loginUC;
	CustomerMngPage MngPgs;
	
	
	@Test(dataProvider="CustomerData"/*, invocationCount = 3*/)
  public void CreateAccount(String userName, String password,String AddOrDelete, String sAccountName, String sEmail, String sAccountType, String sEnable,String sNewPassword ,
		  String sRetypePassword , String sCode, String sFullName, String sAddress, String Company, String sCountry, String CountryCode, String PhoneNo) throws InterruptedException, FileNotFoundException {
		
		loginUC = new UCLoginPage(driver);
		
		MngPgs = new CustomerMngPage(driver);
		
		loginUC.LoginUC(userName, password);
		
		MngPgs.reachToCustomerSection();
		
		MngPgs.AddCustomer(AddOrDelete, sAccountName, sEmail, sAccountType, sEnable ,sNewPassword ,sRetypePassword 
				,sCode, sFullName, sAddress, Company, sCountry, CountryCode, PhoneNo);
		
//		MngPgs.loginAccoutTest(sAccountName, sNewPassword);
		
	}
	
	@DataProvider(name = "CustomerData")
	public Object[][] dataProvider() throws Exception {
		
	     Object[][] testObjArray = CustomerExcelFile.getTableArray(Links.PATH_TO_EXCEL_Customer,"Customer", 1);

	     return (testObjArray);
	
    
	}
	
}

