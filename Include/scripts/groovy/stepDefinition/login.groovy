package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open Browser and redirect to url")
	public void open_Browser_and_redirect_to_url() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl("https://www.saucedemo.com/")
	}

	@When("User input username {string}")
	public void user_input_username(String username) {
		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Input_Username'), [('username') : username], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input password {string}")
	public void user_input_password(String password) {
		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Input_Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Click Login Buttons")
	public void user_Click_Login_Buttons() {

		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Click_Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see verify success")
	public void user_see_verify_success(){

		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Verify_Success'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User see verify failed {string}")
	public void user_see_verify_failed(String error_msg){
		WebUI.callTestCase(findTestCase('WEB/SauceDemo/Pages/User_Login/Read_Error_Message'), [('error_msg') : error_msg],
		FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser()
	}
}