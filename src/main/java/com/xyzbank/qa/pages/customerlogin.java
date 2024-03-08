package com.xyzbank.qa.pages;


	


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.xyzbank.qa.base.TestBase;


	public class customerlogin  extends TestBase{
		
		
		

		@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[1]/button")
		WebElement loginButton;

		
		
		
		
		//Initializing the Page Objects:
		public customerlogin(){
			PageFactory.initElements(driver, this);
		}
		
		
		
	  // public HomePage login(){
		   
			
		//loginButton.click();
			    	
			//return new HomePage();
		}
		
	



