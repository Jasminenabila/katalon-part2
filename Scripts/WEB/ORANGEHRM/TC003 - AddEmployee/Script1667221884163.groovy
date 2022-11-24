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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

//WebUI.callTestCase(findTestCase('WEB/ORANGEHRM/TC001 - loginOrangeHRM'), [('username') : username, ('password') : password], 
//    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/btnAddEmployee'))

//String directory = RunConfiguration.getProjectDir()
//pathFile = (directory + '/images/') + image
//WebUI.comment(pathFile)
//WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/i_Add Employee_oxd-icon bi-plus'))
//WebUI.delay(5)
//WebUI.uploadFile(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/i_Add Employee_oxd-icon bi-plus'), pathFile)
//WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Employee Full Name_firstName'), 'QA')

WebUI.setText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Employee Full Name_middleName'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Employee Full Name_lastName'), 'Indonesia')

WebUI.setText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    '02')

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'qate')

WebUI.setText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    'qatest')

WebUI.setEncryptedText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus o_671073'), 
    'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/div_Accepts jpg, .png, .gif up to 1MB. Reco_203e95'))

WebUI.setEncryptedText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus o_671073'), 
    'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/div_Employee Full NameEmployee IdCreate Log_42e988'))

WebUI.setEncryptedText(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus o_671073'), 
    'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

