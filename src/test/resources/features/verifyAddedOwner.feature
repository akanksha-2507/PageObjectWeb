Feature: Find Owners tab and Add Owner
Scenario Outline: Find Owners tab and Add Owner

Given Go to PetClinic home page and click on Find Owners tab
When Add Owners name, "<addr>","<cty>","<telephoneNumber>"
Then Owners with name,"<addr>","<cty>","<telephoneNumber>" should be added

Examples:
|addr|cty|telephoneNumber|
|Sewanagar|Gwalior|1234567890|