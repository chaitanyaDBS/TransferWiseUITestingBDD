package com.transferwise.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.transferwise.cucumber.TestContext;


public class CurrencyConverterPage {
	
	public CurrencyConverterPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.ID, using = "cc-amount") 
	private WebElement txtAmount;
	
	@FindBy(how = How.ID, using = "sourceCurrency") 
	private WebElement ddlSrcCurrency;
	
	@FindBy(how = How.ID, using = "targetCurrency") 
	private WebElement ddlTrgtCurrency;
	
	@FindBy(how = How.ID, using = "targetCurrency") 
	private WebElement element;
	
	@FindBy(how = How.ID, using = "convert")
	private WebElement btnConvert;
	
	@FindBy(how = How.ID, using = "cc-amount-to")
	public WebElement valConvertedAmount;
	
	public String convertedAmountViaPortal = null;
	
	public double convertedAmountViaPortalDoubleValue;
	
	public double convertedAmountViaCalculation;
	
	public double amountForCalculation;
	
	String convertedAmountViaPortalIntegerPart;
	
	String convertedAmountViaCalculationIntegerPart;
	
	public void enterAmount(String amt) {
		amountForCalculation = Double.valueOf(amt);
		System.out.println("amountForCalculation: "+amountForCalculation);
		txtAmount.clear();
		txtAmount.sendKeys(amt);
		 }
	
	public void selectSourceCurrency(String value) throws InterruptedException {
		//Thread.sleep(2000);
		//testContext.getWebDriverManager().getDriver().ExecuteScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }", element, "2017");
		//Actions action = new Actions(testContext.getWebDriverManager().getDriver());
		//action.moveToElement(ddlSrcCurrency).click().perform();
		Select srcCurrency = new Select(ddlSrcCurrency);
		srcCurrency.selectByValue(value);               
		 }
	
	public void selectTargetCurrency(String value) {
		Select trgtCurrency = new Select(ddlTrgtCurrency);
		trgtCurrency.selectByValue(value);
		 }
	
	public void clickConvert() throws InterruptedException {
		btnConvert.click();
		Thread.sleep(1000);
		 }
	
	public void getConvertedValue() throws InterruptedException {
		convertedAmountViaPortal = valConvertedAmount.getAttribute("value");
		convertedAmountViaPortalDoubleValue = Double.valueOf(convertedAmountViaPortal);
		String convertedAmountViaPortalDoubleValueAsString = String.valueOf(convertedAmountViaPortalDoubleValue);
		int indexOfDecimal = convertedAmountViaPortalDoubleValueAsString.indexOf(".");
		convertedAmountViaPortalIntegerPart = convertedAmountViaPortalDoubleValueAsString.substring(0, indexOfDecimal);
	}
	
	public void calculateConvertedValue(String targetCurrency) throws InterruptedException {
		if(targetCurrency.equals("GBP"))
		{
			convertedAmountViaCalculation = CurrencyExchangeRatePage.gbprate * amountForCalculation; 
			String convertedAmountViaCalculationAsString = String.valueOf(convertedAmountViaCalculation);
			int indexOfDecimal = convertedAmountViaCalculationAsString.indexOf(".");
			convertedAmountViaCalculationIntegerPart = convertedAmountViaCalculationAsString.substring(0, indexOfDecimal);
		}
		if(targetCurrency.equals("AUD"))
		{
			convertedAmountViaCalculation = CurrencyExchangeRatePage.audrate * amountForCalculation; 
			String convertedAmountViaCalculationAsString = String.valueOf(convertedAmountViaCalculation);
			int indexOfDecimal = convertedAmountViaCalculationAsString.indexOf(".");
			convertedAmountViaCalculationIntegerPart = convertedAmountViaCalculationAsString.substring(0, indexOfDecimal);
		}
		if(targetCurrency.equals("CAD"))
		{
			convertedAmountViaCalculation = CurrencyExchangeRatePage.cadrate * amountForCalculation; 
			String convertedAmountViaCalculationAsString = String.valueOf(convertedAmountViaCalculation);
			int indexOfDecimal = convertedAmountViaCalculationAsString.indexOf(".");
			convertedAmountViaCalculationIntegerPart = convertedAmountViaCalculationAsString.substring(0, indexOfDecimal);
		}
		if(targetCurrency.equals("INR"))
		{
			convertedAmountViaCalculation = CurrencyExchangeRatePage.inrrate * amountForCalculation; 
			String convertedAmountViaCalculationAsString = String.valueOf(convertedAmountViaCalculation);
			int indexOfDecimal = convertedAmountViaCalculationAsString.indexOf(".");
			convertedAmountViaCalculationIntegerPart = convertedAmountViaCalculationAsString.substring(0, indexOfDecimal);
		}
		if(targetCurrency.equals("JPY"))
		{
			convertedAmountViaCalculation = CurrencyExchangeRatePage.jpyrate * amountForCalculation; 
			String convertedAmountViaCalculationAsString = String.valueOf(convertedAmountViaCalculation);
			int indexOfDecimal = convertedAmountViaCalculationAsString.indexOf(".");
			convertedAmountViaCalculationIntegerPart = convertedAmountViaCalculationAsString.substring(0, indexOfDecimal);
		}
		
	}
	
	public void assertFinalConvertedValue() throws InterruptedException {
		
		Assert.assertEquals(convertedAmountViaPortalIntegerPart,convertedAmountViaCalculationIntegerPart);
		
	}
	
}
