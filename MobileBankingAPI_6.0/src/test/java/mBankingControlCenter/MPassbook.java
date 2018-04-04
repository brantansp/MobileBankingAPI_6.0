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



public class MPassbook extends ExtentManager{
	
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	@Test
	public static void mPassbookviaNumberofTxns() throws IOException, SQLException {
		request = StaticStore.mPassbookviaNumberofTxns();
		response =sendReq(request, "mPassbookviaNumberofTxns",resourceprop.getProperty("mPassbookviaNumberofTxns"));
		assertResponse(response);
	}
	
	
	
	@Test
	public static void mPassbookviaNumberofdays() throws IOException, SQLException {
		request = StaticStore.mPassbookviaNumberofdays();
		response =sendReq(request, "mPassbookviaNumberofdays",resourceprop.getProperty("mPassbookviaNumberofdays"));
		assertResponse(response);
	}
	
	
	@Test
	public static void mPassbookEmail() throws IOException, SQLException {
		request = StaticStore.mPassbookEmail();
		response =sendReq(request, "mPassbookEmail",resourceprop.getProperty("mPassbookEmail"));
		assertResponse(response);
	}
	
	
	@Test
	public static void mPassbookpdf() throws IOException, SQLException {
		request = StaticStore.mPassbookpdf();
		response =sendReq(request, "mPassbookpdf",resourceprop.getProperty("mPassbookpdf"));
		assertResponse(response);
	}

}
