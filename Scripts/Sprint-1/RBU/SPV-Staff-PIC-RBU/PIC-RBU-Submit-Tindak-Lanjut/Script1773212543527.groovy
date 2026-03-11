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

WebUI.callTestCase(findTestCase('Sprint-1/RBU/Login-RBU/Login-PIC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_Dashboard/a_Petty Cash'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/select_Pilih OpsiCorporate Business UnitRet_46a7ca'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/button_Tindak Lanjut'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/input_BARU_b3-b1-b6-l4_0-213_0-TenggatWaktu_680c36'), 
    '28-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/textarea_BARU_b3-b1-b6-l4_0-213_0-TextArea__32085d'), 
    'Dokumen sudah lengkap ya')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem1)

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Unggah_1'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/div_OUTSTANDING PETTY CASH'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/input__b3-b1-b8-b4-Input_TenggatWaktuPenyelesaian'), 
    '28-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/textarea__b3-b1-b8-b4-TextArea_TindakLanjut'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Unggah_2'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce_1'), 
    Lorem1)

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce_1'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Unggah_1'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCashDetail/button_Back'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/select_Pilih OpsiCorporate Business UnitRet_46a7ca'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/RBU-PIC-Submit-Tindak-Lanjut/Page_TindakLanjutPettyCash/button_Cari'))

WebUI.delay(5)

