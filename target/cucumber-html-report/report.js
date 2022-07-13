$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/verifyAddedOwner.feature");
formatter.feature({
  "name": "Find Owners tab and Add Owner",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Find Owners tab and Add Owner",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Go to PetClinic home page and click on Find Owners tab",
  "keyword": "Given "
});
formatter.step({
  "name": "Add Owners name, \"\u003caddr\u003e\",\"\u003ccty\u003e\",\"\u003ctelephoneNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Owners with name,\"\u003caddr\u003e\",\"\u003ccty\u003e\",\"\u003ctelephoneNumber\u003e\" should be added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "addr",
        "cty",
        "telephoneNumber"
      ]
    },
    {
      "cells": [
        "Sewanagar",
        "Gwalior",
        "1234567890"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Find Owners tab and Add Owner",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Go to PetClinic home page and click on Find Owners tab",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyAddedPet.go_to_PetClinic_home_page_and_click_on_FInd_Owners_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add Owners name, \"Sewanagar\",\"Gwalior\",\"1234567890\"",
  "keyword": "When "
});
formatter.match({
  "location": "VerifyAddedPet.add_Owners(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Owners with name,\"Sewanagar\",\"Gwalior\",\"1234567890\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyAddedPet.owners_should_be_added(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/verifyAddedPet.feature");
formatter.feature({
  "name": "Add Pet as Dog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add Pet as Dog",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Go to Owner info with lastname \"\u003cltName\u003e\" and click on Add new pet button",
  "keyword": "Given "
});
formatter.step({
  "name": "Add Pet info name, \"\u003cbDate\u003e\",\"\u003ctype\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Pet with name, \"\u003cbDate\u003e\",\"\u003ctype\u003e\" should be added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ltName",
        "bDate",
        "type"
      ]
    },
    {
      "cells": [
        "Thompson",
        "01/20/1994",
        "dog"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add Pet as Dog",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Go to Owner info with lastname \"Thompson\" and click on Add new pet button",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyAddedOwner.go_to_Owner_info_with_lastname_and_click_on_Add_new_pet_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add Pet info name, \"01/20/1994\",\"dog\"",
  "keyword": "When "
});
formatter.match({
  "location": "VerifyAddedOwner.add_Pet_info(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pet with name, \"01/20/1994\",\"dog\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyAddedOwner.pet_with_should_be_added(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/verifyImageOnHomePage.feature");
formatter.feature({
  "name": "Verify Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Petclicnic application should be launched",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyImageOnHomePage.petclicnic_application_should_be_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify image on Home Page",
  "keyword": "When "
});
formatter.match({
  "location": "VerifyImageOnHomePage.verify_image_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Image should be verified",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyImageOnHomePage.image_should_be_verified()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});