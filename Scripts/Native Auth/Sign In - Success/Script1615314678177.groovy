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
//self imports

//Variables
String id = GlobalVariable.id
String email = 'renokian@gmail.com'
String password = 'Abc123!!'


Mobile.startExistingApplication(id)

//Tap Sign in button on landing page
Mobile.tap(findTestObject('Object Repository/Ride App iOS/Landing Page/XCUIElementTypeStaticText - SIGN IN'), 0, FailureHandling.STOP_ON_FAILURE)

//Set email address and password
Mobile.setText(findTestObject('Object Repository/Ride App iOS/Sign In Page/XCUIElementTypeTextField - Email Address field - on Sign In page'), email, 5, FailureHandling.STOP_ON_FAILURE)
Mobile.setText(findTestObject('Object Repository/Ride App iOS/Sign In Page/XCUIElementTypeSecureTextField - Password field - on Sign In page'), password, 5, FailureHandling.STOP_ON_FAILURE)

//Tap Sign in button on sign in page
Mobile.tap(findTestObject('Object Repository/Ride App iOS/Sign In Page/XCUIElementTypeButton - SIGN IN button - on Sign In page'), 0, FailureHandling.STOP_ON_FAILURE)



