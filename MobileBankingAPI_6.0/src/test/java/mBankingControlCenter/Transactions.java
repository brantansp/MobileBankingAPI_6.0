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

public class Transactions extends ExtentManager{
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
	public static void MyAccountCumulativeofBalance() throws IOException, SQLException {
		request = StaticStore.MyAccountCumulativeofBalance();
		response =sendReq(request, "MyAccountCumulativeofBalance",resourceprop.getProperty("MyAccountCumulativeofBalance"));
		assertResponse(response);
	}
	
	@Test
	public static void Balance() throws IOException, SQLException {
		request = StaticStore.Balance();
		response =sendReq(request, "Balance",resourceprop.getProperty("MyAccountCumulativeofBalance"));
		assertResponse(response);
	}
	
	@Test
	public static void MyAccountBalanceagainsteachaccountbasedonmobilenumber() throws IOException, SQLException {
		request = StaticStore.MyAccountBalanceagainsteachaccountbasedonmobilenumber();
		response =sendReq(request, "MyAccountBalanceagainsteachaccountbasedonmobilenumber",resourceprop.getProperty("MyAccountBalanceagainsteachaccountbasedonmobilenumber"));
		assertResponse(response);
	}
	
	@Test
	public static void MiniStatement() throws IOException, SQLException {
		request = StaticStore.MiniStatement();
		response =sendReq(request, "MiniStatement",resourceprop.getProperty("MiniStatement"));
		assertResponse(response);
	}
	
	@Test
	public static void ValidateTransactionPassword() throws IOException, SQLException {
		request = StaticStore.ValidateTransactionPassword();
		response =sendReq(request, "ValidateTransactionPassword",resourceprop.getProperty("ValidateTransactionPassword"));
		assertResponse(response);
	}
	
	@Test
	public static void MobiletoAccount() throws IOException, SQLException {
		request = StaticStore.MobiletoAccount();
		response =sendReq(request, "MobiletoAccount",resourceprop.getProperty("MobiletoAccount"));
		assertResponse(response);
	}
	
	@Test
	public static void VerifyUser() throws IOException, SQLException {
		request = StaticStore.VerifyUser();
		response =sendReq(request, "VerifyUser",resourceprop.getProperty("VerifyUser"));
		assertResponse(response);
	}
	
	@Test
	public static void CheckTransactionStatus() throws IOException, SQLException {
		request = StaticStore.CheckTransactionStatus();
		response =sendReq(request, "CheckTransactionStatus",resourceprop.getProperty("CheckTransactionStatus"));
		assertResponse(response);
	}
	
	
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
	
	@Test
	public static void RTGS() throws IOException, SQLException {
		request = StaticStore.RTGS();
		response =sendReq(request, "RTGS",resourceprop.getProperty("RTGS"));
		assertResponse(response);
	}
	
	@Test
	public static void ChangeTransactionPassword() throws IOException, SQLException {
		request = StaticStore.ChangeTransactionPassword();
		response =sendReq(request, "ChangeTransactionPassword",resourceprop.getProperty("ChangeTransactionPassword"));
		assertResponse(response);
	}
	
	
	@Test
	public static void GenerateMMID() throws IOException, SQLException {
		request = StaticStore.GenerateMMID();
		response =sendReq(request, "GenerateMMID",resourceprop.getProperty("GenerateMMID"));
		assertResponse(response);
	}
	
	
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
	public static void mPassbookviadateselection() throws IOException, SQLException {
		request = StaticStore.mPassbookviadateselection();
		response =sendReq(request, "mPassbookviadateselection",resourceprop.getProperty("mPassbookviadateselection"));
		assertResponse(response);
	}
	
	
	
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
	
	@Test
	public static void ServiceandCategoryDownload() throws IOException, SQLException {
		request = StaticStore.ServiceandCategoryDownload();
		response =sendReq(request, "ServiceandCategoryDownload",resourceprop.getProperty("ServiceandCategoryDownload"));
		assertResponse(response);
	}
	
	@Test
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
	
	@Test
	public static void BillerRegistration() throws IOException, SQLException {
		request = StaticStore.BillerRegistration();
		response =sendReq(request, "BillerRegistration",resourceprop.getProperty("BillerRegistration"));
		assertResponse(response);
	}
	
