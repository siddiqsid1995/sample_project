$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/createnewaccount.feature");
formatter.feature({
  "name": "To Validate the login functionality of fb application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@createaccount"
    }
  ]
});
formatter.scenario({
  "name": "To Validate the login with create new account button with respective fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@createaccount"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click the create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.userClickTheCreateNewAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate into new window and fill the firstname and surname",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.userNavigateIntoNewWindowAndFillTheFirstnameAndSurname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.userSelectTheDateOfBirth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select any one gender option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.userSelectAnyOneGenderOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.userEnterTheMobileNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user set the password of the account",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.userSetThePasswordOfTheAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user account was created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.userAccountWasCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/login.feature");
formatter.feature({
  "name": "To Validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "To Validate the login with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user want to enter the values in username and password field",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java123@gmail.com",
        "896750873"
      ]
    },
    {
      "cells": [
        "sql123@gmail.com",
        "896750873"
      ]
    },
    {
      "cells": [
        "oracle123@gmail.com",
        "896750873"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userWantToEnterTheValuesInUsernameAndPasswordField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate into home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userNavigateIntoHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate the login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter the values in username and password field and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userEnterTheValuesInUsernameAndPasswordFieldAndClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate into Error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userNavigateIntoErrorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});