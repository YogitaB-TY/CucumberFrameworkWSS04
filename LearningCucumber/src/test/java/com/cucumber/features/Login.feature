Feature: Login

@functionalScenario
Scenario: Verify user can login using valid credentials

    Given  I will launch browser and Enter the url
  	And  I will click on Login in
  	When enter email and password
  	
  	#This data table is applicable only for When step
  	
  	| yogbelavanaki@gmail.com | Password@123  |
  #	| chennabasu@gmail.com    | Harihara@1914 |
  	
  	And click on sign in
  	Then User name should be displayed or not
