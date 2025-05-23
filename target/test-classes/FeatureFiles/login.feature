@login
Feature: To Validate the login functionality of facebook application

@smoke @sanity 
Scenario: To Validate the login with valid username and valid password
When user want to enter the values in username and password field
|username           | password|
|java123@gmail.com  |896750873|
|sql123@gmail.com   |896750873|
|oracle123@gmail.com|896750873|
And user click the login button
Then user navigate into home page

@regression @smoke 
Scenario: To Validate the login with invalid username and invalid password
When user enter the values in username and password field and click the login button
Then user navigate into Error page



