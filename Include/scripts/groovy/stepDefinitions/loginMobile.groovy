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

import internal.GlobalVariable
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class loginMobile {
	
	@Given("User launch app")
	public void user_launch_app() {
		Mobile.startApplication('/Users/jasmine/Katalon Studio/latihan-katalon/apk/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk', 
    false)
	
	}
	
	@When("User verify login has been loaded")
	public void user_verify_login_has_been_loaded() {
		Mobile.verifyElementVisible(findTestObject('mobile_automation_latihan/enter_username'), 10)
		Mobile.verifyElementVisible(findTestObject('Object Repository/mobile_automation_latihan/enter_password'), 10)
		
	}
	
	@When("User input username mobile apk {string}")
	public void user_input_username_mobile_apk(String email) {
		Mobile.setText(findTestObject('Object Repository/mobile_automation_latihan/enter_username'), email, 10)
	}
	
	@When("User input password mobile apk {string}")
	public void user_input_password_mobile_apk(String password) {
		Mobile.setText(findTestObject('Object Repository/mobile_automation_latihan/enter_password'), password, 10)
		
	}
	
	@When("User click button login mobile apk")
	public void user_click_button_login_mobile_apk() {
		Mobile.tap(findTestObject('Object Repository/mobile_automation_latihan/btn_login'), 10)
	}
	
	@Then("User has been successfully login dashboard saucedemo mobile apk")
	public void user_has_been_successfully_login_dashboard_saucedemo_mobile_apk() {
		Mobile.delay(3)
		Mobile.verifyElementVisible(findTestObject('Object Repository/mobile_automation_latihan/icon_product'), 10)
		Mobile.takeScreenshot('/Users/jasmine/Katalon Studio/latihan-katalon/Images/screenshot-cucumber.png', FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()
	}
}
