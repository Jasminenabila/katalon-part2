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
@login @smoketest @regresi
Feature: Login saucelabs
  user want to login in website saucedemo

  @LGN001
  Scenario: user want to login with valid credentials
    Given Open Website and redirect to saucedemo
    When User enter username "standard_user"
    And User enter password "secret_sauce"
    And Click button Login
    Then User verify success to dashboard home

  @LGN002
  Scenario: user not input username and password
    Given Open Website and redirect to saucedemo
    When User enter username ""
    And User enter password ""
    And Click button Login
    Then User verify failed message error "Epic sadface: Username is required"
