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

'Step 3: At Page frequent-projects, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button'))

'Step 4: At Page frequent-projects, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/div_object'))

'Step 5: At Page frequent-projects, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_1'))

'Step 6: At Page frequent-projects, click on input frequent project session name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/input_frequent_project_session_name'))

'Step 7: At Page frequent-projects, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_2'))

'Step 8: At Page frequent-projects, hover on div object'

WebUI.mouseOver(findTestObject('AI-Generated/Page_frequent-projects/div_object_1'))

'Step 9: At Page frequent-projects, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_3'))

'Step 10: At Page frequent-projects, click on input frequent project session name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/input_frequent_project_session_name'))

'Step 11: At Page frequent-projects, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_2'))

'Step 12: At Page frequent-projects, click on span object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/span_object'))

'Step 13: At Page frequent-projects, click on i object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/i_object'))

'Step 14: Add visual checkpoint at Page frequent-projects'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Page Frequent Projects after Specific Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
