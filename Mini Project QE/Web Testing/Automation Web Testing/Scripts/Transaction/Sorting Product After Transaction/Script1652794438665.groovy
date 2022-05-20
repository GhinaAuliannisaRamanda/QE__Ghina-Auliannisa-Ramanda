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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.alta.id/')

WebUI.click(findTestObject('Login/button_to_login'))

WebUI.setText(findTestObject('Login/Email Field'), 'nomnomnom@gmail.com')

WebUI.setText(findTestObject('Login/Password Field'), '12345678')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.click(findTestObject('Shorting Product Transaction/profile menu'))

WebUI.click(findTestObject('Object Repository/Shorting Product Transaction/button_transaksi'))

WebUI.click(findTestObject('Shorting Product Transaction/halaman_transaksi'))

WebUI.refresh()

WebUI.click(findTestObject('Shorting Product Transaction/Produk_sorting'))

WebUI.delay(10)

WebUI.closeBrowser()

