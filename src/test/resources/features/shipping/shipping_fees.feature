@shipping @fees @regression
Feature: Shipping fees

  Background:
    Given Harold is on FedEx homepage

  Scenario Outline: Shipping fees for different locations
    When he wants to find out the cost of shipping from "<FROM>" to "<TO>"
    And he has "<QTY>" "<PACKAGE_TYPE>" package which weighs "<PACKAGE_WEIGHT>" kg
    And he wants it shipped on the same day
    Then he should see available rates and delivery dates
    And he should be able to ship now

    Examples:
      | FROM      | TO          | QTY | PACKAGE_TYPE | PACKAGE_WEIGHT |
      | Rotterdam | Amsterdam   | 1   | FEDEX_BOX    | 9              |
      | Amsterdam | Vlaardingen | 1   | FEDEX_PAK    | 1              |

