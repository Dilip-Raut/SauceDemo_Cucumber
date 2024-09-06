Feature: Login Functionality Of SauceDemo with Valid and Invalid User

Background:
    Given User is on sauceDemo page "https://www.saucedemo.com/"
    
  Scenario: as a user Login with valid Credentials
    When User entered username as "standard_user" and Password as "secret_sauce"
    When User click on sign in button
    Then Validate the title after login

