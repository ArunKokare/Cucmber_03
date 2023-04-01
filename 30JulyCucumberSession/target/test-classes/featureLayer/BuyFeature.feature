Feature: Buy Functionality

@RegressionTest @SmokeTest
Scenario: Buy Samsung galaxy s6 product
Given user should navigate on homepage 
When user clicks on phones
And  click on Samsung galaxy s6
And click on Add to cart 
Then it shows Product added text on popup
And click on OK on popup

@RegressionTest
Scenario: Buy Nokia lumia1520 product
Given user should navigate on homepage 
When user clicks on phones
And  click on Nokia lumia1520
And click on Add to cart 
Then it shows Product added text on popup
And click on OK on popup

Scenario: Buy Nexus6 product
Given user should navigate on homepage 
When user clicks on phones
And  click on Nexus6
And click on Add to cart 
Then it shows Product added text on popup
And click on OK on popup
