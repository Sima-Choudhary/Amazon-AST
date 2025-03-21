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

WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon.com. Spend less. Smile more/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Your Account/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '+918582912274')

WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setEncryptedText(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Forgot password_password'), 
    'CRqjWPeblyV95o9fznV5pg==')

WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Your Account/span_Orders_nav-cart-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon.com Shopping Cart/i_In Stock_a-icon a-icon-checkbox'))

notChecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Order_as_Gift/Page_Amazon.com Shopping Cart/i_In Stock_a-icon a-icon-checkbox'), 0)  

if(notChecked == true) {
	System.out.println("Checked")
	WebUI.check(findTestObject('Object Repository/Order_as_Gift/Page_Amazon.com Shopping Cart/i_In Stock_a-icon a-icon-checkbox'))
}



