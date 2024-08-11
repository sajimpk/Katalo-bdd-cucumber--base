package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class str {
 /**
* The step definitions below match with Katalon sample Gherkin steps
*/
@Given("User natives to login page")
def I_want_to_write_a_step_with_name() {
	 WebUI.openBrowser('')
     WebUI.navigateToUrl('https://www.bikroy.com')
	 WebUI.maximizeWindow()
	 WebUI.delay(2)
	 WebUI.click(findTestObject('Object Repository/login/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/a_Login'))
	 WebUI.delay(2)
}

@When("click email to login")
def I_check_for_the_value_in_step() {
	 WebUI.click(findTestObject('Object Repository/login/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/button_Continue with Email'))
	 WebUI.delay(2)
}

@Then("user enterd (.*) and (.*)")
def I_verify_the_status_in_step(String user, String pass) {
	 WebUI.setText(findTestObject('Object Repository/login/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/input_View and manage your ads at your convenience_email'),user)
	 WebUI.delay(2)
	 WebUI.setText(findTestObject('Object Repository/login/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/input_You must fill out this field_password'),pass)
	 WebUI.delay(2)
}
@When("Click on Login Button")
def I_click_on_Login() {
	 WebUI.click(findTestObject('Object Repository/login/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/div_Login'))
	 WebUI.delay(5)
}
 
}