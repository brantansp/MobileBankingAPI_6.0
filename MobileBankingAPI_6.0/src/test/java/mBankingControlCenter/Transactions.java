package mBankingControlCenter;

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
	
	@Test
	public void SilentSMS() throws IOException, SQLException {
		request = StaticStore.SilentSMS();
		response =sendReq(request, "SilentSMS", resourceprop.getProperty("SilentSMS"));
		assertResponse(response);
	}
	
	//Billercategorylist
	@Test
	public void CheckUserIDAvailability() throws IOException, SQLException {
		request = StaticStore.CheckUserIDAvailability();
		response =sendReq(request, "CheckUserIDAvailability",resourceprop.getProperty("CheckUserIDAvailability"));
		assertResponse(response);
	}
	
	@Test
	public void CardNumberValidation() throws IOException, SQLException {
		request = StaticStore.CardNumberValidation();
		response =sendReq(request, "CardNumberValidation",resourceprop.getProperty("CardNumberValidation"));
		assertResponse(response);
	}
	
	@Test
	public void GenerateOTP() throws IOException, SQLException {
		request = StaticStore.GenerateOTP();
		response =sendReq(request, "GenerateOTP",resourceprop.getProperty("GenerateOTP"));
		assertResponse(response);
	}
	
	@Test
	public void VerifyOTP() throws IOException, SQLException {
		request = StaticStore.VerifyOTP();
		response =sendReq(request, "VerifyOTP",resourceprop.getProperty("VerifyOTP"));
		assertResponse(response);
	}
	
	@Test
	public void FTUserRegistration() throws IOException, SQLException {
		request = StaticStore.FTUserRegistration();
		response =sendReq(request, "FTUserRegistration",resourceprop.getProperty("FTUserRegistration"));
		assertResponse(response);
	}
	
	@Test
	public void CustomerIDFetch() throws IOException, SQLException {
		request = StaticStore.CustomerIDFetch();
		response =sendReq(request, "CustomerIDFetch",resourceprop.getProperty("CustomerIDFetch"));
		assertResponse(response);
	}
	
	@Test
	public void ViewOnlyUserRegistration() throws IOException, SQLException {
		request = StaticStore.ViewOnlyUserRegistration();
		response =sendReq(request, "ViewOnlyUserRegistration",resourceprop.getProperty("ViewOnlyUserRegistration"));
		assertResponse(response);
	}
	
	@Test
	public void LoginParameterDownload() throws IOException, SQLException {
		request = StaticStore.LoginParameterDownload();
		response =sendReq(request, "LoginParameterDownload",resourceprop.getProperty("LoginParameterDownload"));
		assertResponse(response);
	}
	
	@Test
	public void LoginCustomerInfo() throws IOException, SQLException {
		request = StaticStore.LoginCustomerInfo();
		response =sendReq(request, "LoginCustomerInfo",resourceprop.getProperty("LoginCustomerInfo"));
		assertResponse(response);
	}
	
	@Test
	public void MyAccountCumulativeofBalance() throws IOException, SQLException {
		request = StaticStore.MyAccountCumulativeofBalance();
		response =sendReq(request, "MyAccountCumulativeofBalance",resourceprop.getProperty("MyAccountCumulativeofBalance"));
		assertResponse(response);
	}
	
	@Test
	public void MyAccountBalanceagainsteachaccountbasedonmobilenumber() throws IOException, SQLException {
		request = StaticStore.MyAccountBalanceagainsteachaccountbasedonmobilenumber();
		response =sendReq(request, "MyAccountBalanceagainsteachaccountbasedonmobilenumber",resourceprop.getProperty("MyAccountBalanceagainsteachaccountbasedonmobilenumber"));
		assertResponse(response);
	}
	
	@Test
	public void MiniStatement() throws IOException, SQLException {
		request = StaticStore.MiniStatement();
		response =sendReq(request, "MiniStatement",resourceprop.getProperty("MiniStatement"));
		assertResponse(response);
	}
	
	@Test
	public void ValidateTransactionPassword() throws IOException, SQLException {
		request = StaticStore.ValidateTransactionPassword();
		response =sendReq(request, "ValidateTransactionPassword",resourceprop.getProperty("ValidateTransactionPassword"));
		assertResponse(response);
	}
	
	@Test
	public void MobiletoAccount() throws IOException, SQLException {
		request = StaticStore.MobiletoAccount();
		response =sendReq(request, "MobiletoAccount",resourceprop.getProperty("MobiletoAccount"));
		assertResponse(response);
	}
	
	@Test
	public void VerifyUser() throws IOException, SQLException {
		request = StaticStore.VerifyUser();
		response =sendReq(request, "VerifyUser",resourceprop.getProperty("VerifyUser"));
		assertResponse(response);
	}
	
	@Test
	public void CheckTransactionStatus() throws IOException, SQLException {
		request = StaticStore.CheckTransactionStatus();
		response =sendReq(request, "CheckTransactionStatus",resourceprop.getProperty("CheckTransactionStatus"));
		assertResponse(response);
	}
	
	
	@Test
	public void SelfAccountQuickFT() throws IOException, SQLException {
		request = StaticStore.SelfAccountQuickFT();
		response =sendReq(request, "SelfAccountQuickFT",resourceprop.getProperty("SelfAccountQuickFT"));
		assertResponse(response);
	}
	
	@Test
	public void NEFT() throws IOException, SQLException {
		request = StaticStore.NEFT();
		response =sendReq(request, "NEFT",resourceprop.getProperty("NEFT"));
		assertResponse(response);
	}
	@Test
	public void BankSearchbasedonIFSC() throws IOException, SQLException {
		request = StaticStore.BankSearchbasedonIFSC();
		response =sendReq(request, "BankSearchbasedonIFSC",resourceprop.getProperty("BankSearchbasedonIFSC"));
		assertResponse(response);
	}
	
	@Test
	public void BankNameSearch() throws IOException, SQLException {
		request = StaticStore.BankNameSearch();
		response =sendReq(request, "BankNameSearch",resourceprop.getProperty("BankNameSearch"));
		assertResponse(response);
	}
	
	@Test
	public void IFSCSearch() throws IOException, SQLException {
		request = StaticStore.IFSCSearch();
		response =sendReq(request, "IFSCSearch",resourceprop.getProperty("IFSCSearch"));
		assertResponse(response);
	}
	
	@Test
	public void RTGS() throws IOException, SQLException {
		request = StaticStore.RTGS();
		response =sendReq(request, "RTGS",resourceprop.getProperty("RTGS"));
		assertResponse(response);
	}
	
	@Test
	public void ChangeTransactionPassword() throws IOException, SQLException {
		request = StaticStore.ChangeTransactionPassword();
		response =sendReq(request, "ChangeTransactionPassword",resourceprop.getProperty("ChangeTransactionPassword"));
		assertResponse(response);
	}
	
	
	@Test
	public void GenerateMMID() throws IOException, SQLException {
		request = StaticStore.GenerateMMID();
		response =sendReq(request, "GenerateMMID",resourceprop.getProperty("GenerateMMID"));
		assertResponse(response);
	}
	
	
	@Test
	public void ADDFavourite() throws IOException, SQLException {
		request = StaticStore.ADDFavourite();
		response =sendReq(request, "ADDFavourite",resourceprop.getProperty("ADDFavourite"));
		assertResponse(response);
	}
	
	@Test
	public void DeleteFavourite() throws IOException, SQLException {
		request = StaticStore.DeleteFavourite();
		response =sendReq(request, "DeleteFavourite",resourceprop.getProperty("DeleteFavourite"));
		assertResponse(response);
	}
	
	
	@Test
	public void IMPSP2A() throws IOException, SQLException {
		request = StaticStore.IMPSP2A();
		response =sendReq(request, "IMPSP2A",resourceprop.getProperty("IMPSP2A"));
		assertResponse(response);
	}
	
	@Test
	public void IMPSP2P() throws IOException, SQLException {
		request = StaticStore.IMPSP2P();
		response =sendReq(request, "IMPSP2P",resourceprop.getProperty("IMPSP2P"));
		assertResponse(response);
	}
	
	
	@Test
	public void IMPSP2U() throws IOException, SQLException {
		request = StaticStore.IMPSP2U();
		response =sendReq(request, "IMPSP2U",resourceprop.getProperty("IMPSP2U"));
		assertResponse(response);
	}
	
	
	@Test
	public void ConfirmationLeg() throws IOException, SQLException {
		request = StaticStore.ConfirmationLeg();
		response =sendReq(request, "ConfirmationLeg",resourceprop.getProperty("ConfirmationLeg"));
		assertResponse(response);
	}
	
	
	@Test
	public void Transactionhistorybasedonpiechart() throws IOException, SQLException {
		request = StaticStore.Transactionhistorybasedonpiechart();
		response =sendReq(request, "Transactionhistorybasedonpiechart",resourceprop.getProperty("Transactionhistorybasedonpiechart"));
		assertResponse(response);
	}
	
	
	@Test
	public void LoanAccountfetch() throws IOException, SQLException {
		request = StaticStore.LoanAccountfetch();
		response =sendReq(request, "LoanAccountfetch",resourceprop.getProperty("LoanAccountfetch"));
		assertResponse(response);
	}
	
	
	@Test
	public void LoanStatement() throws IOException, SQLException {
		request = StaticStore.LoanStatement();
		response =sendReq(request, "LoanStatement",resourceprop.getProperty("LoanStatement"));
		assertResponse(response);
	}
	
	
	
	@Test
	public void LoanCertificate() throws IOException, SQLException {
		request = StaticStore.LoanCertificate();
		response =sendReq(request, "LoanCertificate",resourceprop.getProperty("LoanCertificate"));
		assertResponse(response);
	}
	
	
	@Test
	public void mPassbookviadateselection() throws IOException, SQLException {
		request = StaticStore.mPassbookviadateselection();
		response =sendReq(request, "mPassbookviadateselection",resourceprop.getProperty("mPassbookviadateselection"));
		assertResponse(response);
	}
	
	
	
	@Test
	public void mPassbookviaNumberofTxns() throws IOException, SQLException {
		request = StaticStore.mPassbookviaNumberofTxns();
		response =sendReq(request, "mPassbookviaNumberofTxns",resourceprop.getProperty("mPassbookviaNumberofTxns"));
		assertResponse(response);
	}
	
	
	
	@Test
	public void mPassbookviaNumberofdays() throws IOException, SQLException {
		request = StaticStore.mPassbookviaNumberofdays();
		response =sendReq(request, "mPassbookviaNumberofdays",resourceprop.getProperty("mPassbookviaNumberofdays"));
		assertResponse(response);
	}
	
	
	@Test
	public void mPassbookEmail() throws IOException, SQLException {
		request = StaticStore.mPassbookEmail();
		response =sendReq(request, "mPassbookEmail",resourceprop.getProperty("mPassbookEmail"));
		assertResponse(response);
	}
	
	
	@Test
	public void mPassbookpdf() throws IOException, SQLException {
		request = StaticStore.mPassbookpdf();
		response =sendReq(request, "mPassbookpdf",resourceprop.getProperty("mPassbookpdf"));
		assertResponse(response);
	}
	
	@Test
	public void ServiceandCategoryDownload() throws IOException, SQLException {
		request = StaticStore.ServiceandCategoryDownload();
		response =sendReq(request, "ServiceandCategoryDownload",resourceprop.getProperty("ServiceandCategoryDownload"));
		assertResponse(response);
	}
	
	@Test
	public void BillerDownload() throws IOException, SQLException {
		request = StaticStore.BillerDownload();
		response =sendReq(request, "BillerDownload",resourceprop.getProperty("BillerDownload"));
		assertResponse(response);
	}
	
	
	@Test
	public void BillFetch() throws IOException, SQLException {
		request = StaticStore.BillFetch();
		response =sendReq(request, "BillFetch",resourceprop.getProperty("BillFetch"));
		assertResponse(response);
	}
	
	@Test
	public void BillerRegistration() throws IOException, SQLException {
		request = StaticStore.BillerRegistration();
		response =sendReq(request, "BillerRegistration",resourceprop.getProperty("BillerRegistration"));
		assertResponse(response);
	}
	
	@Test
	public void BillPaymentConfirmation() throws IOException, SQLException {
		request = StaticStore.BillPaymentConfirmation();
		response =sendReq(request, "BillPaymentConfirmation",resourceprop.getProperty("BillPaymentConfirmation"));
		assertResponse(response);
	}
	
	
	@Test
	public void BillPayment() throws IOException, SQLException {
		request = StaticStore.BillPayment();
		response =sendReq(request, "BillPayment",resourceprop.getProperty("BillPayment"));
		assertResponse(response);
	}
	
	@Test
	public void FetchRegisteredBiller() throws IOException, SQLException {
		request = StaticStore.FetchRegisteredBiller();
		response =sendReq(request, "FetchRegisteredBiller",resourceprop.getProperty("FetchRegisteredBiller"));
		assertResponse(response);
	}
	
	
	@Test
	public void BillerDeletion() throws IOException, SQLException {
		request = StaticStore.BillerDeletion();
		response =sendReq(request, "BillerDeletion",resourceprop.getProperty("BillerDeletion"));
		assertResponse(response);
	}
	
	
	@Test
	public void BillPaymentTxnHistory() throws IOException, SQLException {
		request = StaticStore.BillPaymentTxnHistory();
		response =sendReq(request, "BillPaymentTxnHistory",resourceprop.getProperty("BillPaymentTxnHistory"));
		assertResponse(response);
	}
	
	
	@Test
	public void DeviceIDUpdate() throws IOException, SQLException {
		request = StaticStore.DeviceIDUpdate();
		response =sendReq(request, "DeviceIDUpdate",resourceprop.getProperty("DeviceIDUpdate"));
		assertResponse(response);
	}
	
	
	@Test
	public void TermDepositAccountFetch() throws IOException, SQLException {
		request = StaticStore.TermDepositAccountFetch();
		response =sendReq(request, "TermDepositAccountFetch",resourceprop.getProperty("TermDepositAccountFetch"));
		assertResponse(response);
	}
	
	
	@Test
	public void TermDepositAccountClosure() throws IOException, SQLException {
		request = StaticStore.TermDepositAccountClosure();
		response =sendReq(request, "TermDepositAccountClosure",resourceprop.getProperty("TermDepositAccountClosure"));
		assertResponse(response);
	}
	
	
	@Test
	public void TermDepositAccountOpening() throws IOException, SQLException {
		request = StaticStore.TermDepositAccountOpening();
		response =sendReq(request, "TermDepositAccountOpening",resourceprop.getProperty("TermDepositAccountOpening"));
		assertResponse(response);
	}
	
	
	@Test
	public void TermDepositInterestRate() throws IOException, SQLException {
		request = StaticStore.TermDepositInterestRate();
		response =sendReq(request, "TermDepositInterestRate",resourceprop.getProperty("TermDepositInterestRate"));
		assertResponse(response);
	}
	
	@Test
	public void Deregistration() throws IOException, SQLException {
		request = StaticStore.Deregistration();
		response =sendReq(request, "Deregistration",resourceprop.getProperty("Deregistration"));
		assertResponse(response);
	}
	
	@Test
	public void RequestforCreditCard() throws IOException, SQLException {
		request = StaticStore.RequestforCreditCard();
		response =sendReq(request, "RequestforCreditCard",resourceprop.getProperty("RequestforCreditCard"));
		assertResponse(response);
	}
	
	@Test
	public void RequestforLoan() throws IOException, SQLException {
		request = StaticStore.RequestforLoan();
		response =sendReq(request, "RequestforLoan",resourceprop.getProperty("RequestforLoan"));
		assertResponse(response);
	}
	
	@Test
	public void StopChequeFetchUnusedChequeList() throws IOException, SQLException {
		request = StaticStore.StopChequeFetchUnusedChequeList();
		response =sendReq(request, "StopChequeFetchUnusedChequeList",resourceprop.getProperty("StopChequeFetchUnusedChequeList"));
		assertResponse(response);
	}
	
	@Test
	public void StopCheque() throws IOException, SQLException {
		request = StaticStore.StopCheque();
		response =sendReq(request, "StopCheque",resourceprop.getProperty("StopCheque"));
		assertResponse(response);
	}
	
	
	@Test
	public void ChequeStatusBasedonDate() throws IOException, SQLException {
		request = StaticStore.ChequeStatusBasedonDate();
		response =sendReq(request, "ChequeStatusBasedonDate",resourceprop.getProperty("ChequeStatusBasedonDate"));
		assertResponse(response);
	}
	
	@Test
	public void ChequeStatus() throws IOException, SQLException {
		request = StaticStore.ChequeStatus();
		response =sendReq(request, "ChequeStatus",resourceprop.getProperty("ChequeStatus"));
		assertResponse(response);
	}
	
	@Test
	public void FeedBack() throws IOException, SQLException {
		request = StaticStore.FeedBack();
		response =sendReq(request, "FeedBack",resourceprop.getProperty("FeedBack"));
		assertResponse(response);
	}
	
	@Test
	public void FetchTransactionLimit() throws IOException, SQLException {
		request = StaticStore.FetchTransactionLimit();
		response =sendReq(request, "FetchTransactionLimit",resourceprop.getProperty("FetchTransactionLimit"));
		assertResponse(response);
	}
	
	@Test
	public void UpdateTransactionLimit() throws IOException, SQLException {
		request = StaticStore.UpdateTransactionLimit();
		response =sendReq(request, "UpdateTransactionLimit",resourceprop.getProperty("UpdateTransactionLimit"));
		assertResponse(response);
	}
	
	@Test
	public void ComplaintViewStatus() throws IOException, SQLException {
		request = StaticStore.ComplaintViewStatus();
		response =sendReq(request, "ComplaintViewStatus",resourceprop.getProperty("ComplaintViewStatus"));
		assertResponse(response);
	}
	
	@Test
	public void ComplaintFetchTransactionTypeandReason() throws IOException, SQLException {
		request = StaticStore.ComplaintFetchTransactionTypeandReason();
		response =sendReq(request, "ComplaintFetchTransactionTypeandReason",resourceprop.getProperty("ComplaintFetchTransactionTypeandReason"));
		assertResponse(response);
	}
	
	@Test
	public void ComplaintFetchTransactionDetails() throws IOException, SQLException {
		request = StaticStore.ComplaintFetchTransactionDetails();
		response =sendReq(request, "ComplaintFetchTransactionDetailsComplaintFetchBBPSSubType",resourceprop.getProperty("ComplaintFetchTransactionDetails"));
		assertResponse(response);
	}
	
	
	@Test
	public void ComplaintFetchBBPSSubType() throws IOException, SQLException {
		request = StaticStore.ComplaintFetchBBPSSubType();
		response =sendReq(request, "ComplaintFetchBBPSSubType",resourceprop.getProperty("ComplaintFetchBBPSSubType"));
		assertResponse(response);
	}
	@Test
	public void RequestforChequeBook() throws IOException, SQLException {
		request = StaticStore.RequestforChequeBook();
		response =sendReq(request, "RequestforChequeBook",resourceprop.getProperty("RequestforChequeBook"));
		assertResponse(response);
	}
	
	@Test
	public void LocatorFetchATMBranchListbasedonNearBy() throws IOException, SQLException {
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
	public void LocatorFetchATMBranchListbasedonStateCity() throws IOException, SQLException {
		request = StaticStore.LocatorFetchATMBranchListbasedonStateCity();
		response =sendReq(request, "LocatorFetchATMBranchListbasedonStateCity",resourceprop.getProperty("LocatorFetchATMBranchListbasedonStateCity"));
		assertResponse(response);
	}
	
	@Test
	public void LocatorFetchCityList() throws IOException, SQLException {
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
	
	public void ComplaintRegistration() throws IOException, SQLException {
		request = StaticStore.ComplaintRegistration();
		response =sendReq(request, "ComplaintRegistration",resourceprop.getProperty("ComplaintRegistration"));
		assertResponse(response);
	}
	

	public static void main(String[] args) 
	{
		request = StaticStore.LocatorFetchATMBranchListbasedonStateCity();
		try {
			response =sendReq(request, "LocatorFetchATMBranchListbasedonStateCity","/boi-mobilepay-service-web/mbanking/boi/mob/6.0/en/location/search");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		request = StaticStore.SilentSMS();
		try {
			response =sendReq(request, "SilentSMS", resourceprop.getProperty("SilentSMS"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertResponse(response);*/

	}

}














