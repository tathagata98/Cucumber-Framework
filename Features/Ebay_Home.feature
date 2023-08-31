Feature: Ebay home page Scenarios

  @P1 @Advance @Searchlink
  Scenario: Advance Search Link
    Given I am on ebay home page
    When I click on Advanced Link
    Then I navigate to the advanced search page

  @P2 
  Scenario: Search items count
    Given I am on ebay home page
    When I search for 'Iphone 11' on search bar
    Then I validate the count of search results is greater than 1000

  @P2
  Scenario: Search items count2
    Given I am on ebay home page
    When I search for 'Toy cars' on search bar
    Then I validate the count of search results is greater than 100

  @P24
  Scenario: Search items count3
    Given I am on ebay home page
    When I search for 'soap' on search bar from 'Baby' category

  @P300
  Scenario Outline: Homepage links
    Given I am on ebay home page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link            | url                                                   | title                     |
      | Fashion         | https://www.ebay.com/b/Fashion/bn_7000259856          | Fashion products for sale |
      | Sports          | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031  | false title		            |
      | Health & Beauty | https://www.flipkart.com/														  | Health & Beauty           |
