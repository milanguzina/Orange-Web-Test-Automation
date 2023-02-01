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
        'Login Page/textbox_Password'), GlobalVariable.password, findTestObject('Login Page/button_Login'))

WebUI.click(findTestObject('Navigation Sidebar/a_Recruitment'))

WebUI.waitForElementPresent(findTestObject('Recruitment Page/Vacancies/button_Add'), 10)

WebUI.click(findTestObject('Admin Page/Nationalities/button_Add'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/texbox_firstName'), 'Nigel')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/texbox_middleName'), 'Five')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/texbox_lastName'), 'DeJong-Automation')

WebUI.click(findTestObject('Recruitment Page/Vacancies/dropdown_Vacancy'))

WebUI.waitForElementPresent(findTestObject('Recruitment Page/Vacancies/dropdown_table'), 10)

WebUI.waitForElementClickable(findTestObject('Recruitment Page/Vacancies/dropdown_Vacancy_option'), 10)

WebUI.click(findTestObject('Recruitment Page/Vacancies/option_Sales_Representative'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/texbox_Email'), 'nigel@automation.com')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Contact_Number'), '555444333')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Keywords'), 'static, dynamic, nice')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Date _of_Application'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Date _of_Application'), '2022-10-10')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox__Notes'), 'Application notes')

WebUI.click(findTestObject('Recruitment Page/Vacancies/checkbox_Consent'))

WebUI.click(findTestObject('Admin Page/Nationalities/button_Save'))

WebUI.waitForElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullySaved'), 10)

WebUI.verifyElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullySaved'), 10)

WebUI.closeBrowser()

