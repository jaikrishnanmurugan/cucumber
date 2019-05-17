Feature: Add Tariff Plan validation
 
Scenario: Tarrif Plan verification
Given The user is in telecom home page
And The user click on the add tarrif plan
When The user is filling all the field
|5000|84|22|455|80|356|737|
And The user click on the submit button
Then The user should see plan has been added

