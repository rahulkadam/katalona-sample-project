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

WebUI.navigateToUrl('https://www.lazada.com.my/')

WebUI.click(findTestObject('Object Repository/Page_Lazada.com.my Best Online Shopping in _4f40cd/a_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_Lazada.com.my Online Shopping Malaysia_f635c7/input'), 'mulakdev@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Lazada.com.my Online Shopping Malaysia_f635c7/input'))

WebUI.click(findTestObject('Object Repository/Page_Lazada.com.my Online Shopping Malaysia_f635c7/span_LazMall'))

WebUI.click(findTestObject('Object Repository/Page_LazMall  100 Authentic Brands Products_5d7549/div_RM 38.00'))

WebUI.click(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/i_Messages_next-icon next-icon-close next-i_ca80d3'))

WebUI.click(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/span_Buy Now'))

WebUI.setText(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/input'), 'mulakdev@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/input_1'), 'ub4/JrFGQUCgG7ehEACUDw==')

WebUI.click(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/a_refresh'))

WebUI.click(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/center_Loading                             _d9a37b'))

WebUI.click(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/a_refresh'))

WebUI.rightClick(findTestObject('Object Repository/Page_ZANZEA Muslimah Womens Muslim Long Sle_430815/div_document.write(window._punish_language__1b57a6'))

WebUI.closeBrowser()

