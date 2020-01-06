package com.transferwise.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumber.listener.Reporter;
import com.transferwise.cucumber.TestContext;
import com.transferwise.managers.FileReaderManager;
import com.transferwise.pageObjects.CurrencyConverterPage;
import com.transferwise.pageObjects.CurrencyExchangeRatePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrencyExchangeConversionSteps {
	TestContext testContext;
	CurrencyConverterPage currencyConverterPage;
	CurrencyExchangeRatePage currencyExchangeRatePage;
	
	public CurrencyExchangeConversionSteps(TestContext context) {
		testContext = context;
		currencyConverterPage = testContext.getPageObjectManager().getCurrencyConverterPage();
		currencyExchangeRatePage = testContext.getPageObjectManager().getCurrencyExchangeRatePage();
	}
	
	@And("^I click on browse all currencies tab\\.$")
	public void i_am_on_browse_all_currencies_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyExchangeRatePage.clickBrowseAllCurrencies();
	}
	
	@When("^I click on country initials link with name as \"([^\"]*)\"\\.$")
	public void i_click_on_country_initials_link_with_name_as(String fromCountryInitials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyExchangeRatePage.clickCountryInitialsLink(fromCountryInitials);
	}
	
	@Then("^I go to the appropriate section of countries asserted by \"([^\"]*)\"\\.$")
	public void i_go_to_the_appropriate_section_of_countries_asserted_by(String fromCountryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyExchangeRatePage.assertCountrySection(fromCountryName);
	}

	@When("^I click on country link with name as \"([^\"]*)\"\\.$")
	public void i_click_on_country_link_with_name_as(String fromCountryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyExchangeRatePage.clickCountryLink(fromCountryName);
	}

	@Then("^I go to \"([^\"]*)\" exchange rates page\\.$")
	public void i_go_to_exchange_rates_page(String fromCountryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyExchangeRatePage.assertCountryExchangeRatesPage(fromCountryName);
	}

	@Then("^I store \"([^\"]*)\" to \"([^\"]*)\" rate\\.$")
	public void i_store_to_rate(String fromCountryName, String toCountryName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyExchangeRatePage.storeExchangeRates(fromCountryName, toCountryName);
	}

	@Given("^I am on currency converter page\\.$")
	public void user_is_on_currency_converter_page() throws Throwable {
		testContext.getWebDriverManager().getDriver().get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	@When("^I enter \"([^\"]*)\" of money\\.$")
	public void i_enter_of_money(String amt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyConverterPage.enterAmount(amt);
	}

	@When("^select from currency as \"([^\"]*)\"$")
	public void select_from_currency_as(String sourceCurrency) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyConverterPage.selectSourceCurrency(sourceCurrency);
	}

	@When("^select to currency as \"([^\"]*)\"$")
	public void select_to_currency_as(String targetCurrency) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyConverterPage.selectTargetCurrency(targetCurrency);
	}
	
	@When("^click convert button$")
	public void click_convert_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyConverterPage.clickConvert();
	}

	@Then("^appropriate amount in \"([^\"]*)\" should be displayed\\.$")
	public void appropriate_amount_in_should_be_displayed(String targetCurrency) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		currencyConverterPage.getConvertedValue();
		currencyConverterPage.calculateConvertedValue(targetCurrency);
		currencyConverterPage.assertFinalConvertedValue();
	}
	
}
