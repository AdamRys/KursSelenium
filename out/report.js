$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/correct-address-data.feature");
formatter.feature({
  "line": 1,
  "name": "Creation of new user address",
  "description": "",
  "id": "creation-of-new-user-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Fill users data - alias, address, city and zip/postal",
  "description": "",
  "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User goes to Profile",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User goes to Addresses",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User creates new address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User fill \u003calias\u003e, \u003caddress\u003e, \u003ccity\u003e, \u003cpostcode\u003e, \u003ccountry\u003e and \u003cphone\u003e info",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "postcode",
        "country",
        "phone"
      ],
      "line": 18,
      "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;1"
    },
    {
      "cells": [
        "alias 1",
        "Road 10",
        "Birmingham",
        "01567",
        "United Kingdom",
        "567578589"
      ],
      "line": 19,
      "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;2"
    },
    {
      "cells": [
        "alias 2",
        "Road 9",
        "Leeds",
        "07564",
        "United Kingdom",
        "765754743"
      ],
      "line": 20,
      "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;3"
    },
    {
      "cells": [
        "alias 3",
        "Road 4",
        "London",
        "03428",
        "United Kingdom",
        "859483753"
      ],
      "line": 21,
      "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Fill users data - alias, address, city and zip/postal",
  "description": "",
  "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User goes to Profile",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User goes to Addresses",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User creates new address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User fill alias 1, Road 10, Birmingham, 01567, United Kingdom and 567578589 info",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddAddressSteps.userLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 4317085981,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToProfile()"
});
formatter.result({
  "duration": 338163986,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToAddresses()"
});
formatter.result({
  "duration": 1867992778,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userCreatesNewAdress()"
});
formatter.result({
  "duration": 353574598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alias 1",
      "offset": 10
    },
    {
      "val": "Road 10",
      "offset": 19
    },
    {
      "val": "Birmingham",
      "offset": 28
    },
    {
      "val": "01567",
      "offset": 40
    },
    {
      "val": "United Kingdom",
      "offset": 47
    },
    {
      "val": "567578589",
      "offset": 66
    }
  ],
  "location": "AddAddressSteps.userFillAliasAddressCityPostcodeCountryAndPhoneInfo(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1197683180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 16
    }
  ],
  "location": "AddAddressSteps.userSeesInfo(String)"
});
formatter.result({
  "duration": 119392929,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Fill users data - alias, address, city and zip/postal",
  "description": "",
  "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User goes to Profile",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User goes to Addresses",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User creates new address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User fill alias 2, Road 9, Leeds, 07564, United Kingdom and 765754743 info",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddAddressSteps.userLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 3272515537,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToProfile()"
});
formatter.result({
  "duration": 323916405,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToAddresses()"
});
formatter.result({
  "duration": 1822127517,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userCreatesNewAdress()"
});
formatter.result({
  "duration": 355052416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alias 2",
      "offset": 10
    },
    {
      "val": "Road 9",
      "offset": 19
    },
    {
      "val": "Leeds",
      "offset": 27
    },
    {
      "val": "07564",
      "offset": 34
    },
    {
      "val": "United Kingdom",
      "offset": 41
    },
    {
      "val": "765754743",
      "offset": 60
    }
  ],
  "location": "AddAddressSteps.userFillAliasAddressCityPostcodeCountryAndPhoneInfo(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1148235711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 16
    }
  ],
  "location": "AddAddressSteps.userSeesInfo(String)"
});
formatter.result({
  "duration": 167751660,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Fill users data - alias, address, city and zip/postal",
  "description": "",
  "id": "creation-of-new-user-address;fill-users-data---alias,-address,-city-and-zip/postal;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User goes to Profile",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User goes to Addresses",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User creates new address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User fill alias 3, Road 4, London, 03428, United Kingdom and 859483753 info",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddAddressSteps.userLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 3446368769,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToProfile()"
});
formatter.result({
  "duration": 350355434,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToAddresses()"
});
