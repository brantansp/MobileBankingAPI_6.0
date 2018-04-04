package mBankingControlCenter;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import mBankingPageObjectModel.StaticStore;
import mBankingUtilityCenter.ExtentManager;
import mBankingUtilityCenter.HttpConnect;
import java.io.IOException;
import java.sql.SQLException;



public class Favourites extends ExtentManager{
	
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	@Test
	public static void ADDFavourite() throws IOException, SQLException {
		request = StaticStore.ADDFavourite();
		response =sendReq(request, "ADDFavourite",resourceprop.getProperty("ADDFavourite"));
		assertResponse(response);
	}
	
	@Test
	public static void DeleteFavourite() throws IOException, SQLException {
		request = StaticStore.DeleteFavourite();
		response =sendReq(request, "DeleteFavourite",resourceprop.getProperty("DeleteFavourite"));
		assertResponse(response);
	}

}
