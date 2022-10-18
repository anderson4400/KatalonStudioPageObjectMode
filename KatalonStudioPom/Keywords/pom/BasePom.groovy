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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class BasePom {


	public void vicity(String url) {
		if(url!= null && url.length() > 0) {
			WebUI.openBrowser(url)
			WebUI.maximizeWindow()
		}else {
			System.out.println("Favor suministrar una URL");
		}
	}

	public void type(String valor, TestObject obj ) {
		if(valor!= null && valor.length() > 0) {
			if(obj != null) {
				WebUI.setText(obj, valor)
			}else {
				System.out.println("Favor suministrar un objecto");
			}
		}else {
			System.out.println("Favor suministrar un valor");
		}
	}

	public void  hacerClic(TestObject obj) {
		if(obj != null) {
			WebUI.click(obj)
		}else {
			System.out.println("Favor suministrar un objecto");
		}
	}

	public boolean EsperarElemento(TestObject obj) {
		if(obj != null) {
			WebUI.waitForElementPresent(obj,GlobalVariable.tiempo )
			return true;
		}else {
			System.out.println("Favor suministrar un objecto");
			return false;
		}
	}

	public void selecionarValor(TestObject obj, String valor) {
		if(obj != null) {
			WebUI.selectOptionByValue(obj, valor, false)
		}else {
			System.out.println("Favor suministrar un objecto");
		}
	}

	public void hacerHOver(TestObject obj) {
		if(obj != null) {
			WebUI.mouseOver(obj)
		}else {
			System.out.println("Favor suministrar un objecto");
		}
	}

	def public CrearObjecto(String xpaht) {
		if(xpaht != null && xpaht.length() >0) {
			TestObject obj = new TestObject().addProperty("xpath",ConditionType.EQUALS, xpaht)
			return obj;
		}else {
			System.out.println("Favor suministrar un valor");
		}
	}

	public void cerrarNavegador() {
		WebUI.closeBrowser()
	}
}
