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

'Step 2: At Page frequent-projects, click on hyperlink > navigate to Page bills'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent-projects/hyperlink_3'))

'Step 3: At Page bills, click on button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/button'))

'Step 4: At Page bills, click on h5 object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/h5_object'))

'Step 5: At Page bills, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/input_object'))

'Step 6: At Page bills, click on button > navigate to Page bills notification'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/button_1'))

'Step 7: At Page bills notification, click on hyperlink > navigate to Page bills'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills_notification/hyperlink'))

'Step 8: At Page bills, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_bills/div_object_1'))

'Step 9: Add visual checkpoint at Page bills'

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Verify Successful Bills and Objects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
