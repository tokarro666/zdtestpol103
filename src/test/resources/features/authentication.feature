Feature:  Authentication to e-shop
  As an user
  I want to sign in to the application, so that i can continue shopping

  Background:
    Given Home page is opened
    When I click Sign in link in top menu

  Scenario: Authentication - positive flow
#    Given Home page is opened
#    When I click Sign in link in top menu
    And I fill login field "testUser1234@test.pl"
    And I fill password field "password12345"
    And I click Sign in button
    Then I can see page for authenticated users

Scenario: Email address is invalid
#  Given Home page is opened
#  When I click Sign in button
  And I fill login field "testtest"
  And I fill password field "1111111"
  And I click Sign in button
  Then Error message is presented "Invalid email address"

  Scenario: Email address is invalid
#    Given Home page is opened
#    When I click Sign in button
    And I fill login field "testtest"
    And I fill password field "222222222"
    And I click Sign in button
    Then Error message is presented "Invalid password"

Scenario: Empty password
  And I fill login field "testtest"
  And I click Sign in button
  Then Error message is presented "Password is required."


Scenario Outline: Authentication - negative flow
  And I fill login field "<emailAddress>"
  And I fill password field "<password>"
  And I click Sign in button
  Then Error message is presented "<errorMessage>"
  Examples:
    | emailAddress | password | errorMessage |
    |              |          | An email address is required |
    | invalid      | 1111111  | Invalid email address        |
    | test.test.pl | 1111     | Invalid email address        |
    | test@test.pl | 1        | Invalid password             |
    | test@test.pl |          | Password is required         |
    | test@test.pl | 123456   | Authentication failed        |