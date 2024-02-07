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

'Step 17: At Page frequent-projects, click on button > navigate to Page frequent-projects edit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_7'))

'Step 18: At Page frequent-projects edit, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/div_object'))

'Step 19: At Page frequent-projects edit, click on button dropdownbasic1'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/button_dropdownbasic1'))

'Step 20: At Page frequent-projects edit, click on button excel'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/button_excel'))

'Step 21: At Page frequent-projects edit, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/input_object'))

'Step 22: Add visual checkpoint at Page frequent-projects edit'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Page Frequent Projects Edit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
