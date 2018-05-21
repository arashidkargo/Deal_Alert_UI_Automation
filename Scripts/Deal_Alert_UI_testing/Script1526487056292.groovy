import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.pURL)



WebUI.setText(findTestObject('Page_Kargo Login (1)/input_username'), GlobalVariable.uName)

WebUI.setText(findTestObject('Page_Kargo Login (1)/input_password'), GlobalVariable.uPass)

WebUI.click(findTestObject('Page_Kargo Login (1)/span_Sign In'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Stopped'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_DSP Stopped Buying'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_DSP Has Bids Below The Fl'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_DSP Bidding But Not Winni'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_DSP Revenue Decrease'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Bidding No Impressio'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_DSP Bid Response Decrease'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_DSP Bid Response Decrease'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Has Not Started Bidd'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Bid Response Decreas'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Bid Response Decreas'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Bid Response Decreas'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Revenue Decrease'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal Started Spending'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_No Bid Reason - BSW Black'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_No Bid Reason - BSW Black'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Network Inactive Deals'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Deal New Advertiser Start'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Network Blacklist - Creat'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Network Subscribe Inactiv'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Network Unsubscribe Inact'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_New Advertiser Started Bi'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Delivery Method Bid Respo'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Lex Id Merge Check'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/span_Lex Id To Ktcid Check'))

WebUI.click(findTestObject('Page_Deal Alerts (1)/i_icon-home icon-24 icon--hove'))

WebUI.closeBrowser()

