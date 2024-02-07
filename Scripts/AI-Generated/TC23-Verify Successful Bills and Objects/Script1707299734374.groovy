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

'Step 9: At Page bills, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/button'))

'Step 10: At Page bills, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/div_object'))

'Step 11: At Page bills, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/input_object'))

'Step 12: Add visual checkpoint at Page bills'

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Verify Successful Bills and Objects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
