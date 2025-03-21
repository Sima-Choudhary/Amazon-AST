import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
	WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon.com. Spend less. Smile more/a_Your Account'))

	WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Your Account/span_Hello, sign in'))	

	WebUI.setText(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '+918582912274')

	WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Wrong or Invalid email address or mob_77ed40'))

	WebUI.setEncryptedText(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Forgot password_password'), 
    'CRqjWPeblyV95o9fznV5pg==')

	WebUI.click(findTestObject('Object Repository/Order_as_Gift/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {
		notChecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Order_as_Gift/Page_Amazon.com Shopping Cart/i_In Stock_a-icon a-icon-checkbox'),
			0)
	
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	//@BeforeTestSuite
	//def sampleBeforeTestSuite() {

	//}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	//@AfterTestSuite
	//def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		//println testSuiteContext.getTestSuiteId()
	//}
}