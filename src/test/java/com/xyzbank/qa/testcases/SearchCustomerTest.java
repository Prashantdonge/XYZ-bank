package com.xyzbank.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyzbank.qa.base.TestBase;
import com.xyzbank.qa.pages.BankManagerLoginPage;
import com.xyzbank.qa.pages.CustomerslistPage;
import com.xyzbank.qa.pages.Homepage;

public class SearchCustomerTest extends TestBase {

	Homepage hp;
	BankManagerLoginPage bmlp;
	CustomerslistPage clp;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		hp = new Homepage();
		bmlp = new BankManagerLoginPage();
		clp = new CustomerslistPage();
	}

	@Test
	public void verifySearch() throws Exception {
		String searchingName = "Jassy";
		bmlp = hp.managerLoginBtn();
		clp = bmlp.clickCustomersTab();
		clp.search(searchingName);
		String name = clp.getSearchedName();
		Assert.assertEquals(searchingName, name, "name not found....");
		System.out.println(name + " " + searchingName);
		
		
		
	}
}
