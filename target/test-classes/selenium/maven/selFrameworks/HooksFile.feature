@tag
Feature: User test the login functionality
  
  @tag1
  Scenario: User login facebook page
    Given User get the Url and Title
    When User enters name
    And User enters pass
    And User click login button
    Then User check navigation to correct url
