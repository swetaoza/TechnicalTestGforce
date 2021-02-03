Feature:Added New Feature
Application Should allow users to add new computers to the database for searching at a later date
As A product manager
I want frontend users to be able to update the database
So That I don't have to book time with a database administrator

  @acceptance
  Scenario: There should be a link to the new section that allows users to add computers to the database
    Given I open browser
    When I navigate to the computer database app
    Then I should see a new button called Add a New Computer

  @acceptance
  Scenario: It should be possible to open the new section
    Given I am already on the database application
    And the link to the new section is present
    When I click on the link
    Then I should be taken to the new section to update the database
    And The new section should have a heading of Add a New Computer



  @acceptance
  Scenario: It Should allow me to cancel the operation
    Given I am already entering a new computer into the system
    When I Enter Computer name "acer" in computer name field
    And I Enter Introduced date "2020-05-07"
    And I Enter DiscontinueDate "2020-12-20"
    And I select company "Apple Inc."
    But I need to stop what I am doing and go back to the main view
    When I click cancel
    Then It should take me back to the main computer database view

  @acceptance
  Scenario: It should not allow new computers to be added unless all fields are populated
    Given I am already adding a computer in the Add a New Computer view
    And I have already entered a name for a computer
    But Have not entered data into other fields
    When I click Add This Computer
    Then It should not allow you to save
    And It should indicate which fields are mandatory

