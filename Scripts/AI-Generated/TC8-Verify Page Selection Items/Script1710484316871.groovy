import katalon.truetest.TrueTestScripts
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://att.app.portx-demo.com/frequent-projects"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/frequent-projects')

"Step 2: Login into Application"

WebUI.takeScreenshot()

TrueTestScripts.login()

"Step 3: Click on link '\u30b9\u30dd\u30c3\u30c8\u898b\u7a4d'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_frequent_projects/hyperlink'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/frequent-projects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent_projects/hyperlink'))

"Step 4: Click on link '\u9078\u629e\u80a2\u30de\u30b9\u30bf' -> Navigate to page 'selection-items'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_frequent_projects/hyperlink_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/frequent-projects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_frequent_projects/hyperlink_2'))

"Step 5: Click on link '\u5834\u6240\u30de\u30b9\u30bf' -> Navigate to page 'places'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/hyperlink'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/hyperlink'))

"Step 6: Click on link '\u9078\u629e\u80a2\u30de\u30b9\u30bf' -> Navigate to page 'selection-items'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_places/hyperlink_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/places?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_places/hyperlink_1'))

"Step 7: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/div_object_1'))

"Step 8: Click on td"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/td_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/td_object'))

"Step 9: Click on button"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/button_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/button_object'))

"Step 10: Click on button"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/button_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/button_object_1'))

"Step 11: Click on textarea 'selection-item-description'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/textarea_selection_item_description'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/textarea_selection_item_description'))

"Step 12: Enter input value in textarea 'selection-item-description'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/textarea_selection_item_description'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_selection_items/textarea_selection_item_description'), textarea_selection_item_description)

"Step 13: Click on button ' \u4fdd\u5b58'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/button'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/button'))

"Step 14: Click on td"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/td_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/td_object_1'))

"Step 15: Click on button"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/button_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/button_object'))

"Step 16: Click on button"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/button_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_selection_items/button_object_1'))

"Step 17: Enter input value in input field 'selection-item-name'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_selection_items/input_selection_item_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/selection-items?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_selection_items/input_selection_item_name'), input_selection_item_name)

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Page Selection Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
