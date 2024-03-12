
@tag
Feature: Login feature
  

  @smoke
  Scenario: Validating login page
    Given user opens chrome and enters url
    When user enters username
    And user enters password
    And user clicks on login
    Then Welcome back message is displayed

 