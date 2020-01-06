package com.transferwise.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.transferwise.managers.WebDriverManager;

public class CurrencyExchangeRatePage {

	WebDriverManager webDriverManager;
	public CurrencyExchangeRatePage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Browse all currencies')]") 
	public static WebElement lnkBrowseCurrencies;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(), 'Foreign Exchange Rates')]") 
	public WebElement lblForeignExchangeRates;
	
	@FindBy(how = How.LINK_TEXT, using = "Currency Converter") 
	public static WebElement lnkcurrencyConverter;
	
	@FindBy(how = How.LINK_TEXT, using = "I") 
	public WebElement lnkI;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'Indian Rupee')]") 
	public static WebElement lnkIndianRupee;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'INR exchange')]") 
	public static WebElement lblINRExchange;
	
	public static double gbprate;
	
	@FindBy(how = How.LINK_TEXT, using = "E") 
	public static WebElement lnkE;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'Euro')]") 
	public static WebElement lnkEuro;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'EUR exchange')]") 
	public static WebElement lblEURExchange;
	
	public static double audrate;
	
	@FindBy(how = How.LINK_TEXT, using = "U") 
	public static WebElement lnkU;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'US Dollar')]") 
	public static WebElement lnkUSDollar;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'USD exchange')]") 
	public static WebElement lblUSDExchange;
	
	public static double cadrate;
	
	@FindBy(how = How.LINK_TEXT, using = "J") 
	public static WebElement lnkJ;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'Japanese Yen')]") 
	public static WebElement lnkJapaneseYen;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'JPY exchange')]") 
	public static WebElement lblJPYExchange;
	
	public static double inrrate;
	
	@FindBy(how = How.LINK_TEXT, using = "T") 
	public static WebElement lnkT;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'New Taiwan Dollar')]") 
	public static WebElement lnkTaiwanDollar;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'TWD exchange')]") 
	public static WebElement lblTWDExchange;
	
	public static double jpyrate;
	
	@FindBy(how = How.XPATH, using = "//td/a[@href='/ie/currency-converter/inr-to-gbp-rate']") 
	public static WebElement valINRToGBP;
	
	@FindBy(how = How.XPATH, using = "//td/a[@href='/ie/currency-converter/eur-to-aud-rate']") 
	public static WebElement valEURToAUD;
	
	@FindBy(how = How.XPATH, using = "//td/a[@href='/ie/currency-converter/usd-to-cad-rate']") 
	public static WebElement valUSDToCAD;
	
	@FindBy(how = How.XPATH, using = "//td/a[@href='/ie/currency-converter/jpy-to-inr-rate']") 
	public static WebElement valJPYToINR;
	
	@FindBy(how = How.XPATH, using = "//td/a[@href='/ie/currency-converter/twd-to-jpy-rate']") 
	public static WebElement valNTDToJPY;
	
	
	
	
	
	public void clickBrowseAllCurrencies() throws InterruptedException {
		lnkBrowseCurrencies.click();
		Thread.sleep(1000);
		Assert.assertNotNull("Directed to incorrect page", lblForeignExchangeRates);
		 }
	
	public void clickCountryInitialsLink(String fromCountryInitials) throws InterruptedException {
		if(fromCountryInitials.equals("I"))
		{
			lnkI.click();
			Thread.sleep(2000);
		}
		if(fromCountryInitials.equals("E"))
		{
			lnkE.click();
			Thread.sleep(2000);
		}
		if(fromCountryInitials.equals("U"))
		{
			lnkU.click();
			Thread.sleep(2000);
		}
		if(fromCountryInitials.equals("J"))
		{
			lnkJ.click();
			Thread.sleep(2000);
		}
		if(fromCountryInitials.equals("T"))
		{
			lnkT.click();
			Thread.sleep(2000);
		}
				
	}
	
	public void assertCountrySection(String fromCountryName) throws InterruptedException {
		if(fromCountryName.equals("Indian Rupee"))
		{
			Assert.assertNotNull("Directed to incorrect section of countries", lnkIndianRupee);
		}
		if(fromCountryName.equals("Euro"))
		{
			Assert.assertNotNull("Directed to incorrect section of countries", lnkEuro);
		}
		if(fromCountryName.equals("US Dollar"))
		{
			Assert.assertNotNull("Directed to incorrect section of countries", lnkUSDollar);
		}
		if(fromCountryName.equals("Japanese Yen"))
		{
			Assert.assertNotNull("Directed to incorrect section of countries", lnkJapaneseYen);
		}
		if(fromCountryName.equals("New Taiwan Dollar"))
		{
			Assert.assertNotNull("Directed to incorrect section of countries", lnkTaiwanDollar);
		}
		
	}
	
	public void clickCountryLink(String fromCountryName) throws InterruptedException {
		if(fromCountryName.equals("Indian Rupee"))
		{
			lnkIndianRupee.click();
			Thread.sleep(2000);
		}
		if(fromCountryName.equals("Euro"))
		{
			lnkEuro.click();
			Thread.sleep(2000);
		}
		if(fromCountryName.equals("US Dollar"))
		{
			lnkUSDollar.click();
			Thread.sleep(2000);
		}
		if(fromCountryName.equals("Japanese Yen"))
		{
			lnkJapaneseYen.click();
			Thread.sleep(2000);
		}
		if(fromCountryName.equals("New Taiwan Dollar"))
		{
			lnkTaiwanDollar.click();
			Thread.sleep(2000);
		}
			
	 }
	
	public void assertCountryExchangeRatesPage(String fromCountryName) throws Throwable {
		if(fromCountryName.equals("Indian Rupee"))
		{
			Assert.assertNotNull("Directed to incorrect country exchange rates", lblINRExchange);
		}
		if(fromCountryName.equals("Euro"))
		{
			Assert.assertNotNull("Directed to incorrect country exchange rates", lblEURExchange);
		}
		if(fromCountryName.equals("US Dollar"))
		{
			Assert.assertNotNull("Directed to incorrect country exchange rates", lblUSDExchange);
		}
		if(fromCountryName.equals("Japanese Yen"))
		{
			Assert.assertNotNull("Directed to incorrect country exchange rates", lblJPYExchange);
		}
		if(fromCountryName.equals("New Taiwan Dollar"))
		{
			Assert.assertNotNull("Directed to incorrect country exchange rates", lblTWDExchange);
		}
	}
	
	public void storeExchangeRates(String fromCountryName, String toCountryName) throws InterruptedException {
		if(fromCountryName.equals("Indian Rupee") && toCountryName.equals("GBP"))
		{
			String gbpRateAsString = valINRToGBP.getText(); 
			gbprate = Double.parseDouble(gbpRateAsString);
			/*try
			{
			webDriverManager = new WebDriverManager();
			String sColValue = "GBP";
			 for (int i=2;i<=8;i++)
			 {
			 String sValue = null;
			 sValue = webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[1]/th["+i+"]/a/span[2]")).getText();
			 if(sValue.equalsIgnoreCase(sColValue)){ 
			 String sRowValue= webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[2]/th["+i+"]/a/span[2]")).getText();
			 System.out.println("INR to GBP: "+sRowValue);
			 }
			 break;
			 }
			}
			catch(Exception e)
			{
				
			}*/
		}
		if(fromCountryName.equals("Euro") && toCountryName.equals("AUD"))
		{
			String audRateAsString = valEURToAUD.getText(); 
			audrate = Double.parseDouble(audRateAsString);
			/*try
			{
			webDriverManager = new WebDriverManager();
			String sColValue = "AUD";
			 for (int i=2;i<=8;i++)
			 {
			 String sValue = null;
			 sValue = webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[1]/th["+i+"]/a/span[2]")).getText();
			 if(sValue.equalsIgnoreCase(sColValue)){ 
			 String sRowValue= webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[2]/th["+i+"]/a/span[2]")).getText();
			 }
			 break;
			 }
			}
			catch(Exception e)
			{
				
			}*/
		}
		if(fromCountryName.equals("US Dollar") && toCountryName.equals("CAD"))
		{
			String cadRateAsString = valUSDToCAD.getText(); 
			cadrate = Double.parseDouble(cadRateAsString);
			/*try
			{
			webDriverManager = new WebDriverManager();
			String sColValue = "CAD";
			 for (int i=2;i<=8;i++)
			 {
			 String sValue = null;
			 sValue = webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[1]/th["+i+"]/a/span[2]")).getText();
			 if(sValue.equalsIgnoreCase(sColValue)){ 
			 String sRowValue= webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[2]/th["+i+"]/a/span[2]")).getText();
			 }
			 break;
			 }
			}
			catch(Exception e)
			{
				
			}*/
		}
		if(fromCountryName.equals("Japanese Yen") && toCountryName.equals("INR"))
		{
			String inrRateAsString = valJPYToINR.getText(); 
			inrrate = Double.parseDouble(inrRateAsString);
			/*try
			{
			webDriverManager = new WebDriverManager();
			String sColValue = "INR";
			 for (int i=2;i<=8;i++)
			 {
			 String sValue = null;
			 sValue = webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[1]/th["+i+"]/a/span[2]")).getText();
			 if(sValue.equalsIgnoreCase(sColValue)){ 
			 String sRowValue= webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[2]/th["+i+"]/a/span[2]")).getText();
			 
			 }
			 break;
			 }
			}
			catch(Exception e)
			{
				
			}*/
		}
		if(fromCountryName.equals("New Taiwan Dollar") && toCountryName.equals("JPY"))
		{
			String jpyRateAsString = valNTDToJPY.getText(); 
			jpyrate = Double.parseDouble(jpyRateAsString);
			/*try
			{
			webDriverManager = new WebDriverManager();
			String sColValue = "JPY";
			 for (int i=2;i<=8;i++)
			 {
			 String sValue = null;
			 sValue = webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[1]/th["+i+"]/a/span[2]")).getText();
			 if(sValue.equalsIgnoreCase(sColValue)){ 
			 String sRowValue= webDriverManager.getDriver().findElement(By.xpath("//table[@class='table table-condensed']/thead/tr[2]/th["+i+"]/a/span[2]")).getText();
			 
			 }
			 break;
			 }
			}
			catch(Exception e)
			{
				
			}*/
		}
				
	}

 }