	@Test
	public static void BillPaymentConfirmation() throws IOException, SQLException {
		request = StaticStore.BillPaymentConfirmation();
		response =sendReq(request, "BillPaymentConfirmation",resourceprop.getProperty("BillPaymentConfirmation"));
		assertResponse(response);
	}
	
	
	@Test
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
	
	
	@Test
	public static void DeviceIDUpdate() throws IOException, SQLException {
		request = StaticStore.DeviceIDUpdate();
		response =sendReq(request, "DeviceIDUpdate",resourceprop.getProperty("DeviceIDUpdate"));
		assertResponse(response);
	}
	
	
	@Test
	public static void TermDepositAccountFetch() throws IOException, SQLException {
		request = StaticStore.TermDepositAccountFetch();
		response =sendReq(request, "TermDepositAccountFetch",resourceprop.getProperty("TermDepositAccountFetch"));
		assertResponse(response);
	}
	
	
	@Test
	public static void TermDepositAccountClosure() throws IOException, SQLException {
		request = StaticStore.TermDepositAccountClosure();
		response =sendReq(request, "TermDepositAccountClosure",resourceprop.getProperty("TermDepositAccountClosure"));
		assertResponse(response);
	}
	
	
	@Test
	public static void TermDepositAccountOpening() throws IOException, SQLException {
		request = StaticStore.TermDepositAccountOpening();
		response =sendReq(request, "TermDepositAccountOpening",resourceprop.getProperty("TermDepositAccountOpening"));
		assertResponse(response);
	}
	
	
	@Test
	public static void TermDepositInterestRate() throws IOException, SQLException {
		request = StaticStore.TermDepositInterestRate();
		response =sendReq(request, "TermDepositInterestRate",resourceprop.getProperty("TermDepositInterestRate"));
		assertResponse(response);
	}
	
	/*@Test
	public static void Deregistration() throws IOException, SQLException {
		request = StaticStore.Deregistration();
		response =sendReq(request, "Deregistration",resourceprop.getProperty("Deregistration"));
		assertResponse(response);
	}*/
	
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
	public static void RequestforChequeBook() throws IOException, SQLException {
		request = StaticStore.RequestforChequeBook();
		response =sendReq(request, "RequestforChequeBook",resourceprop.getProperty("RequestforChequeBook"));
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
	public static void ComplaintRegistration() throws IOException, SQLException {
		request = StaticStore.ComplaintRegistration();
		response =sendReq(request, "ComplaintRegistration",resourceprop.getProperty("ComplaintRegistration"));
		assertResponse(response);
	}
	

	public static void main(String[] args) 
	{		
		
		try {
			LoanAccountfetch();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*SilentSMS();-due to tech prblms
		CheckUserIDAvailability();-invalid request
		CardNumberValidation();-your device is not registered for mpay
		GenerateOTP();
		VerifyOTP();
		FTUserRegistration();-invalid mobile number
		CustomerIDFetch();
		ViewOnlyUserRegistration();-userid already exists
		LoginParameterDownload();
		LoginCustomerInfo();
		MyAccountCumulativeofBalance();-400
		MyAccountBalanceagainsteachaccountbasedonmobilenumber();-400
		MiniStatement();-device not reg for mpay
		ValidateTransactionPassword();-device not reg for mpay
		MobiletoAccount();-device not reg for mpay
		VerifyUser();-device not reg for mpay
		CheckTransactionStatus();-device not reg foe mpay
		SelfAccountQuickFT();-device not reg for mpay
		NEFT();
		BankSearchbasedonIFSC();
		BankNameSearch();
		IFSCSearch();
		RTGS();
		ChangeTransactionPassword();
		GenerateMMID();
		ADDFavourite();
		DeleteFavourite();
		IMPSP2A();
		IMPSP2P();
		IMPSP2U();
		ConfirmationLeg();
		Transactionhistorybasedonpiechart();
		LoanAccountfetch();
		LoanStatement();
		LoanCertificate();
		mPassbookviadateselection();
		mPassbookviaNumberofTxns();
		mPassbookviaNumberofdays();
		mPassbookEmail();
		mPassbookpdf();
		ServiceandCategoryDownload();
		BillerDownload();
		BillFetch();
		BillerRegistration();
		BillPaymentConfirmation();
		BillPayment();
		FetchRegisteredBiller();
		BillerDeletion();
		BillPaymentTxnHistory();
		DeviceIDUpdate();
		TermDepositAccountFetch();
		TermDepositAccountClosure();
		TermDepositAccountOpening();
		TermDepositInterestRate();
		Deregistration();
		RequestforCreditCard();
		RequestforLoan();
		StopChequeFetchUnusedChequeList();
		StopCheque();
		ChequeStatusBasedonDate();
		ChequeStatus();
		FeedBack();
		FetchTransactionLimit();
		UpdateTransactionLimit();
		ComplaintViewStatus();
		ComplaintFetchTransactionTypeandReason();
		ComplaintFetchTransactionDetails();
		ComplaintFetchBBPSSubType();
		RequestforChequeBook();
		LocatorFetchATMBranchListbasedonNearBy();
		LocatorFetchATMBranchListbasedonsearch();
		LocatorFetchATMBranchListbasedonStateCity();
		LocatorFetchCityList();
		LocatorFetchStateList();
		ComplaintRegistration();
*/	
	
		
		
		
	}	

}














