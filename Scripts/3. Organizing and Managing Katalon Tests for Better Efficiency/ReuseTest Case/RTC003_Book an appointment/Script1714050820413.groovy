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

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Health Care Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    heathcareCenter, true)

WebUI.click(findTestObject('Object Repository/OR Health Care Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/OR Health Care Service/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/OR Health Care Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/OR Health Care Service/td_10'))

WebUI.setText(findTestObject('Object Repository/OR Health Care Service/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('Object Repository/OR Health Care Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Health Care Service/h2_Appointment Confirmation'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/OR Health Care Service/p_Hongkong CURA Healthcare Center'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/OR Health Care Service/p_Medicaid'), 'Medicaid')

WebUI.verifyElementText(findTestObject('Object Repository/OR Health Care Service/p_Test Katalon'), 'Test comment')

