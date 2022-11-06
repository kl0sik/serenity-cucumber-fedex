@search @tracking @regression
Feature: Search by tracking number

  Background:
    Given Peter is on FedEx homepage

  @existing
  Scenario Outline: Searching by existing tracking number
    When he wants to find information about a package with "<TRACKING_NUMBER>" using "<COMPONENT>"
    Then he should see information about existing package with "<TRACKING_NUMBER>"

    Examples:
      | TRACKING_NUMBER | COMPONENT                  |
      | 123456789012    | Search Component in Header |

  @non-existing
  Scenario Outline: Searching by non-existing tracking number
    When he wants to find information about a package with "<TRACKING_NUMBER>" using "<COMPONENT>"
    Then he should be informed about no record of "<TRACKING_NUMBER>"
    And he should be able to contact customer service with one click

    Examples:
      | TRACKING_NUMBER | COMPONENT                  |
      | 123456789013    | Search Component in Header |

  @bad-format
  Scenario Outline: Searching by badly formatted tracking number
    When he wants to find information about a package with "<TRACKING_NUMBER>" using "<COMPONENT>"
    And he should see no results found for "<TRACKING_NUMBER>"

    Examples:
      | TRACKING_NUMBER | COMPONENT                  |
      | 1111oneone      | Search Component in Header |


