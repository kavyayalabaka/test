package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
//Re-usable fun
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	public void addEmp() {
		System.out.println("Adding new emp");
		Log.info("Adding new emp");
	}
	public void delEmp() {
		System.out.println("delete emp");
		Log.info("delete emp");
	}
}
