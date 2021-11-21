Feature: BestBuy Web Automation Tests
  Background:
    Given I open BestBuy homepage
    And I close first opening popup

  Scenario: Search Result Test
    And I maximize window
    When I check homepage meta title
    When I search for "drone" on search-box
    Then I check search results have been listed

  Scenario: Login with Email and Password
    When I open "Account" dropdown
    And I choose "Account" submenu
    When I check Sign In Page title is "Sign In to Best Buy"
    When I fill Sign In form with "<Email>" and "<Password>"
    When I check if the login was successful

