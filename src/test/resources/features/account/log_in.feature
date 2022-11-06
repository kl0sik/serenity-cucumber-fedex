@account @login @regression
Feature: Log in

  Background:
    Given Jake is on FedEx homepage

  @invalid @credentials
  Scenario: Log in attempt with invalid credentials
    When Jake wants to log in
    And he provides incorrect credentials
    Then he should not be able to log in
    And he should see error message containing "Login incorrect"