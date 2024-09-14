Feature: Testing loggings Application

Scenario Outline: Testing logins case

Given user launch the application
When user enter <userName> and <password>
And click on login button
Then user navigate to application

Examples:
| userName | password |
| SathishDamarapelly | S@t26-26 |


