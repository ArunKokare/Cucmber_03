Feature: Login Functionality

@SanityTest
Scenario: verify login with valid credentials
Given user should navigate on homepage 
When user clicks on login link and enter username and enter password and click on login button 
Then user logged in application

@SmokeTest @SanityTest
Scenario: verify login acc with valid credentials
Given user should navigate on homepage 
When user clicks on login link 
And enter username as "testacc4" and enter password as "test" 
And click on login button 
Then user logged in application and showing "Welcome testacc4"

@SmokeTest @SanityTest
Scenario Outline: login to application 
Given user should navigate on homepage 
When user clicks on login link 
And enter username "<Username>" and enter password "<Password>"
And click on login button 
Then user logged in application & showing "<status2>"

Examples:
				|Username|Password|status2|
				|testacc5|test|Welcome testacc5|
				|testacc6|test|Welcome testacc6|
				|testacc7|test|Welcome testacc7|
		
		
		
		
		
		
		
		
		

