#Author: chaitanyakulkarni0509@gmail.com

@conversion
Feature: Testing the currency conversion logic for multiple currencies.
  During the process I would use the exchange rates captured during the ExtractExchangeRates.feature

	Background:
		Given I am on currency converter page.
		
  Scenario Outline: Test the currency conversions by selecting appropriate currency from the dropdown lists. 
  Indian rupee to British pound, Euro to Australian dollar, US dollar to Canadian dollar, Japanese Yen to Indian rupee, New Taiwan Dollar to Japanese Yen. 

    When I enter "<amount>" of money.
    And select from currency as "<sourceCurrency>"
    And select to currency as "<targetCurrency>"
    And click convert button
    Then appropriate amount in "<targetCurrency>" should be displayed. 

    Examples: 
    | amount   			| sourceCurrency		| targetCurrency  |
    | 5000			   	| INR       		    | GBP			  		  |
    | 3000			   	| EUR               | AUD					    |
    | 7000			   	| USD            		| CAD					    |
    | 11000			   	| JPY          			| INR					    |
    | 21000			   	| TWD				     		| JPY					    |
    
    