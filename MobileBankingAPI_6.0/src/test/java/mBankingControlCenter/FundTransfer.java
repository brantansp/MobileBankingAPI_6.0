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



public class FundTransfer extends ExtentManager {
	
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	
	@Test
	public static void SelfAccountQuickFT() throws IOException, SQLException {
		request = StaticStore.SelfAccountQuickFT();
		response =sendReq(request, "SelfAccountQuickFT",resourceprop.getProperty("SelfAccountQuickFT"));
		assertResponse(response);
	}
	
	@Test
	public static void NEFT() throws IOException, SQLException {
		request = StaticStore.NEFT();
		response =sendReq(request, "NEFT",resourceprop.getProperty("NEFT"));
		assertResponse(response);
	}
	
	@Test
	public static void MobiletoAccount() throws IOException, SQLException {
		request = StaticStore.MobiletoAccount();
		response =sendReq(request, "MobiletoAccount",resourceprop.getProperty("MobiletoAccount"));
		assertResponse(response);
	}

	
	@Test
	public static void RTGS() throws IOException, SQLException {
		request = StaticStore.RTGS();
		response =sendReq(request, "RTGS",resourceprop.getProperty("RTGS"));
		assertResponse(response);
	}

}
