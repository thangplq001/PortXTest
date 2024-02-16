import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page frequent-project-replies, click on button > navigate to Page frequent-project-reply-services'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-project-replies/button'))

'Step 3: At Page frequent-project-reply-services, click on button dropdownbasic1'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-project-reply-services/button_dropdownbasic1'))

'Step 4: At Page frequent-project-reply-services, click on button excel'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-project-reply-services/button_excel'))

'Step 5: At Page frequent-project-reply-services, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-project-reply-services/input_object'))

'Step 6: Add visual checkpoint at Page frequent-project-reply-services'

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Verify Page Frequent Project Reply Services_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}