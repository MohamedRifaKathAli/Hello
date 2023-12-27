Feature: Validating Facebook
Scenario Outline: validating loginpage
Given Launch the browser and url
When Enter the "<Password>" username "<Username>"
And Enter the password
Then Click the login

Examples:
|Username|Password|

