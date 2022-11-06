@contactus @support @regression
Feature: Contact Us

  Background:
    Given Mandy is on FedEx homepage

  Scenario Outline: Querying customer support
    And she wants to get information from customer support
    When she queries Virtual Support Assistant for "<QUERY>"
    Then she should receive an answer related to "<QUERY>"

    Examples:
      | QUERY               |
      | Nearest FedEx store |
      | Damaged package     |
