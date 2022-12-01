#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login mobile saucedemo
  user want to be access login saucedemo mobile

  @loginsuccess
  Scenario: Login successfully
    Given User launch app
    When User verify login has been loaded
    And User input username mobile apk "standard_user"
    And User input password mobile apk "secret_sauce"
    And User click button login mobile apk
    Then User has been successfully login dashboard saucedemo mobile apk
