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



public class ServiceAndRequest extends ExtentManager {
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	
	@Test
	public static void LoanAccountfetch() throws IOException, SQLException {
		request = StaticStore.LoanAccountfetch();
		response =sendReq(request, "LoanAccountfetch",resourceprop.getProperty("LoanAccountfetch"));
		assertResponse(response);
	}
	
	
	@Test
	public static void LoanStatement() throws IOException, SQLException {
		request = StaticStore.LoanStatement();
		response =sendReq(request, "LoanStatement",resourceprop.getProperty("LoanStatement"));
		assertResponse(response);
	}
	
	
	
	@Test
	public static void LoanCertificate() throws IOException, SQLException {
		request = StaticStore.LoanCertificate();
		response =sendReq(request, "LoanCertificate",resourceprop.getProperty("LoanCertificate"));
		assertResponse(response);
	}
	
	
	
	@Test
	public static void ServiceandCategoryDownload() throws IOException, SQLException {
		request = StaticStore.ServiceandCategoryDownload();
		response =sendReq(request, "ServiceandCategoryDownload",resourceprop.getProperty("ServiceandCategoryDownload"));
		assertResponse(response);
	}
	
	@Test
	public static void RequestforCreditCard() throws IOException, SQLException {
		request = StaticStore.RequestforCreditCard();
		response =sendReq(request, "RequestforCreditCard",resourceprop.getProperty("RequestforCreditCard"));
		assertResponse(response);
	}
	
	@Test
	public static void RequestforLoan() throws IOException, SQLException {
		request = StaticStore.RequestforLoan();
		response =sendReq(request, "RequestforLoan",resourceprop.getProperty("RequestforLoan"));
		assertResponse(response);
	}
	
	@Test
	public static void StopChequeFetchUnusedChequeList() throws IOException, SQLException {
		request = StaticStore.StopChequeFetchUnusedChequeList();
		response =sendReq(request, "StopChequeFetchUnusedChequeList",resourceprop.getProperty("StopChequeFetchUnusedChequeList"));
		assertResponse(response);
	}
	
	@Test
	public static void StopCheque() throws IOException, SQLException {
		request = StaticStore.StopCheque();
		response =sendReq(request, "StopCheque",resourceprop.getProperty("StopCheque"));
		assertResponse(response);
	}
	
	
	@Test
	public static void ChequeStatusBasedonDate() throws IOException, SQLException {
		request = StaticStore.ChequeStatusBasedonDate();
		response =sendReq(request, "ChequeStatusBasedonDate",resourceprop.getProperty("ChequeStatusBasedonDate"));
		assertResponse(response);
	}
	
	@Test
	public static void ChequeStatus() throws IOException, SQLException {
		request = StaticStore.ChequeStatus();
		response =sendReq(request, "ChequeStatus",resourceprop.getProperty("ChequeStatus"));
		assertResponse(response);
	}
	
	@Test
	public static void FeedBack() throws IOException, SQLException {
		request = StaticStore.FeedBack();
		response =sendReq(request, "FeedBack",resourceprop.getProperty("FeedBack"));
		assertResponse(response);
	}
	
	@Test
	public static void RequestforChequeBook() throws IOException, SQLException {
		request = StaticStore.RequestforChequeBook();
		response =sendReq(request, "RequestforChequeBook",resourceprop.getProperty("RequestforChequeBook"));
		assertResponse(response);
	}


	@Test
		public static void ComplaintViewStatus() throws IOException, SQLException {
			request = StaticStore.ComplaintViewStatus();
			response =sendReq(request, "ComplaintViewStatus",resourceprop.getProperty("ComplaintViewStatus"));
			assertResponse(response);
		}
		
		@Test
		public static void ComplaintFetchTransactionTypeandReason() throws IOException, SQLException {
			request = StaticStore.ComplaintFetchTransactionTypeandReason();
			response =sendReq(request, "ComplaintFetchTransactionTypeandReason",resourceprop.getProperty("ComplaintFetchTransactionTypeandReason"));
			assertResponse(response);
		}
		
		@Test
		public static void ComplaintFetchTransactionDetails() throws IOException, SQLException {
			request = StaticStore.ComplaintFetchTransactionDetails();
			response =sendReq(request, "ComplaintFetchTransactionDetails",resourceprop.getProperty("ComplaintFetchTransactionDetails"));
			assertResponse(response);
		}
		
		
		@Test
		public static void ComplaintFetchBBPSSubType() throws IOException, SQLException {
			request = StaticStore.ComplaintFetchBBPSSubType();
			response =sendReq(request, "ComplaintFetchBBPSSubType",resourceprop.getProperty("ComplaintFetchBBPSSubType"));
			assertResponse(response);
		}
	
		
		@Test
		public static void ComplaintRegistration() throws IOException, SQLException {
			request = StaticStore.ComplaintRegistration();
			response =sendReq(request, "ComplaintRegistration",resourceprop.getProperty("ComplaintRegistration"));
			assertResponse(response);
		}

}
