$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurfile/computer.feature");
formatter.feature({
  "line": 1,
  "name": "Added New Feature",
  "description": "Application Should allow users to add new computers to the database for searching at a later date\r\nAs A product manager\r\nI want frontend users to be able to update the database\r\nSo That I don\u0027t have to book time with a database administrator",
  "id": "added-new-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5189675000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "There should be a link to the new section that allows users to add computers to the database",
  "description": "",
  "id": "added-new-feature;there-should-be-a-link-to-the-new-section-that-allows-users-to-add-computers-to-the-database",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@acceptance"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I navigate to the computer database app",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see a new button called Add a New Computer",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iOpenBrowser()"
});
formatter.result({
  "duration": 169595900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iNavigateToTheComputerDatabaseApp()"
});
formatter.result({
  "duration": 28600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeANewButtonCalledAddANewComputer()"
});
formatter.result({
  "duration": 82878700,
  "status": "passed"
});
formatter.after({
  "duration": 703599800,
  "status": "passed"
});
formatter.before({
  "duration": 2096333600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "It should be possible to open the new section",
  "description": "",
  "id": "added-new-feature;it-should-be-possible-to-open-the-new-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@acceptance"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am already on the database application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the link to the new section is present",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on the link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should be taken to the new section to update the database",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "The new section should have a heading of Add a New Computer",
  "keyword": "And "
});
formatter.match({
  "location": "newfeturenavigate.iAmAlreadyOnTheDatabaseApplication()"
});
formatter.result({
  "duration": 90600,
  "status": "passed"
});
formatter.match({
  "location": "newfeturenavigate.theLinkToTheNewSectionIsPresent()"
});
formatter.result({
  "duration": 48173100,
  "status": "passed"
});
formatter.match({
  "location": "newfeturenavigate.iClickOnTheLink()"
});
formatter.result({
  "duration": 180980400,
  "status": "passed"
});
formatter.match({
  "location": "newfeturenavigate.iShouldBeTakenToTheNewSectionToUpdateTheDatabase()"
});
formatter.result({
  "duration": 57100,
  "status": "passed"
});
formatter.match({
  "location": "newfeturenavigate.theNewSectionShouldHaveAHeadingOfAddANewComputer()"
});
formatter.result({
  "duration": 47530500,
  "status": "passed"
});
formatter.after({
  "duration": 653962100,
  "status": "passed"
});
formatter.before({
  "duration": 2156742600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "It Should allow me to cancel the operation",
  "description": "",
  "id": "added-new-feature;it-should-allow-me-to-cancel-the-operation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@acceptance"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I am already entering a new computer into the system",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I Enter Computer name \"acer\" in computer name field",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I Enter Introduced date \"2020-05-07\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Enter DiscontinueDate \"2020-12-20\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select company \"Apple Inc.\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I need to stop what I am doing and go back to the main view",
  "keyword": "But "
});
formatter.step({
  "line": 31,
  "name": "I click cancel",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "It should take me back to the main computer database view",
  "keyword": "Then "
});
formatter.match({
  "location": "CancelTest.iAmAlreadyEnteringANewComputerIntoTheSystem()"
});
formatter.result({
  "duration": 280695100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acer",
      "offset": 23
    }
  ],
  "location": "CancelTest.iEnterComputerNameInComputerNameField(String)"
});
formatter.result({
  "duration": 78803200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2020-05-07",
      "offset": 25
    }
  ],
  "location": "CancelTest.iEnterIntroducedDate(String)"
});
formatter.result({
  "duration": 110831500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2020-12-20",
      "offset": 25
    }
  ],
  "location": "CancelTest.iEnterDiscontinueDate(String)"
});
formatter.result({
  "duration": 99833500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Inc.",
      "offset": 18
    }
  ],
  "location": "CancelTest.iSelectCompany(String)"
});
formatter.result({
  "duration": 184360600,
  "status": "passed"
});
formatter.match({
  "location": "CancelTest.iNeedToStopWhatIAmDoingAndGoBackToTheMainView()"
});
formatter.result({
  "duration": 68000,
  "status": "passed"
});
});