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

'Step 13: At Page selection-items, click on button object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection-items/button_object'))

'Step 14: At Page selection-items, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection-items/button'))

'Step 15: Add visual checkpoint at Page selection-items'

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Verify Page Selection Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
