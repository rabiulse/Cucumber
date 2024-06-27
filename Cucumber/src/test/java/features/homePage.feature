Feature: homepage Functionality  Test

@End2EndTest
Scenario: HomePage logo is display successfully
Given Test Navigate to Login page
When I enter the valid email address
And I entered the valid password 
And I click on Login Button
Then I should get successful Message
And I validate the Homepage logo display

@RegressionTest
Scenario Outline: User page default login
Given User is on login page
When User login into application with "<username>" and "<password>"
Then Home page is displayed
And Card details displayed

Examples: 
 |username | password |
 |TestUser1|TestPass01|
 |TestUser2|TestPass02|
 |TestUser2|TestPass02|
 |TestUser3|TestPass03|
 |TestUser4|TestPass04|
 
 @SmokeTest
 Scenario: Fill the user registration form with many data
 
 Given User land on login page
 When  User fill the data with the below 
 |rabiul|
 |uzzaman|
 |9674976407|
 |rabiul.print@gmail.com|
 
 Then  Registration is successfull
 
