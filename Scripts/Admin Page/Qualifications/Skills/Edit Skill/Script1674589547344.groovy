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

WebUI.openBrowser(GlobalVariable.baseURL)

WebUI.maximizeWindow()

CustomKeywords.'orange.keywords.userLogin'(findTestObject('Login Page/textbox_Username'), GlobalVariable.username, findTestObject(
        'Login Papge/textbox_Password'), GlobalVariable.password, findTestObject('Login Page/button_Login'))

WebUI.click(findTestObject('Navigation Sidebar/a_Admin'))

WebUI.click(findTestObject('Admin Page/Qualifications/li_Qualifications'))

WebUI.click(findTestObject('Admin Page/Qualifications/Skills/li_Skills'))

WebUI.click(findTestObject('Admin Page/Qualifications/Skills/button_Edit'))

WebUI.sendKeys(findTestObject('Admin Page/Qualifications/Skills/textbox_Username'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Admin Page/Qualifications/Skills/textbox_Username_selected'), 'Assertiveness-Automation-Edited')

WebUI.sendKeys(findTestObject('Admin Page/Qualifications/Skills/textarea_Description'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Admin Page/Qualifications/Skills/textarea_Description'), 'New description-new skill')

WebUI.click(findTestObject('Admin Page/Qualifications/Skills/button_Save'))

WebUI.waitForElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullyUpdated'), 10)

WebUI.verifyElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullyUpdated'), 10)

WebUI.closeBrowser()

