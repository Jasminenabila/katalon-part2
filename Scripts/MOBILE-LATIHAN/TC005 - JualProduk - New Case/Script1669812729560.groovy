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

Mobile.startApplication('/Users/jasmine/Downloads/second-hand.apk', true)

Mobile.getDeviceWidth()

Mobile.getDeviceHeight()

Mobile.tap(findTestObject('Object Repository/record_new_mobile/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/record_new_mobile/android.widget.Button - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/record_new_mobile/android.widget.EditText - Masukkan email'), 'jasminenabila19@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/record_new_mobile/android.widget.EditText - Masukkan password'), 'password123', 
    0)

Mobile.tap(findTestObject('Object Repository/record_new_mobile/android.widget.Button - Masuk (1)'), 0)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - Nama Produk'), "Produk 1 testing", 0)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - Rp 0,00'), "35000", 0)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - Lokasi Produk (1)'), "Bandung", 0)

Mobile.tap(findTestObject('Object Repository/record_new_mobile/android.widget.Spinner - Pilih Kategori'), 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.FrameLayout'), 0)

Mobile.setText(findTestObject('Object Repository/secondhand_mobile/android.widget.EditText - Contoh Barang bagus mantap'), "ini cuman testing aja yaps", 0)

Mobile.delay(5)

Mobile.scrollToText("Foto Produk")

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.ImageView_uploadApp'), 10)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.Button_PilihGambarGaleri'), 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.TextView - AmazeTextViewEmulator'), 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.CheckedTextView - DownloadAmaze'), 0)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.RelativeLayout_FileNameFoto'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.TextView - 3482929973-1.png'), 0)

Mobile.delay(5)

Mobile.scrollToText("Foto Produk")

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.Button - Preview'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/secondhand_mobile/android.widget.Button - Terbitkan (1)'), 0)

Mobile.takeScreenshot('/Users/jasmine/Katalon Studio/latihan-katalon/Images/secondhand-uploadFoto.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)