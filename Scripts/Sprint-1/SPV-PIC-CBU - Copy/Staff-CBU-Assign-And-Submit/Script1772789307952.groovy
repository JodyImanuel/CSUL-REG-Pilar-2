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

WebUI.callTestCase(findTestCase('Sprint-1/Login-CBU/Login-Staff-CBU'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'), 
    10)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_Dashboard/div_Monitoring  Review'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_Dashboard/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_Dashboard/a_Petty Cash'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG'), 
    10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9'), 
    '0', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/select_Pilih OpsiBaruDalam ProsesMenunggu P_427f57'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/button_Pemeriksaan'))

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 53,000.00_b3-b3-b6-l4_0-257_2-Inpu_e52861'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 53,000.00_b3-b3-b6-l4_0-257_2-b4-I_ee951e'), 
    '53000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 450,000.00_b3-b3-b6-l4_0-257_3-Inp_f9cef8'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 450,000.00_b3-b3-b6-l4_0-257_3-b4-_26d665'), 
    '250000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_1'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 2,000.00_b3-b3-b6-l4_0-257_4-Input_a620ba'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 2,000.00_b3-b3-b6-l4_0-257_4-b4-In_4c044b'), 
    '2000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_2'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 30,000.00_b3-b3-b6-l4_0-257_5-Inpu_592d01'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 30,000.00_b3-b3-b6-l4_0-257_5-b4-I_8ae26f'), 
    '30000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_3'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 150,000.00_b3-b3-b6-l4_0-257_6-Inp_7773c8'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Rp 150,000.00_b3-b3-b6-l4_0-257_6-b4-_bed132'), 
    '150000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiRendahSedangTinggi'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/textarea_Klaim Kas Kecil CBU - Transportasi_227de5'), 
    'not able')

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem1)

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Unggah_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_5'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_5'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_6'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_6'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Draft'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/div_OUTSTANDING PETTY CASH'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_7'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_7'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_8'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_8'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_9'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_9'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_10'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_10'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_11'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_11'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Draft'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Submit_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/select_Pilih OpsiBaruDalam ProsesMenunggu P_427f57'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assign-And-Submit/Page_PettyCash/button_Cari'))

WebUI.delay(5)

