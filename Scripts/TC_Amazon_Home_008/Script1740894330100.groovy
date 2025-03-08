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

WebUI.maximizeWindow()

WebUI.click(findTestObject('tracking_Order_element/Page_Amazon.com. Spend less. Smile more/span_Account  Lists'))

WebUI.setText(findTestObject('Object Repository/tracking_Order_element/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '+918582912274')

WebUI.click(findTestObject('Object Repository/tracking_Order_element/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.setEncryptedText(findTestObject('Object Repository/tracking_Order_element/Page_Amazon Sign-In/input_Forgot password_password'), 
    'CRqjWPeblyV95o9fznV5pg==')

WebUI.click(findTestObject('Object Repository/tracking_Order_element/Page_Amazon.com. Spend less. Smile more/span_Orders'))

WebUI.setText(findTestObject('Object Repository/tracking_Order_element/Page_Your Orders/input_Your Orders_search'), '234876235')

WebUI.click(findTestObject('Object Repository/tracking_Order_element/Page_Your Orders/input_Your Orders_a-button-input'))

WebUI.closeBrowser()

