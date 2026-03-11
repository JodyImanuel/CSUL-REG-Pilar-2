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

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_Dashboard/div_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_Dashboard/a_Petty Cash'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCash/input__b3-b2-b1-StartDate'), 
    '11-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCash/input__b3-b2-b1-EndDate'), 
    '11-03-2026')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCash/select_Pilih OpsiBANDUNG ABU 1SURABAYA ABU _aaf35c'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCash/select_Pilih OpsiBaruDalam ProsesMenunggu P_e2cc7a'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCash/button_Tindak Lanjut'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Tindak Lanjut_b3-b3-b6-l2_0-775_0-IsS_240854'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Kirim Tindak Lanjut'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Nama Karyawan_b3-b3-b9-b2-NamaKaryawan'), 
    'Fatimah AZ')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Jabatan Karyawan_b3-b3-b9-b2-NamaKaryawan2'), 
    'IT Business Partner')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Tambah_b3-b3-b9-l1_0-903_0-IsPICUtama'))

WebUI.executeJavaScript('document.body.style.transform=\'scale(0.9)\'; document.body.style.transformOrigin=\'0 0\';', null)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Kirim Tindak Lanjut_1'))

WebUI.executeJavaScript('document.body.style.transform=\'none\'; document.body.style.transformOrigin=\'initial\';', null)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Kirim Tindak Lanjut_2'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/span_OUTSTANDING PETTY CASH'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Rp 0.00_b3-b3-b8-b3-Selected'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Kirim Tindak Lanjut'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Nama Karyawan_b3-b3-b9-b2-NamaKaryawan'), 
    'Fatimah AZ')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Jabatan Karyawan_b3-b3-b9-b2-NamaKaryawan2'), 
    'IT Business Partner')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/input_Tambah_b3-b3-b9-l1_0-903_0-IsPICUtama'))

WebUI.executeJavaScript('document.body.style.transform=\'scale(0.9)\'; document.body.style.transformOrigin=\'0 0\';', null)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Kirim Tindak Lanjut_1'))

WebUI.executeJavaScript('document.body.style.transform=\'none\'; document.body.style.transformOrigin=\'initial\';', null)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Assign-PIC/Page_TindakLanjutPettyCashDetail/button_Kirim Tindak Lanjut_2'))

WebUI.delay(5)

