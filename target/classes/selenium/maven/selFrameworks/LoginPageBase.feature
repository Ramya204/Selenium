
@tag
Feature: User test the login functionality using BaseClass method
  
  @tag1
  Scenario: User login facebook page with BaseClass method
    Given User launches the facebook application from BaseClass method
    When User enters username from BaseClass method
    And User enters password from BaseClass method
    And User clicks login button from BaseClass method
    Then User checks navigation of URL
    And User closes browser from BaseClass method
