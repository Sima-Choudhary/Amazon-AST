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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('login_003_OR/Page_Amazon.com. Spend less. Smile more/a_Your Account'))

WebUI.click(findTestObject('Object Repository/currency_setting_004_OR/Page_Amazon.com. Spend less. Smile more/span_USD - U.S. Dollar'))

WebUI.click(findTestObject('Object Repository/currency_setting_004_OR/Page_Change Language  Currency Settings/span_- USD - US Dollar (Default)'))

WebUI.click(findTestObject('Object Repository/currency_setting_004_OR/Page_Change Language  Currency Settings/a_- INR - Indian Rupee'))

WebUI.click(findTestObject('Object Repository/currency_setting_004_OR/Page_Change Language  Currency Settings/input_Cancel_a-button-input'))

WebUI.closeBrowser()

