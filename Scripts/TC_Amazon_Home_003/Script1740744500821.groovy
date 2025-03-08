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

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Amazon.com. Spend less. Smile more/div_Your Account      Help      Cart'))

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Amazon.com. Spend less. Smile more/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Your Account/span_Account  Lists'))

WebUI.setText(findTestObject('Object Repository/Amazon_log-in_elements/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '8582912274')

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Amazon Sign-In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setText(findTestObject('Object Repository/Amazon_log-in_elements/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '+918582912274')

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Amazon Sign-In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setText(findTestObject('Object Repository/Amazon_log-in_elements/Page_Authentication required/input_Enter security code_code'), 
    '892168')

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Authentication required/input_Please enter the verification code_a-_1cda9a'))

WebUI.doubleClick(findTestObject('Object Repository/Amazon_log-in_elements/Page_Authentication required/span_Continue'))

WebUI.click(findTestObject('Object Repository/Amazon_log-in_elements/Page_Authentication required/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Amazon_log-in_elements/Page_Authentication required/input_Enter security code_code'), 
    '892168')

