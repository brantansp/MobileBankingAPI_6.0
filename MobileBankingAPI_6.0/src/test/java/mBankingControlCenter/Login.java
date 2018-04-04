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



public class Login extends ExtentManager{
	
	private static String response;
	private static int index;
	public static String request;
	static HttpConnect obj=new HttpConnect();

	public static ExtentReports extent;
	public static ExtentTest extentLogger;
	
	@Test(priority = 1)
	public static void SilentSMS() throws IOException, SQLException {
		request = StaticStore.SilentSMS();
		response =sendReq(request, "SilentSMS", resourceprop.getProperty("SilentSMS"));
		assertResponse(response);
	}
	
	//Billercategorylist
	@Test
	public static void CheckUserIDAvailability() throws IOException, SQLException {
		request = StaticStore.CheckUserIDAvailability();
		response =sendReq(request, "CheckUserIDAvailability",resourceprop.getProperty("CheckUserIDAvailability"));
		assertResponse(response);
	}
	
	@Test
	public static void CardNumberValidation() throws IOException, SQLException {
		request = StaticStore.CardNumberValidation();
		response =sendReq(request, "CardNumberValidation",resourceprop.getProperty("CardNumberValidation"));
		assertResponse(response);
	}
	
	@Test
	public static void GenerateOTP() throws IOException, SQLException {
		request = StaticStore.GenerateOTP();
		response =sendReq(request, "GenerateOTP",resourceprop.getProperty("GenerateOTP"));
		assertResponse(response);
	}
	
	@Test
	public static void VerifyOTP() throws IOException, SQLException {
		request = StaticStore.VerifyOTP();
		response =sendReq(request, "VerifyOTP",resourceprop.getProperty("VerifyOTP"));
		assertResponse(response);
	}
	
	@Test
	public static void FTUserRegistration() throws IOException, SQLException {
		request = StaticStore.FTUserRegistration();
		response =sendReq(request, "FTUserRegistration",resourceprop.getProperty("FTUserRegistration"));
		assertResponse(response);
	}
	
	@Test
	public static void CustomerIDFetch() throws IOException, SQLException {
		request = StaticStore.CustomerIDFetch();
		response =sendReq(request, "CustomerIDFetch",resourceprop.getProperty("CustomerIDFetch"));
		assertResponse(response);
	}
	
	@Test
	public static void ViewOnlyUserRegistration() throws IOException, SQLException {
		request = StaticStore.ViewOnlyUserRegistration();
		response =sendReq(request, "ViewOnlyUserRegistration",resourceprop.getProperty("ViewOnlyUserRegistration"));
		assertResponse(response);
	}
	
	@Test
	public static void LoginParameterDownload() throws IOException, SQLException {
		request = StaticStore.LoginParameterDownload();
		response =sendReq(request, "LoginParameterDownload",resourceprop.getProperty("LoginParameterDownload"));
		assertResponse(response);
	}
	
	@Test
	public static void LoginCustomerInfo() throws IOException, SQLException {
		request = StaticStore.LoginCustomerInfo();
		response =sendReq(request, "LoginCustomerInfo",resourceprop.getProperty("LoginCustomerInfo"));
		assertResponse(response);
	}

	@Test
	public static void DeviceIDUpdate() throws IOException, SQLException {
		request = StaticStore.DeviceIDUpdate();
		response =sendReq(request, "DeviceIDUpdate",resourceprop.getProperty("DeviceIDUpdate"));
		assertResponse(response);
	}

	@Test
		public static void LocatorFetchATMBranchListbasedonNearBy() throws IOException, SQLException {
			request = StaticStore.LocatorFetchATMBranchListbasedonNearBy();
			response =sendReq(request, "LocatorFetchATMBranchListbasedonNearBy",resourceprop.getProperty("LocatorFetchATMBranchListbasedonNearBy"));
			assertResponse(response);
		}
		
		@Test
		public static void LocatorFetchATMBranchListbasedonsearch() throws IOException, SQLException {
			request = StaticStore.LocatorFetchATMBranchListbasedonsearch();
			response =sendReq(request, "LocatorFetchATMBranchListbasedonsearch",resourceprop.getProperty("LocatorFetchATMBranchListbasedonsearch"));
			assertResponse(response);
		}
		
		
		@Test
		public static void LocatorFetchATMBranchListbasedonStateCity() throws IOException, SQLException {
			request = StaticStore.LocatorFetchATMBranchListbasedonStateCity();
			response =sendReq(request, "LocatorFetchATMBranchListbasedonStateCity",resourceprop.getProperty("LocatorFetchATMBranchListbasedonStateCity"));
			assertResponse(response);
		}
		
		@Test
		public static void LocatorFetchCityList() throws IOException, SQLException {
			request = StaticStore.LocatorFetchCityList();
			response =sendReq(request, "LocatorFetchCityList",resourceprop.getProperty("LocatorFetchCityList"));
			assertResponse(response);
		}
		@Test
		public static void LocatorFetchStateList() throws IOException, SQLException {
			request = StaticStore.LocatorFetchStateList();
			response =sendReq(request, "LocatorFetchStateList",resourceprop.getProperty("LocatorFetchStateList"));
			assertResponse(response);
		}
		
		@Test
		public static void VerifyUser() throws IOException, SQLException {
			request = StaticStore.VerifyUser();
			response =sendReq(request, "VerifyUser",resourceprop.getProperty("VerifyUser"));
			assertResponse(response);
		}

}
