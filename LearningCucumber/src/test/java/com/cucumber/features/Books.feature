Feature: Books

Background:
Given Browser is open to Welcome Page
When user logs in using valid credentials 
| yogbelavanaki@gmail.com | Password@123 |
Then Home Page should be displayed
And User Should navigate to Books page

@functionalScenario
Scenario: Verify user can choose Name: A-Z in sort by dropdown

When user chooses Name A-Z in drop down
Then The products should be dislpayed in A to Z order

@integrationScenario
Scenario: Verify if user can add computing and network book to cart

When user clicks on add to cart button for Computing and network book
Then Book should be added to cart

@integrationScenario
Scenario: Verify is user can add Health Book to wishlist

When user clicks on Health book
And clicks on add to wishlist button
Then product should be added to wishlist




