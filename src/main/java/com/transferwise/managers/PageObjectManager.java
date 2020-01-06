package com.transferwise.managers;

import org.openqa.selenium.WebDriver;

import com.transferwise.pageObjects.CurrencyConverterPage;
import com.transferwise.pageObjects.CurrencyExchangeRatePage;

public class PageObjectManager {
	private WebDriver driver;
	private CurrencyConverterPage currencyConverterPage;
	private CurrencyExchangeRatePage currencyExchangeRatePage;
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	public CurrencyConverterPage getCurrencyConverterPage(){

		return (currencyConverterPage == null) ? currencyConverterPage = new CurrencyConverterPage(driver) : currencyConverterPage;

	}
	
	public CurrencyExchangeRatePage getCurrencyExchangeRatePage(){

		return (currencyExchangeRatePage == null) ? currencyExchangeRatePage = new CurrencyExchangeRatePage(driver) : currencyExchangeRatePage;

	}

}
