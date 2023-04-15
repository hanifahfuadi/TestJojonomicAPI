Feature: Test Jojonomic
  @jojonomic
  Scenario: Get current weather
  Given Set Paramater Current Weather
  Then API should return response 200 OK
  And Validate Current Weather json schema

  Scenario: Get forecast weather
    Given Set Paramater Forecast Weather
    Then API should return response 403 Forbidden
    And Validate Get ToDos json schema
