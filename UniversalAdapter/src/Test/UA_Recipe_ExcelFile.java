package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UA_Recipe_ExcelFile {

	public static WebDriver driver;
	public static Actions builder;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		builder = new Actions(driver);

		String urlUA = "https://uaqc.dicentral.com.vn:8884/Login";
		driver.get(urlUA);
		final String dir = System.getProperty("user.dir");
		File file = new File(dir + "\\RecipeLib.xlsx");
		FileInputStream iFile = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(iFile);
		XSSFSheet sheet = wb.getSheet("LibRecipe");
		int rowCount = sheet.getLastRowNum();
		System.out.println("So luong Recipe la : " + rowCount);

		try {

			WebDriverWait wait = new WebDriverWait(driver, 120, 1000);

			// Cho button Login hien thi
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[1]/input")));
			// Login
			driver.findElement(By.xpath("/html/body/form/div[1]/input")).sendKeys("oanhphan3");
			driver.findElement(By.xpath("/html/body/form/div[2]/input")).sendKeys("12345678");
			driver.findElement(By.xpath("/html/body/form/input[2]")).click();
			// button Recipe
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/button")));

			for (int row = 1; row <= rowCount; row++) {
				String recipename = sheet.getRow(row).getCell(1).getStringCellValue();
				
				String setTime = sheet.getRow(row).getCell(3).getStringCellValue();

				// Click button New
				WebElement btnNew = driver.findElement(By.cssSelector(".btn-left_panel > button"));
				ClickJavaScirpt(btnNew);

				// Select Type Disk Operation
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[1]/div/div/form/div[2]/div/div[1]/div[1]/select")));

				Select sl = new Select(
						driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div/div[1]/div[1]/select")));
				sl.selectByVisibleText("Recipe");

				// Nhap Name
				driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/div/div[2]/div[1]/input"))
						.sendKeys(recipename);
				// button Create
				driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[1]")).click();

				// Cho button chon Save hien thi
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[4]/button[1]")));

				// Click button Save Recipe
				driver.findElement(By.xpath(
						"/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/div[2]/ng-include/div/div[1]/div[4]/button[1]"))
						.click();
				// 

//				Thread.sleep(3000);
				// Cho button thong bao Save success hien thi
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[2]/div")));

				WebElement hovericonclose = driver.findElement(
						By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a/uib-tab-heading"));
				builder.moveToElement(hovericonclose).perform();

				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/ul/li[3]/a/uib-tab-heading/a"))
						.click();

				Thread.sleep(2000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}
			public static void ClickJavaScirpt(WebElement btn) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", btn);
			}		

}
