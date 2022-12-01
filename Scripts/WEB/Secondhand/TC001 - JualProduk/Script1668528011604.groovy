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

String getRandomString = CustomKeywords.'Notes.randomString'()
String getRandomPrice = CustomKeywords.'Notes.randomNumber'()

WebUI.callTestCase(findTestCase('WEB/Secondhand/TC002 - Login Penjual1234'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/archive/OR008 - btnJual'))

WebUI.verifyElementPresent(findTestObject('Object Repository/secondhand/OR003 - inputProductName'), 30)

WebUI.setText(findTestObject('Object Repository/secondhand/OR003 - inputProductName'), productName + getRandomString)

WebUI.setText(findTestObject('Object Repository/secondhand/OR004 - inputPrice'), getRandomPrice)

WebUI.click(findTestObject('Object Repository/secondhand/OR005 - OptionKategori'))

WebUI.selectOptionByValue(findTestObject('Object Repository/secondhand/OR005 - OptionKategori'), '3', false)

WebUI.setText(findTestObject('Object Repository/secondhand/OR006 - inputDeskripsi'), 'Goodie bag yang oke cocok untuk dibuat santai dan simple')

String directory = RunConfiguration.getProjectDir()

pathFile = ((directory + '/images/') + 'test3.jpeg')

WebUI.comment(pathFile)

WebUI.uploadFile(findTestObject('Object Repository/secondhand/OR007 - UploadFile'), pathFile)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/secondhand/OR008 - btnTerbitkan'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()



