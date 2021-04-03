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

WebUI.waitForPageLoad(3);

WebUI.click(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/a_LOGIN'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/a_LOGIN'), 3);

WebUI.setText(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/input'), 'mulakdev@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/input_1'), '+MfhyFZ71/7fzlB1p/ebXw==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/button_LOGIN'))

// WebUI.click(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/span_Slide to login'), 'Slide to login')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Lazada.com.my Login And Home/span_Slide to login'), 3);

WebUI.closeBrowser()
