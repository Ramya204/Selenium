
@tag
Feature: User test the login functionality
  
  @tag1
  Scenario: User login facebook page
    Given User launches the facebook application
    When User enters username
    |aaaa|bbbb|
    And User enters password
    |cccc|dddd|
    |eeee|f|
    And User clicks login button
    Then User checks navigation to correct url
    And User closes browser
