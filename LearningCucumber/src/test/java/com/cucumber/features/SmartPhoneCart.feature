Feature: Electronics

@integrationScenario
  Scenario: Verify user can add Smartphone to cart ater login
    Given Browser is open and "https://demowebshop.tricentis.com/" is entered
    And user logs in using "yogbelavanaki@gmail.com" and "Password@123"
    When user navigates to cell phones page
    And clicks on add to cart of SmartPhone product
    Then product should be added to cart
