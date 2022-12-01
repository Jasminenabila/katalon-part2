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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('/Users/jasmine/Downloads/second-hand.apk', true)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.neweditorsearch'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_B)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_A)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_J)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_U)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/androidx.cardview.CardView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.Button - Saya Tertarik dan Ingin Nego'), 0)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - Masukkan email'), "jasminenabila19@gmail.com", 0)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - Masukkan password'), 'password123', 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.Button - Saya Tertarik dan Ingin Nego'), 5)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - hargaTawar'), "10000", 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.Button - KirimPenawaran'), 0)

Mobile.takeScreenshot('/Users/jasmine/Katalon Studio/latihan-katalon/Images/secondhand.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.closeApplication()

