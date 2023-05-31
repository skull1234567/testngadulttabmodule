package com.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.base.BaseClass;

public class searchadult extends BaseClass {
	  WebDriver driver;
		
		public searchadult(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "(//span[@class='sc-12foipm-17 fZDXDJ fswWidgetLabel'])[5]")
		private WebElement adulttab;
		
		
		@FindBy(xpath ="//span[@role='presentation']")
		private WebElement wrongbutton;
		
		@FindBy(xpath ="(//span[@class='sc-12foipm-63 ePVCFi'])[2]")
		private WebElement plusbutton;
		
		@FindBy(xpath = "//a[text()='Done']")
		private WebElement doneb;
			

		public WebElement getDoneb() {
			return doneb;
		}


		public WebElement getPlusbutton() {
			return plusbutton;
		}


		public WebElement getAdulttab() {
			return adulttab;
		}


		public WebElement getWrongbutton() {
			return wrongbutton;
		}
	
}
