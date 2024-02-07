import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page frequent-projects'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/frequent-projects')

'Step 2: At Page frequent-projects, click on button stop'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_stop'))

'Step 3: At Page frequent-projects, click on hyperlink'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink'))

'Step 4: At Page frequent-projects, click on hyperlink > navigate to Page lanes'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink_1'))

'Step 5: At Page lanes, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/div_object'))

'Step 6: At Page lanes, click on hyperlink > navigate to Page billing-items'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/hyperlink'))

'Step 7: At Page billing-items, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/button'))

'Step 8: At Page billing-items, click on input billing item group name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/input_billing_item_group_name'))

'Step 9: At Page billing-items, click on select billing item group category'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/select_billing_item_group_category'))

'Step 10: At Page billing-items, click on select billing item group category'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/select_billing_item_group_category'))

'Step 11: At Page billing-items, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/button_1'))

'Step 12: At Page billing-items, click on hyperlink > navigate to Page selection-items'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_billing-items/hyperlink'))

'Step 13: At Page selection-items, click on hyperlink > navigate to Page suppliers'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection-items/hyperlink'))

'Step 14: At Page suppliers, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/button'))

'Step 15: At Page suppliers, click on label object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/label_object'))

'Step 16: At Page suppliers, click on input supplier name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/input_supplier_name'))

'Step 17: At Page suppliers, click on div abp modal header'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/div_abp_modal_header'))

'Step 18: At Page suppliers, click on input supplier name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/input_supplier_name'))

'Step 19: At Page suppliers, hover on ng object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_suppliers/ng_object'))

'Step 20: At Page suppliers, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/div_object'))

'Step 21: At Page suppliers, click on span object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/span_object'))

'Step 22: At Page suppliers, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/button_1'))

'Step 23: At Page suppliers, click on hyperlink > navigate to Page frequent-projects'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/hyperlink_1'))

'Step 24: Add visual checkpoint at Page frequent-projects'

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Verify Page Suppliers_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
