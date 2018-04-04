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


public class IMPSTransactions extends ExtentManager {
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	
	@Test
	public static void IMPSP2A() throws IOException, SQLException {
		request = StaticStore.IMPSP2A();
		response =sendReq(request, "IMPSP2A",resourceprop.getProperty("IMPSP2A"));
		assertResponse(response);
	}
	
	@Test
	public static void IMPSP2P() throws IOException, SQLException {
		request = StaticStore.IMPSP2P();
		response =sendReq(request, "IMPSP2P",resourceprop.getProperty("IMPSP2P"));
		assertResponse(response);
	}
	
	
	@Test
	public static void IMPSP2U() throws IOException, SQLException {
		request = StaticStore.IMPSP2U();
		response =sendReq(request, "IMPSP2U",resourceprop.getProperty("IMPSP2U"));
		assertResponse(response);
	}
	
	
	@Test
	public static void ConfirmationLeg() throws IOException, SQLException {
		request = StaticStore.ConfirmationLeg();
		response =sendReq(request, "ConfirmationLeg",resourceprop.getProperty("ConfirmationLeg"));
		assertResponse(response);
	}
	
	
	@Test
	public static void Transactionhistorybasedonpiechart() throws IOException, SQLException {
		request = StaticStore.Transactionhistorybasedonpiechart();
		response =sendReq(request, "Transactionhistorybasedonpiechart",resourceprop.getProperty("Transactionhistorybasedonpiechart"));
		assertResponse(response);
	}

	@Test
		public static void BankSearchbasedonIFSC() throws IOException, SQLException {
			request = StaticStore.BankSearchbasedonIFSC();
			response =sendReq(request, "BankSearchbasedonIFSC",resourceprop.getProperty("BankSearchbasedonIFSC"));
			assertResponse(response);
		}
		
		@Test
		public static void BankNameSearch() throws IOException, SQLException {
			request = StaticStore.BankNameSearch();
			response =sendReq(request, "BankNameSearch",resourceprop.getProperty("BankNameSearch"));
			assertResponse(response);
		}
		
		@Test
		public static void IFSCSearch() throws IOException, SQLException {
			request = StaticStore.IFSCSearch();
			response =sendReq(request, "IFSCSearch",resourceprop.getProperty("IFSCSearch"));
			assertResponse(response);
		}
	

}
