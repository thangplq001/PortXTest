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

'Step 5: At Page lanes, click on hyperlink > navigate to Page suppliers'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_lanes/hyperlink_3'))

'Step 6: At Page suppliers, click on hyperlink > navigate to Page mail-templates'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_suppliers/hyperlink'))

'Step 7: At Page mail-templates, click on hyperlink'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_mail-templates/hyperlink'))

'Step 8: At Page mail-templates, click on hyperlink > navigate to Page bills'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_mail-templates/hyperlink_1'))

'Step 9: At Page bills, click on hyperlink > navigate to Page frequent-projects'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/hyperlink_2'))

'Step 10: At Page frequent-projects, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/div_object'))

'Step 11: At Page frequent-projects, click on button > navigate to Page frequent-projects edit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_7'))

'Step 12: At Page frequent-projects edit, click on div lpx wrapper'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/div_lpx_wrapper'))

'Step 13: At Page frequent-projects edit, input on input project name'

WebUI.setText(findTestObject('AI-Generated/Page_frequent-projects_edit/input_project_name'), input_project_name)

'Step 14: At Page frequent-projects edit, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/div_object_1'))

'Step 15: At Page frequent-projects edit, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/input_object_1'))

'Step 16: At Page frequent-projects edit, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/div_object_2'))

'Step 17: At Page frequent-projects edit, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_frequent-projects_edit/div_object_3'))

'Step 18: At Page frequent-projects edit, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/input_object_2'))

'Step 19: Add visual checkpoint at Page frequent-projects edit'

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Verify Page Frequent Projects Edit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
