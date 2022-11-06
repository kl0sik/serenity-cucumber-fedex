@search @keyword @regression
Feature: Search by keyword

  Background:
    Given Meghan is on FedEx homepage

  Scenario Outline: Searching by keyword
    When she wants to find information about "<KEYWORD>"
    Then she should see information about "<KEYWORD>"
    Examples:
      | KEYWORD |
      | taxes   |
      | damage  |
      | cost    |
