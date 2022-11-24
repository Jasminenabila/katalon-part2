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

Mobile.startApplication('apk/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk', 
    true)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/mobile_saucedemo/android.widget.EditText - Username'), 'standard_user', 
    0)

Mobile.setText(findTestObject('Object Repository/mobile_saucedemo/android.widget.EditText - Password'), 'secret_sauce', 
    0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.widget.TextView - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.view.ViewGroup (1)'), 0)

Mobile.setText(findTestObject('Object Repository/mobile_saucedemo/android.widget.EditText - First Name'), 'test qa 123', 
    0)

Mobile.setText(findTestObject('Object Repository/mobile_saucedemo/android.widget.EditText - Last Name'), 'engineer', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.widget.TextView - CONTINUE'), 0)

Mobile.setText(findTestObject('Object Repository/mobile_saucedemo/android.widget.EditText - ZipPostal Code (2)'), '17510', 
    0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.widget.TextView - CONTINUE (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile_saucedemo/android.view.ViewGroup (2)'), 0)

Mobile.closeApplication()

