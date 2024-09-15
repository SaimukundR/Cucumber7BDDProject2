Feature: Login Functionality for E-commerce application
  User lands on website and navigates to login page
  user is able to login using valid username and password successfully

  Background:
    Given user is on login page

    @SuccessfulLogin
    Scenario: Successful login with valid credentials
      Given user has entered valid username and password
      When user clicks on the login button
      Then user logs in successfully

