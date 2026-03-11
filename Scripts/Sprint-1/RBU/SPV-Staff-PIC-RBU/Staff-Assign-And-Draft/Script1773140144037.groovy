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

WebUI.callTestCase(findTestCase('Sprint-1/RBU/Login-RBU/Login-Staff-RBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_Dashboard/div_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_Dashboard/a_Petty Cash'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCash/select_Pilih OpsiBaruDalam ProsesMenunggu P_427f57'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCash/button_Pemeriksaan'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 65,000.00_b3-b4-b6-l4_0-352_0-Inpu_9ea4a2'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 65,000.00_b3-b4-b6-l4_0-352_0-b4-I_7e4a44'), 
    '65000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 633,600.00_b3-b4-b6-l4_0-352_1-Inp_428848'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 633,600.00_b3-b4-b6-l4_0-352_1-b4-_f772d3'), 
    '280000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_1'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 837,500.00_b3-b4-b6-l4_0-352_2-Inp_a83d72'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 837,500.00_b3-b4-b6-l4_0-352_2-b4-_140175'), 
    '270000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_2'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 1,050,000.00_b3-b4-b6-l4_0-705_3-I_fe66be'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 1,050,000.00_b3-b4-b6-l4_0-705_3-b_69da73'), 
    '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_3'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 53,000.00_b3-b4-b6-l4_0-705_4-Inpu_486eda'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 53,000.00_b3-b4-b6-l4_0-705_4-b4-I_7216bf'), 
    '53000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_4'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 415,000.00_b3-b4-b6-l4_0-705_5-Inp_0bbf5e'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 415,000.00_b3-b4-b6-l4_0-705_5-b4-_142863'), 
    '200000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_5'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 100,000.00_b3-b4-b6-l4_0-705_6-Inp_9fa0b5'), 
    '16-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/input_Rp 100,000.00_b3-b4-b6-l4_0-705_6-b4-_a87cb7'), 
    '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_6'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiRendahSedangTinggi'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/textarea_Klaim Kas Kecil RBU - Perjalanan D_b9b883'), 
    'not able')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem1)

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/button_Unggah_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_4'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Draft/Page_PettyCashDetail/button_Draft'))

WebUI.delay(10)

