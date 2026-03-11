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

WebUI.callTestCase(findTestCase('Sprint-1/RBU/Login-RBU/Login-SPV-RBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_Dashboard/div_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_Dashboard/a_Petty Cash'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG'), 
    10)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/input_Tanggal Claim_b3-b2-b4-StartDate'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/input_Tanggal Claim_b3-b2-b4-EndDate'), 
    '18-03-2022')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/button_Tambah_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c_1'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/select_Select StatusBaruPenugasanDalam Pros_c89740'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Create-Task/Page_PettyCash/button_Cari'))

WebUI.delay(5)

