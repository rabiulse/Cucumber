Feature: Login functionality Test


Scenario: Login With Valid credential
Given I Navigate to Login page
When I enter the valid email address
And I entered the valid password 
And I click on Login Button
Then I should get successful Message


Scenario: Login With inValid credential
Given I Navigate to Login page
When I enter the invalid email address
And I entered the valid password 
And I click on Login Button
Then I should get not successful Message

