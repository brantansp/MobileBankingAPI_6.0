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



public class Settings extends ExtentManager {
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	

/*	@Test
	public static void Deregistration() throws IOException, SQLException {
		request = StaticStore.Deregistration();
		response =sendReq(request, "Deregistration",resourceprop.getProperty("Deregistration"));
		assertResponse(response);
	}*/
	
	
	@Test
	public static void FetchTransactionLimit() throws IOException, SQLException {
		request = StaticStore.FetchTransactionLimit();
		response =sendReq(request, "FetchTransactionLimit",resourceprop.getProperty("FetchTransactionLimit"));
		assertResponse(response);
	}
	
	@Test
	public static void UpdateTransactionLimit() throws IOException, SQLException {
		request = StaticStore.UpdateTransactionLimit();
		response =sendReq(request, "UpdateTransactionLimit",resourceprop.getProperty("UpdateTransactionLimit"));
		assertResponse(response);
	}
	
	

	@Test
	public static void ChangeTransactionPassword() throws IOException, SQLException {
		request = StaticStore.ChangeTransactionPassword();
		response =sendReq(request, "ChangeTransactionPassword",resourceprop.getProperty("ChangeTransactionPassword"));
		assertResponse(response);
	}
	
	public static void main(String[] args) {
		request = StaticStore.Deregistration();
		try {
			response =sendReq(request, "Deregistration",resourceprop.getProperty("Deregistration"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertResponse(response);
	}
	

}
