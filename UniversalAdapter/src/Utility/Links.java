package Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Links {
		
	public static Date date = new Date();
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh.mm.ss");

	public static String formattedDate = sdf.format(date);
	
	public static final String URL_login_DIWeb = "http://diweb5test.dicentral.com/Main.aspx";
	public static final String URL_Login_SapByDesign = "https://my347733.sapbydesign.com/";
	public static final String URL_Facebook = "https://fb.com";
	public static final String URL_ByDesign_347733 = "https://my347733.sapbydesign.com";
	public static final String PATH_TO_EXCEL_RecipeLib = System.getProperty("user.dir") + File.separator +"\\src\\data\\" + File.separator + "RecipeLib.xlsx";
	public static final String PATH_TO_EXCEL_Customer = System.getProperty("user.dir") + File.separator +"\\src\\data\\" + File.separator + "CustomerExcel.xlsx";
	public static final String PATH_TO_EXCEL_Schedule = System.getProperty("user.dir") + File.separator +"\\src\\data\\" + File.separator + "ScheduleExcel.xlsx";
	public static final String PATH_TO_EXCEL_Build = System.getProperty("user.dir") + File.separator +"\\src\\data\\" + File.separator + "BuildExcel.xlsx";
	public static final String URL_UC = "http://172.16.0.104:8089/#!/";
	public static final String URL_UC_QCCIP = "https://uaqc.dicentral.com.vn:8884/#!/";
	public static final String URL_UC_Customer = "http://172.16.0.104:8089/#!/customers";
    public static final String PATH_TO_IMG = System.getProperty("user.dir") + File.separator + "Error" + File.separator + formattedDate + ".png";

  }
