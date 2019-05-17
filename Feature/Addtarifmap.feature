Feature: Add Tariff Plan validation
 
Scenario: Tarrif Plan verification
Given The user is in telecom home page
And The user click on the add tarrif plan
When The user is filling all the field
|Monthly rent    |8000|
|Free local min  |52|
|Free interna min|30|
|Free SMS pack   |399|
|Local per min   |79|
|Interna per min |150|
|SMS per charge  |29|
And The user click on the submit button
Then The user should see plan has been added
