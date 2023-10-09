package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.SubmitForm;

public class SubmitFormTest extends TestBase{
SubmitForm submitform;
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@Test
	public void Submit() {
		submitform.submitForm(prop.getProperty("userName"), prop.getProperty("Password"),prop.getProperty("entercomments"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
