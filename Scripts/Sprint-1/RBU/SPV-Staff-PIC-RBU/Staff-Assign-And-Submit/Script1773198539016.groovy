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

WebUI.verifyElementVisible(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCash/select_Pilih OpsiBaruDalam ProsesMenunggu P_427f57'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCash/button_Pemeriksaan'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/div_OUTSTANDING PETTY CASH'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Add'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Add'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Action_b3-b4-b8-l3_0-268_0-Deskripsi'), 
    'Meja')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Action_b3-b4-b8-l3_0-268_0-TanggalClaim'), 
    '18-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Action_b3-b4-b8-l3_0-268_0-b4-Input_Mask'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Action_b3-b4-b8-l3_0-268_0-Input_Tang_26adfb'), 
    '11-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Action_b3-b4-b8-l3_0-268_0-b5-Input_Mask'), 
    '100000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Lihat Dokumen_b3-b4-b8-l3_0-268_1-Deskripsi'), 
    'Kursi')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Lihat Dokumen_b3-b4-b8-l3_0-268_1-Tan_541c34'), 
    '18-03-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Lihat Dokumen_b3-b4-b8-l3_0-268_1-b4-_9c71a3'), 
    '150000')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Lihat Dokumen_b3-b4-b8-l3_0-268_1-Inp_5fb7d0'), 
    '11-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input_Lihat Dokumen_b3-b4-b8-l3_0-268_1-b5-_b43604'), 
    '150000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_1'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input__b3-b4-b8-b8-b22-Input_Mask'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Unggah'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Unggah_1'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/input__b3-b4-b8-b8-b24-Input_Mask'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Unggah_2'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Unggah_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih kategori temuanRendahSedangTinggi'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/textarea__b3-b4-b8-b8-TextArea_Catatan2'), 
    'Tinjau kembali')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiAdaTidak Ada_4'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/select_Pilih OpsiTepatTidak Tepat_4'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Draft'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/Staff-Assign-And-Submit/Page_PettyCashDetail/button_Submit'))

WebUI.delay(5)

