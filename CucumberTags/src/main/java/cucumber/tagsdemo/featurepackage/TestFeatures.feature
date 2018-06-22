Feature: Testing login feature
Scenario: user verification

When browser is open
Then User navigate to login page
When user enters invalid username and password
Then user clicks on login button
Then check user should not login
Then user enters username
And user enters password
Then user clicks on login button
And User login successful 