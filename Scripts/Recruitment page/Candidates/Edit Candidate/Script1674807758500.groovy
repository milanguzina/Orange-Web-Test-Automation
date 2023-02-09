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

WebUI.click(findTestObject('Navigation Sidebar/a_Recruitment'))

WebUI.waitForElementPresent(findTestObject('Recruitment Page/Vacancies/button_Add'), 10)

WebUI.click(findTestObject('Recruitment Page/Vacancies/button_View_application'))

WebUI.click(findTestObject('Recruitment Page/Vacancies/toggle_Edit'))

WebUI.click(findTestObject('Recruitment Page/Vacancies/dropdown_Vacancy'))

WebUI.waitForElementPresent(findTestObject('Recruitment Page/Vacancies/dropdown_table'), 10)

WebUI.waitForElementClickable(findTestObject('Recruitment Page/Vacancies/dropdown_Vacancy_option'), 10)

WebUI.click(findTestObject('Recruitment Page/Vacancies/option_Payroll_Administrator'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/texbox_Email'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/texbox_Email_selected'), 'miguel@automation.com')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Contact_Number'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Contact_Number_selected'), '777888999')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Keywords'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Keywords_selected'), 'Awful, Comprehensive, Diligent')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Date _of_Application'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox_Date_of_Application_selected'), '2021-09-25')

WebUI.sendKeys(findTestObject('Recruitment Page/Vacancies/textbox__Notes'), 'Application notes-Edted')

WebUI.click(findTestObject('Recruitment Page/Vacancies/checkbox_Consent'))

WebUI.click(findTestObject('Recruitment Page/Vacancies/button_Save'))

WebUI.click(findTestObject('Recruitment Page/Vacancies/button_Yes, Confirm'))

WebUI.waitForElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullyUpdated'), 10)

WebUI.verifyElementPresent(findTestObject('Confirmation messages/message_SuccessSuccessfullyUpdated'), 10)

