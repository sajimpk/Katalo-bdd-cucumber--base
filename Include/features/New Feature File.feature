@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: open bikroi site
    Given User natives to login page
    When click email to login
    Then user enterd <user> and <pass>
    And Click on Login Button
    
    Examples:
    | user | pass |
    | fuzzyaidan@fthcapital.com | fuzzyaidan@	|
