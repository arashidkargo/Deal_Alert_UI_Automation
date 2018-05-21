import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.net.URLPermission.Authority as Authority
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


///////////////////Deal Stopped//////////////////
def response = WS.sendRequest(findTestObject('Dev_API/Deal Stopped'))

WS.verifyResponseStatusCode(response, 200)

WS.containsString(response, 'Job started', false)

WS.containsString(response, 'Deal Stopped', false)

assert response.getStatusCode() == 200

assert response.getResponseText().contains('Job started')

assert response.getResponseText().contains('Deal Stopped')


///////////////////DSP Stopped Buying//////////////////
def r1=WS.sendRequest(findTestObject('Dev_API/DSP Stopped Buying'))
WS.verifyResponseStatusCode(r1, 200)

WS.containsString(r1, 'Job started', false)
WS.containsString(r1, 'DSP Stopped Buying', false)

assert r1.getStatusCode() == 200

assert r1.getResponseText().contains('Job started')

assert r1.getResponseText().contains('DSP Stopped Buying')


///////////////////DSP Has Bid Below The Floor//////////////////
def r2=WS.sendRequest(findTestObject('Dev_API/DSP Has Bid Below The Floor'))
WS.verifyResponseStatusCode(r2, 200)

WS.containsString(r2, 'Job started', false)
WS.containsString(r2, 'DSP Has Bid Below The Floor', false)

assert r2.getStatusCode() == 200

assert r2.getResponseText().contains('Job started')

assert r2.getResponseText().contains('DSP Has Bid Below The Floor')


///////////////////DSP Bidding But Not Winning//////////////////
def r3=WS.sendRequest(findTestObject('Dev_API/DSP Bidding But Not Winning'))
WS.verifyResponseStatusCode(r3, 200)

WS.containsString(r3, 'Job started', false)
WS.containsString(r3, 'DSP Bidding But Not Winning', false)

assert r3.getStatusCode() == 200

assert r3.getResponseText().contains('Job started')

assert r3.getResponseText().contains('DSP Bidding But Not Winning')


///////////////////DSP Revenue Decrease//////////////////
def r4=WS.sendRequest(findTestObject('Dev_API/DSP Revenue Decrease'))
WS.verifyResponseStatusCode(r4, 200)

WS.containsString(r4, 'Job started', false)
WS.containsString(r4, 'DSP Revenue Decrease', false)

assert r4.getStatusCode() == 200

assert r4.getResponseText().contains('Job started')

assert r4.getResponseText().contains('DSP Revenue Decrease')

///////////////////Deal Bidding No Impressions//////////////////
def r5=WS.sendRequest(findTestObject('Dev_API/Deal Bidding No Impressions'))
WS.verifyResponseStatusCode(r5, 200)

WS.containsString(r5, 'Job started', false)
WS.containsString(r5, 'Deal Bidding No Impressions', false)

assert r5.getStatusCode() == 200

assert r5.getResponseText().contains('Job started')

assert r5.getResponseText().contains('Deal Bidding No Impressions')

///////////////////Dsp Bid response Decrease//////////////////
def r6=WS.sendRequest(findTestObject('Dev_API/Dsp Bid response Decrease'))
WS.verifyResponseStatusCode(r5, 200)

WS.containsString(r6, 'Job started', false)
WS.containsString(r6, 'Dsp Bid response Decrease', false)

assert r6.getStatusCode() == 200

assert r6.getResponseText().contains('Job started')

assert r6.getResponseText().contains('Dsp Bid response Decrease')


///////////////////Deal Has Not Started Bidding//////////////////
def r7=WS.sendRequest(findTestObject('Dev_API/Deal Has Not Started Bidding'))
WS.verifyResponseStatusCode(r5, 200)

WS.containsString(r7, 'Job started', false)
WS.containsString(r7, 'Deal Has Not Stated Bidding', false)

assert r7.getStatusCode() == 200

assert r7.getResponseText().contains('Job started')

assert r7.getResponseText().contains('Deal Has Not Stated Bidding')


