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

WebUI.click(findTestObject('Navigation Sidebar/a_Admin'))

WebUI.click(findTestObject('Admin Page/Nationalities/button_Add'))

WebUI.click(findTestObject('Admin Page/User Management/dropdown_Select'))

WebUI.click(findTestObject('Admin Page/User Management/option_Admin'))

WebUI.click(findTestObject('Admin Page/User Management/dropdown_Select'))

WebUI.click(findTestObject('Admin Page/User Management/option_Enabled'))

WebUI.sendKeys(findTestObject('Admin Page/User Management/textbox_EmployeeName'), 'm')

WebUI.waitForElementPresent(findTestObject('Admin Page/User Management/dropdown_table'), 10)

WebUI.waitForElementClickable(findTestObject('Admin Page/User Management/dropdown_EmployeeName_option'), 10)

CustomKeywords.'orange.keywords.randomClick'(findTestObject('Admin Page/User Management/dropdown_EmployeeName_option'))

WebUI.sendKeys(findTestObject('Admin Page/User Management/textbox_Username'), 'Marco DiVaio')

WebUI.setEncryptedText(findTestObject('Admin Page/User Management/textbox_Password'), 'zow4LEKZVFY9FezsXiYM4A==')

WebUI.setEncryptedText(findTestObject('Admin Page/User Management/textbox_Confirm Password'), 'zow4LEKZVFY9FezsXiYM4A==')

WebUI.click(findTestObject('Admin Page/Nationalities/button_Save'))

WebUI.takeScreenshotAsCheckpoint('Entered User Info')

WebUI.waitForElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullySaved'), 10)

WebUI.verifyElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullySaved'), 10)

