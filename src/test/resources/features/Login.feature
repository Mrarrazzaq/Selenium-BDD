@regression
Feature: Login Test
  Scenario: Login with valid credentials
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User should be directed to the dashboard page
  Scenario: Login with 1 step
    Given User login with valid username "standard_user" and password "secret_sauce"