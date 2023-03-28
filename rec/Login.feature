Feature: Login
Background: Login credentials
When browser is open
Given user navigate to url as "https://www.facebook.com/login/"

@SmokeTest
Scenario Outline:
Then user enter "//*[@id='email']" email id <username>
And user enter "//*[@id='pass']" password  <password>
Then user click on submit tap "//*[@id='loginbutton']"
But user not login successfully 
 

Examples:

|username|  |password|
|shailaja@gmail.com| |Shailaja@123|