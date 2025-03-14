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

WebUI.navigateToUrl('www.amazon.com')

WebUI.click(findTestObject('login_003_OR/Page_Amazon.com. Spend less. Smile more/a_Your Account'))

WebUI.selectOptionByLabel(findTestObject('Serch_item_010_DDT_OR/Page_Amazon.com. Spend less. Smile more/Category'), Category, 
    false)

WebUI.setText(findTestObject('Serch_item_010_DDT_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    SearchItem)

WebUI.click(findTestObject('Serch_item_010_DDT_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint-Search_Item'), false)

WebUI.closeBrowser()

