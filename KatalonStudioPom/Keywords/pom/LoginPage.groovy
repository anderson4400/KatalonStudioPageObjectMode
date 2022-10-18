package pom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginPage extends BasePom{

	String imgPaga = "//img[@alt='Logo Pegasystem']"
	String campoUseName = "//input[@id='user_name']"
	String campopassword = "//input[@id='user_pass']"
	String BtnSingIn = "//input[@id='login_button']"


	@Keyword
	public realizarLogin() {
		if(EsperarElemento(CrearObjecto(imgPaga))) {
			type("dasdasdasd", CrearObjecto(campoUseName))
			type("dasdasdasd", CrearObjecto(campopassword))
			hacerClic(CrearObjecto(BtnSingIn))
		}else {
			System.out.println("El elemento no esta disponible")
		}
	}
}
