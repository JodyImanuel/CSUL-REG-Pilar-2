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

WebUI.waitForElementVisible(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCash/span_PEMERIKSAAN PETTY CASH KANTOR CABANG'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCash/select_Pilih OpsiSEMARANGSURABAYAJAKARTA GR_05f5b9'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCash/select_Pilih OpsiBaruDalam ProsesMenunggu P_427f57'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCash/button_Pemeriksaan'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Lihat Dokumen'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Tutup'))

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Rp 7,500.00_b3-b3-b6-l4_0-536_0-Input_4bf8bd'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Rp 7,500.00_b3-b3-b6-l4_0-536_0-b4-In_bb4b9a'), 
    '7500')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Rp 2,000.00_b3-b3-b6-l4_0-254_1-Input_506b82'), 
    '24-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Rp 2,000.00_b3-b3-b6-l4_0-254_1-b4-In_b1876f'), 
    '2000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Draft'))

WebUI.delay(10)

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_OUTSTANDING PETTY CASH'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Add'))

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Add'))

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Action_b3-b3-b8-l3_0-198_0-Deskripsi'), 
    'Meja')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Action_b3-b3-b8-l3_0-205_0-TanggalClaim'), 
    '26-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Action_b3-b3-b8-l3_0-198_0-b4-Input_Mask'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Action_b3-b3-b8-l3_0-198_0-Input_Tang_a3d538'), 
    '26-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Action_b3-b3-b8-l3_0-198_0-b5-Input_Mask'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_2'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Lihat Dokumen_b3-b3-b8-l3_0-198_1-Deskripsi'), 
    'Kursi')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Lihat Dokumen_b3-b3-b8-l3_0-198_1-Tan_91eb6f'), 
    '26-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Lihat Dokumen_b3-b3-b8-l3_0-198_1-b4-_06f58d'), 
    '5000')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Lihat Dokumen_b3-b3-b8-l3_0-198_1-Inp_595912'), 
    '26-02-2022')

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input_Lihat Dokumen_b3-b3-b8-l3_0-198_1-b5-_447ccf'), 
    '5000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/select_Pilih OpsiSesuaiTidak Sesuai_3'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input__b3-b3-b8-b8-b22-Input_Mask'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Unggah_4'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce_2'), 
    Lorem1)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Unggah_3'))

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/input__b3-b3-b8-b8-b24-Input_Mask'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Unggah_5'))

WebUI.uploadFile(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/div_Drag  drop files orBrowseSupported form_a30bce_2'), 
    Lorem2)

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Unggah_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/select_Pilih kategori temuanRendahSedangTinggi'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/textarea__b3-b3-b8-b8-TextArea_Catatan2'), 
    'Tinjau kembali')

WebUI.click(findTestObject('Object Repository/Sprint1/Staff-Assing-And-Draft/Page_PettyCashDetail/button_Draft_1'))

WebUI.delay(5)

