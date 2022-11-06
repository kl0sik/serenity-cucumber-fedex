@cube @tracking @regression
Feature: Tracking a package

  Background:
    Given Caroline is on FedEx homepage

  Scenario Outline: Tracking a package using a proper id
    When she wants to find information about a package with "<TRACKING_NUMBER>" using "<COMPONENT>"
    Then she should see information about existing package with "<TRACKING_NUMBER>"

    Examples:
      | TRACKING_NUMBER | COMPONENT                  |
      | 123456789012    | Cube Component on Homepage |

