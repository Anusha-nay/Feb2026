Feature:implementing login functionality
@smoke
Scenario: Successfull login

Given the url "https://login.salesforce.com/"
When i land in "Loginpage"
When i enter the username as "gopuanushareddy31.e1b1ed27a7f6@agentforce.com"
When i enter the password as "Dharanireddy2018"
When i click the login button 
When i land in "Homepage"
Then i should be able to see homepage
@smoke @regression
Scenario: UnSuccessfull login

Given the url "https://login.salesforce.com/"
When i land in "Loginpage"
When i enter the username as "gopuanushareddy31.e1b1ed27a7f6@agentforce.com"
When i enter the password as "D"
When i click the login button 
Then i should be able to see homepage
