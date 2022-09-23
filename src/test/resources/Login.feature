Feature: Login Functionality

  in order to do internet banking
  As a valid customer
  the user want to login successfully

  Scenario: Login Successful
  Given the user in the login page of the para bank application
    When the user enter valid credentials
    Then the user should be token to the overview page
