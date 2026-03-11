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

WebUI.doubleClick(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_ApplicationsCatalog/div_Risk Control Unit ApplicationRCU Apps c_31ac98'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PettyCash/div_Persetujuan'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PettyCash/div_Operasional Cabang'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PettyCash/a_Petty Cash'))

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCash/input__b3-b2-b1-StartDate'), 
    '11-03-2026')

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCash/input__b3-b2-b1-EndDate'), 
    '11-03-2026')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCash/select_Select BranchSAMPIT RBUBATAM RBUPONT_2152ea'), 
    '11', true)

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCash/button_Cari'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCash/button_Persetujuan'))

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCashDetail/div_OUTSTANDING PETTY CASH'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCashDetail/select_Pilih OpsiDisetujuiDikembalikan'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCashDetail/textarea_Catatan_b3-b2-b8-b10-TextArea_Catatan'), 
    'Done')

WebUI.click(findTestObject('Object Repository/Sprint1/RBU/SPV-Persetujuan/Page_PersetujuanPettyCashDetail/button_Submit'))

WebUI.delay(5)

