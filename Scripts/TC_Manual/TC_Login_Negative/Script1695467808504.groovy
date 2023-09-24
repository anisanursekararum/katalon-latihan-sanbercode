import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

WebUI.setViewPortSize(GlobalVariable.viewportWidth, GlobalVariable.viewportHeight)

WebUI.click(findTestObject('ObjManualSpy/Homepage/button_menu_toggle'))

WebUI.waitForElementVisible(findTestObject('ObjManualSpy/Homepage/button_make_appointment'), 0)

WebUI.waitForElementClickable(findTestObject('ObjManualSpy/Homepage/button_menu_toggle'), 0)

WebUI.waitForElementVisible(findTestObject('ObjManualSpy/Homepage/button_login'), 0)

WebUI.click(findTestObject('ObjManualSpy/Homepage/button_login'))

String loginURL = WebUI.getUrl()

String loginText = 'login'

WebUI.verifyMatch(loginURL, ('.*' + loginText) + '.*', true)

WebUI.waitForElementVisible(findTestObject('ObjManualSpy/Login/label_login'), 0)

WebUI.waitForElementPresent(findTestObject('ObjManualSpy/Login/input_username'), 0)

WebUI.waitForElementClickable(findTestObject('ObjManualSpy/Login/button_login'), 0)

WebUI.click(findTestObject('ObjManualSpy/Login/button_login'))

WebUI.waitForElementPresent(findTestObject('ObjManualSpy/Login/label_login_failed'), 0)

String failedMessages = 'Login failed! Please ensure the username and password are valid.'

WebUI.verifyElementText(findTestObject('ObjManualSpy/Login/label_login_failed'), failedMessages)


