Feature: Register

@functionalScenario
Scenario Outline: Verify user can register using valid credentials

Given Browser is open and "https://demowebshop.tricentis.com/" is navigated
And user clicks on Register Link 
#WelcomePage
When user enters "<Gender>" "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
And clicks on Register button  
#RegisterPage
Then user should be successfully registered  
#HomePage

Examples:

| Gender | FirstName | LastName | Email                 | Password     | ConfirmPassword |
| M      | Lionel    | Messi    | lionelmessi@gmail.com | Password@123 | Password@123    |
| M      | Cristiano | Ronaldo  | cronaldo@gmail.com    | Password@123 | Password@123    |

