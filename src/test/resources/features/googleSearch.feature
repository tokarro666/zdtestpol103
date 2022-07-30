Feature: Google search feature

  Background:
    Given Google page is opened
    When I click Accept all button

  Scenario: Search in Google

#    Given Google page is opened
#    When I click Accept all button
    And I search for phrase "cucumber"
    Then I can see search results page

  Scenario Outline: Search in Gogle with Scenario Outline
#    Given Google page is opened
#    When I click Accept all button
    And I search for phrase "<searchPhrase>"
    Then I can see search results page
    Examples:
      | searchPhrase |
      | Cucumber     |
      | Selenium     |
      | SDA Academy  |

  Scenario: No search phrase
    And I click Enter button
    Then Search results page is not presented


