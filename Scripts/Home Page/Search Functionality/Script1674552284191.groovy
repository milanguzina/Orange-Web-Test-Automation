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

WebUI.sendKeys(findTestObject('Navigation Sidebar/textbox_Search'), 'Admin')

WebUI.click(findTestObject('Navigation Sidebar/selected_option'))

WebUI.verifyElementText(findTestObject('Home Page/header_title_Homepage'), 'Admin')

WebUI.sendKeys(findTestObject('Navigation Sidebar/textbox_Search'), 'Directory')

WebUI.click(findTestObject('Navigation Sidebar/selected_option'))

WebUI.verifyElementText(findTestObject('Home Page/header_title_Homepage'), 'Directory')

WebUI.sendKeys(findTestObject('Navigation Sidebar/textbox_Search'), 'PIM')

WebUI.click(findTestObject('Navigation Sidebar/selected_option'))

WebUI.verifyElementText(findTestObject('Home Page/header_title_Homepage'), 'PIM')

WebUI.closeBrowser()

