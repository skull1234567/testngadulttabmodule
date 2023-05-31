package com.test.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.test.base.BaseClass;



public class PageobjectManager extends BaseClass{
	
	public PageobjectManager(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	private searchadult gfm;
	


	
	public searchadult getgfm() {
		gfm = new searchadult(driver);
		return gfm;
	}

		
		
	}
	
	
	


