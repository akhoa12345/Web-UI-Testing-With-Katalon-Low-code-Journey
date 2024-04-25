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

WebUI.callTestCase(findTestCase('5. Increasing Test Reusability for Better Productivity and Reduced Maintenance/Katalon Ecommerce/Add to cart'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.navigateToUrl('https://cms.demo.katalon.com/checkout/')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_first_name'))

WebUI.doubleClick(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_first_name'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    'customer')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_last_name'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    'Customer')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 
    'DXC')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_address_1'))

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/div_Skip to content                        _c496f9'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_address_1'), 
    'Ki tuc xa khu B')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_city'), 'Ho Chi Minh City')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_state'), 'Thu Duc')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_postcode'), 
    '50500')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_phone'), '0359912894')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/div_Have a coupon Click here to enter your _f97527'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_phone'), '0324568452')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_email'), 'katalon@gmail.com')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/div_Skip to content                        _c496f9_1'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_email'), 'phunganhkhoa123@gmail.com')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.verifyElementText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

WebUI.closeBrowser()

