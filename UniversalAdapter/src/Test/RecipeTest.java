package Test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Page.DISKPage;
import Page.HTTPPage;
import Page.JSONProfilePage;
import Page.MapPage;
import Page.RecipePage;
import Page.UCLoginPage;
import Page.XMLProfilePage;
import Utility.BaseTest;
import Utility.Links;

public class RecipeTest extends BaseTest{
	UCLoginPage loginUC;
	RecipePage Recipe;
	DISKPage Disk;
	HTTPPage HTTP;
	XMLProfilePage profileXML;
	JSONProfilePage profileJSON;
	MapPage Map;
	
	String HttpOperationFile = "11!!!SpeciFic1";
	String HttpConnectionFile = "11!!!SpeciFic2";
	String HttpConnectionUrl = "https://my-json-server.typicode.com/typicode/demo/db";
	String HttpProfileSourceName = "11!!! Source HTTP";
	String HttpProfileTargetName = "11!!! Target HTTP";
	String DiskOperationName = "11!!A Disk Operation";
	String DiskConnectionName = "11!!A Disk Connection";
	String DiskDirectory = "vvVanVu";
	String RecipeName = "Recipe HTTP";
	String importMapName = "Map Name";
	
	@Test()
	public void login() throws InterruptedException, AWTException {
		loginUC = new UCLoginPage(driver);
		Recipe = new RecipePage(driver);
		HTTP = new HTTPPage(driver);
		Disk = new DISKPage(driver);
		profileJSON = new JSONProfilePage(driver);
		Map = new MapPage(driver);
		loginUC.LoginUC("VV02052020", "VV02052020");

		HTTP.CreateHttpOperation(HttpOperationFile);
		HTTP.CreateHttpConnection(HttpConnectionFile, HttpConnectionUrl);
		
		Disk.CreateDiskOperation(DiskOperationName);
		Disk.CreateDiskConnection(DiskConnectionName, DiskDirectory);
		
		profileJSON.CreateJSONProfile(HttpProfileSourceName, HttpProfileTargetName);
		
		Map.CreateMapEditor(HttpProfileSourceName, HttpProfileTargetName, importMapName);
		
		Recipe.CreateHTTPRecipe(RecipeName, HttpConnectionFile, 
				HttpOperationFile, importMapName, DiskOperationName, DiskConnectionName);
	}
	
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {	  
        
		if (testResult.getStatus() == ITestResult.FAILURE) { 
        
			String directory = Links.PATH_TO_IMG;
        	
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	
			FileUtils.copyFile(screenshot, new File(directory));
        	
			System.out.print("Screenshot is captured and stored in your " + directory);
        
		}
	}
}
