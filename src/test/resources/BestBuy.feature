Feature: BestBuy Web Automation Tests
  Background:
    Given I open BestBuy homepage
    And I close first opening popup

  Scenario: search result test
    And I maximize window
    When I check homepage meta title
    When I search for "drone" on search-box
    Then I check search results have been listed
