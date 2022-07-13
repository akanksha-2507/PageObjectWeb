Feature: Add Pet as Dog
Scenario Outline: Add Pet as Dog

Given Go to Owner info with lastname "<ltName>" and click on Add new pet button
When Add Pet info name, "<bDate>","<type>"
Then Pet with name, "<bDate>","<type>" should be added

Examples:
|ltName|bDate|type|
|Thompson|01/20/1994|dog|
