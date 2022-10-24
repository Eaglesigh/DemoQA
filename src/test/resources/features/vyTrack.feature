Feature: VyTrack application login functionality.
  Background:
    Given user is on the login page

  @Murat
  Scenario: login as a driver
    When user enters credentials
    Then user should see main modules


  |Fleet|
  |Customers|
  |Activities|
  |System    |



