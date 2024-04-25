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

CustomKeywords.'example.MyKeywords.AppLogin'()

for (def n : (0..2)) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
        'Hongkong CURA Healthcare Center', true)

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Medicare'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Medicaid_programs'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/input_None_programs'))

        WebUI.delay(1)
    }
    
    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_28'))

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'No comments')

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/appointment.php#summary')

    WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
        'Appointment Confirmation')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

    CustomKeywords.'example.MyKeywords.Congrats'('Khoa')
}

WebUI.closeBrowser()

