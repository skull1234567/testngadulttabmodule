package com.testrunner;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.test.base.BaseClass;
import com.test.pom.PageobjectManager;

public class Testrunner extends BaseClass {
	PageobjectManager pom = new PageobjectManager(driver);
	
		
	@Test(priority = -3)
	public void browsernamelaunch() {
		browserlaunch("chrome");
	}
	@Test(priority = -2)
	public void urllaunch() {
		urlLaunch("https://www.goibibo.com/");
		clickonelement(pom.getgfm().getWrongbutton());
	}
	
	
	
	@Test(priority =2)
	public void adulttab() throws InterruptedException {
		if(pom.getgfm().getAdulttab().isDisplayed()) {
		clickonelement(pom.getgfm().getAdulttab());
		Thread.sleep(2000);
		}
	}
	@Test(priority=3 )
	public void plusbutton() {
		for(int i=1;i<=3;i++) {
		Mouseactionclick(pom.getgfm().getPlusbutton());
		}
	}
	@Test(priority =4)
	public void donebutton() throws InterruptedException {
		if(pom.getgfm().getDoneb().isDisplayed()) {
		clickonelement(pom.getgfm().getDoneb());
		Thread.sleep(4000);
		}
	}
	

	
	
	
	
	

}
