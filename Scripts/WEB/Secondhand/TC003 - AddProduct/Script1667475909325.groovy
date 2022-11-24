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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

WebUI.callTestCase(findTestCase('WEB/Secondhand/TC005 - Login Penawar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/secondhand/OR009 - ClickCategoryBaju'))

String dynamicId = '7'
String css = '#root > div > div > div.container.pb-5 > div.products > div:nth-child('+dynamicId+") > div > p.card-title"
TestObject to = new TestObject("objectName")
to.addProperty("css", ConditionType.EQUALS, css)
WebUI.click(to)

//WebUI.click(findTestObject('Object Repository/secondhand/OR010 - ClickTitleProduct'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/secondhand/OR011 - ImagePrseentProduct'))

def getText = WebUI.getText(findTestObject('Object Repository/secondhand/OR012 - LabelText'))
println getText

if(getText == 'Saya tertarik dan ingin nego') {
	WebUI.click(findTestObject('Object Repository/secondhand/OR013 - ClickButtonNego'))
	WebUI.verifyElementPresent(findTestObject('Object Repository/secondhand/OR014 - InputHargaTawar'), 5)
	WebUI.setText(findTestObject('Object Repository/secondhand/OR014 - InputHargaTawar'), "75000")
	WebUI.comment("Saya sudah membuat penawaran")
}
else {
	WebUI.verifyElementVisible(findTestObject('Object Repository/secondhand/OR012 - LabelText'))
	WebUI.comment("Saya sedang menunggu respon penjual")
}

WebUI.takeScreenshot()
WebUI.closeBrowser()
