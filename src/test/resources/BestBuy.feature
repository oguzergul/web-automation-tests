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

  Scenario: Login with Google Account
    When I open "Account" dropdown
    And I choose "Account" submenu
    When I check Sign In Page title is "Sign In to Best Buy"
    When I click on Google Sign In Button
    And I redirect to Google Sign In Page
    And I fill the email input with "<Email>" and next
    And I fill the password input with "<Password>" and next

    Scenario: Save Items to List
      When I open Menu Dropdown
      And I choose "Audio" option from list
      And I choose "Headphones" option from list
      And I choose "Wireless Headphones" category option from list





