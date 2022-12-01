import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper

request = findTestObject('Object Repository/API/Postman/Get Data Users ID', [('id') : id])

'---get request url and request body---'
WebUI.comment(((request.getRestUrl()) as String))

sendRequest = WS.sendRequest(request)
def response_result = new JsonSlurper().parseText(sendRequest.getResponseBodyContent())
WebUI.comment("Response :" +sendRequest.getResponseBodyContent())

statusCode = sendRequest.getStatusCode().toString()
WS.comment(statusCode)

//if(statusCode == '200') {
//	
//	String usrName = response_result.get('userName')
//	WS.comment(usrName)
//	WS.verifyMatch(usrName, "User 1", false)
//	
//	String id = response_result.get('id')
//	WS.comment(id)
//	WS.verifyMatch(id, "1", false)
//	
//	String password = response_result.get('password')
//	WS.comment(password)
//	WS.verifyMatch(password, "Password1", false)
//}
//
//else {
//	
//	WS.comment("ERROR")
//}

