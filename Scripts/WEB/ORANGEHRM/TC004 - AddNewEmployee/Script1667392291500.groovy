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

WebUI.callTestCase(findTestCase('WEB/ORANGEHRM/TC001 - loginOrangeHRM'), [('username') : 'Admin', ('password') : 'admin123'], 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('WEB/ORANGEHRM/TC001 - loginOrangeHRM'), [('username') : 'Admin', ('password') : 'admin123'], 
//    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/btnAddEmployee'))

WebUI.waitForElementPresent(findTestObject('OrangeHRM - AddEmployee/OR001 - inputFirstName'), 30)

WebUI.setText(findTestObject('OrangeHRM - AddEmployee/OR001 - inputFirstName'), 'Jisoo')

WebUI.setText(findTestObject('OrangeHRM - AddEmployee/OR002 - inputMiddleName'), 'Jasmine')

WebUI.setText(findTestObject('OrangeHRM - AddEmployee/OR003 - inputLastName'), 'Blackpink')

WebUI.setText(findTestObject('OrangeHRM - AddEmployee/OR004 - inputEmployeeID'), '0909')

WebUI.click(findTestObject('Object Repository/OR003 - recordWeb/Page_OrangeHRM/button_Save'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()


WebUI.selectOptionByValue(findTestObject, "4", false)


