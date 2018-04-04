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



public class BillPayments extends ExtentManager{
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	//@Test
	public static void BillerDownload() throws IOException, SQLException {
		request = StaticStore.BillerDownload();
		response =sendReq(request, "BillerDownload",resourceprop.getProperty("BillerDownload"));
		assertResponse(response);
	}
	
	
	@Test
	public static void BillFetch() throws IOException, SQLException {
		request = StaticStore.BillFetch();
		response =sendReq(request, "BillFetch",resourceprop.getProperty("BillFetch"));
		assertResponse(response);
	}
	
	//@Test
	public static void BillerRegistration() throws IOException, SQLException {
		request = StaticStore.BillerRegistration();
		response =sendReq(request, "BillerRegistration",resourceprop.getProperty("BillerRegistration"));
		assertResponse(response);
	}
	
	//@Test
	public static void BillPaymentConfirmation() throws IOException, SQLException {
		request = StaticStore.BillPaymentConfirmation();
		response =sendReq(request, "BillPaymentConfirmation",resourceprop.getProperty("BillPaymentConfirmation"));
		assertResponse(response);
	}
	
	
	//@Test
	public static void BillPayment() throws IOException, SQLException {
		request = StaticStore.BillPayment();
		response =sendReq(request, "BillPayment",resourceprop.getProperty("BillPayment"));
		assertResponse(response);
	}
	
	@Test
	public static void FetchRegisteredBiller() throws IOException, SQLException {
		request = StaticStore.FetchRegisteredBiller();
		response =sendReq(request, "FetchRegisteredBiller",resourceprop.getProperty("FetchRegisteredBiller"));
		assertResponse(response);
	}
	
	
	@Test
	public static void BillerDeletion() throws IOException, SQLException {
		request = StaticStore.BillerDeletion();
		response =sendReq(request, "BillerDeletion",resourceprop.getProperty("BillerDeletion"));
		assertResponse(response);
	}
	
	
	@Test
	public static void BillPaymentTxnHistory() throws IOException, SQLException {
		request = StaticStore.BillPaymentTxnHistory();
		response =sendReq(request, "BillPaymentTxnHistory",resourceprop.getProperty("BillPaymentTxnHistory"));
		assertResponse(response);
	}

}
