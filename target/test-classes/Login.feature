Feature: Login Functionality

  in order to do internet banking
  As a valid customer
  the user want to login successfully

  Scenario Outline: Login Successful
    Given the user in the login page of the para bank application
    When I enter valid <username> and <password> with <userFullName>
    Then the user should be token to the overview page
    Examples:
      | username  | password |userFullName|
      | "abdo12" | "123456" |" abdo12 emad"   |
      | "abdo13" | "123456" |" abdo13 emad"   |
