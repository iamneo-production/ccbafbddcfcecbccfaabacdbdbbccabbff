Feature: New user registration.
Scenario: Verification of successful registration when the inputs are correct. 
Given user on the user registration page
 When user enters a valid user name 
And valid e-mail address 
And valid password 
And valid confirmation password 
And valid Birth-date 
And valid Gender 
And valid phone number 
Then user registration should be successful 