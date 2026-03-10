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

WebUI.callTestCase(findTestCase('Sprint-1/Login-CBU/Login-SPV-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/SPV-Assign-PIC/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'), 
    10)

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Assign-PIC/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Assign-PIC/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Assign-PIC/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Assign-PIC/Page_Dashboard/a_Petty Cash'))

WebUI.setText(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/input__b3-b1-b1-StartDate'), 
    '10-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/input__b3-b1-b1-EndDate'), 
    '10-03-2026')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Tindak Lanjut_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashPersetujuan/select_Select a categorySelesaiSedang Berja_127797'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashPersetujuan/textarea__b3-l1-770_0-b2-TextArea_TindakLan_1d9cf7'), 
    'Done, data lanjut untuk di proses')

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashPersetujuan/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/div_OUTSTANDING PETTY CASH'))

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Tindak Lanjut_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashPersetujuan/select_Select a categorySelesaiSedang Berja_127797_1'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashPersetujuan/textarea__b3-l1-1101_0-b2-TextArea_TindakLa_deb2fa'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint1/SPV-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashPersetujuan/button_Submit_1'))

WebUI.delay(5)

