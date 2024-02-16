import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Initialize test session: Open browser and set view port'

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

'Step 1: Navigate to Page frequent-projects'
WebUI.navigateToUrl(GlobalVariable.application_domain + '/frequent-projects')

'Step 2: At Page frequent-projects, click on hyperlink'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink'))

'Step 3: At Page frequent-projects, click on hyperlink > navigate to Page billing-items'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink_2'))

'Step 4: At Page billing-items, click on hyperlink > navigate to Page estimate-items'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/hyperlink_1'))

'Step 5: At Page estimate-items, click on hyperlink > navigate to Page bills'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_estimate-items/hyperlink'))

'Step 6: At Page bills, click on hyperlink'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/hyperlink'))

'Step 7: At Page bills, click on hyperlink > navigate to Page lanes'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/hyperlink_1'))

'Step 8: At Page lanes, click on button dropdownbasic1'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/button_dropdownbasic1'))

'Step 9: At Page lanes, click on button excel'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/button_excel'))

'Step 10: At Page lanes, click on h5 object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/h5_object'))

'Step 11: At Page lanes, click on input object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/input_object'))

'Step 12: At Page lanes, click on button'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/button'))

'Step 13: At Page lanes, click on div object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/div_object_1'))

'Step 14: At Page lanes, click on hyperlink > navigate to Page bills'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/hyperlink_1'))

'Step 15: At Page bills, click on hyperlink > navigate to Page frequent-projects'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/hyperlink_2'))

'Step 16: At Page frequent-projects, click on div object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/div_object'))

'Step 17: At Page frequent-projects, click on button ngb nav 26'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_ngb_nav_26'))

'Step 18: At Page frequent-projects, click on hyperlink'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink'))

'Step 19: At Page frequent-projects, click on hyperlink > navigate to Page suppliers'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink_4'))

'Step 20: At Page suppliers, click on td object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/td_object'))

'Step 21: At Page suppliers, click on button'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/button_2'))

'Step 22: At Page suppliers, click on label object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/label_object'))

'Step 23: At Page suppliers, click on input user supplier name'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/input_supplier_name'))

'Step 24: At Page suppliers, input on input user supplier name'
WebUI.setText(findTestObject('AI-Generated/Page_suppliers/input_supplier_name'), input_user_supplier_name)

'Step 25: At Page suppliers, click on input user supplier email'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/input_user_supplier_email'))

'Step 26: At Page suppliers, click on textarea user supplier remark'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/textarea_user_supplier_remark'))

'Step 27: At Page suppliers, click on ngb object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/ngb_object'))

'Step 28: At Page suppliers, click on button'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/button_1'))

'Step 29: At Page suppliers, hover on div object'
WebUI.mouseOver(findTestObject('AI-Generated/Page_suppliers/div_object_1'))

'Step 30: At Page suppliers, hover on tr object'
WebUI.mouseOver(findTestObject('AI-Generated/Page_suppliers/tr_object'))

'Step 31: At Page suppliers, click on button object'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/button_object'))

'Step 32: At Page suppliers, click on input supplier name'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/input_supplier_name'))

'Step 33: At Page suppliers, input on input supplier name'
WebUI.setText(findTestObject('AI-Generated/Page_suppliers/input_supplier_name'), input_supplier_name)

'Step 34: At Page suppliers, click on button'
WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/button_1'))

'Step 35: Add visual checkpoint at Page suppliers'
WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Page Suppliers_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.SetUp
def setup() {
    WebUI.openBrowser('')

    WebUI.setViewPortSize(1920, 1080)
}

@com.kms.katalon.core.annotation.TearDown
def teardown() {
    WebUI.closeBrowser()
}

