package stepDefinitions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import internal.GlobalVariable

public class logins {

	@Given("Open Website and redirect to saucedemo")
	public void open_Website_and_redirect_to_saucedemo() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.saucedemo)
		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Verify_Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User enter username {string}")
	public void user_enter_username(String username) {

		WebUI.setText(findTestObject('Object Repository/Page_Login_SauceDemo/input_username'), username)
	}

	@When("User enter password {string}")
	public void user_enter_password(String password) {

		WebUI.setText(findTestObject('Object Repository/Page_Login_SauceDemo/input_password'), password)
	}

	@When("Click button Login")
	public void click_button_Login() {

		WebUI.click(findTestObject('Object Repository/Page_Login_SauceDemo/button_login'))
	}

	@Then("User verify success to dashboard home")
	public void user_verify_success_to_dashboard_home() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login_SauceDemo/verifyProductSuccess'))
		WebUI.closeBrowser()
	}

	@Then("User verify failed message error {string}")
	public void user_verify_failed_message_error(String error_msg) {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login_SauceDemo/class_error'))
		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Read_Error_Message'), [('error_msg') : error_msg], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
		//WebUI.verifyMatch(findTestObject('Object Repository/Page_Login_SauceDemo/class_error'), error_msg, false)

	}
}

