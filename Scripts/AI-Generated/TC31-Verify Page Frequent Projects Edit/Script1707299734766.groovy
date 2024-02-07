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

'Step 5: At Page frequent-projects, click on button > navigate to Page frequent-projects edit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/button_7'))

'Step 6: At Page frequent-projects edit, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/button_1'))

'Step 7: At Page frequent-projects edit, click on span object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/span_object'))

'Step 8: At Page frequent-projects edit, click on button object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/button_object'))

'Step 9: At Page frequent-projects edit, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects_edit/button_2'))

'Step 10: Add visual checkpoint at Page frequent-projects edit'

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Verify Page Frequent Projects Edit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
