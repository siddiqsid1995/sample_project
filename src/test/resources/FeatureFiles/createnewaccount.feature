@createaccount
Feature: To Validate the login functionality of fb application

@regression
Scenario: To Validate the login with create new account button with respective fields

When user click the create new account button
And user navigate into new window and fill the firstname and surname
And user select the date of birth
And user select any one gender option
And user enter the mobile number
And user set the password of the account
Then user account was created
