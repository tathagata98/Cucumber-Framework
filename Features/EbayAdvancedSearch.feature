Feature: Ebay Advanced Search Page

  @P2
  Scenario: Ebay logo on Advanced Search page
    Given I am on Ebay Advanced Search page
    When I click on Ebay logo
    Then I am navigated to Ebay Home Page

  @P240
  Scenario: Doing an advanced Search
    Given I am on Ebay Advanced Search page
    When I do an advanced search
      | keyword   | exclude     | min | max |
      | Iphone 11 | refurbished | 300 | 500 |
