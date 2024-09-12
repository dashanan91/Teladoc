Feature: As an Engr. Candidate
  I need to automate http://www.way2automation.com/angularjs-protractor/webtables/
  So that I can show my awesome automation skills

  Scenario Outline: Add a user and the user has been added to the table
    Given User opens landing page of the app
    When User tries to create new user
    And User provides firstName as "<firstName>"
    And User provides lastName as "<lastName>"
    And User provides userName as "<userName>"
    And User provides password as "<password>"
    And User provides customer as "<companyName>"
    And User provides Role as "<role>"
    And User provides Email as "<email>"
    And User provides CellPhone as "<cellPhone>"
    And User clicks on submit button to create user specified
    Then specified user gets created and verified as an entry on the webTable
    Examples:
      | firstName | lastName  | userName | password  | companyName | role     | email                | cellPhone  |
      | Rahul     | Choudhary | Rahul_91 | Rahul@123 | Company AAA | Customer | r.110991.c@gmail.com | 9999154339 |

  Scenario: Delete the user "novak" from the table and the user has been deleted
    Given User opens landing page of the app
    When User gets count of all the users in table
    And User finds and deletes lineItem with userName as "novak" from the table
    Then Count of users in the table gets reduced by 1
    And User named "novak" should not be found in the table



