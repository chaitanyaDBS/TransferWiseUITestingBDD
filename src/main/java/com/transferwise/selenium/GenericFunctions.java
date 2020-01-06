package com.transferwise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunctions {
	
	protected static WebDriver driver;
	
	public static void Wait(String xpath, long time) {
		WebDriverWait w = new WebDriverWait(driver, time);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

}
