#Author: chaitanyakulkarni0509@gmail.com

@extraction
Feature: Capturing exchange rates for multiple currencies. 
  The stored exchange rates for multiple currencies would then be used for assertions later.

  Background:
  	Given I am on currency converter page.
  	And I click on browse all currencies tab.
  
  Scenario Outline: Capture exchange rates for Indian rupee to British pound, Euro to Australian dollar, 
  US dollar to Canadian dollar, Japanese Yen to Indian rupee, New Taiwan Dollar to Japanese Yen. 
  
  	When I click on country initials link with name as "<fromCountryInitials>".
  	Then I go to the appropriate section of countries asserted by "<fromCountryName>".
  	When I click on country link with name as "<fromCountryName>".
  	Then I go to "<fromCountryName>" exchange rates page.   
    And I store "<fromCountryName>" to "<toCountryName>" rate.
    
    Examples: 
      | fromCountryInitials   | fromCountryName       | toCountryName  |
      | I 										| Indian Rupee          | GBP					   |
      | E 										| Euro                  | AUD					   |
      | U 										| US Dollar             | CAD					   |
      | J 										| Japanese Yen          | INR					   |
      | T 										| New Taiwan Dollar     | JPY					   |
      