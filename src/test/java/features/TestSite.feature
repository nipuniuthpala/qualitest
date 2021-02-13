Feature: Test the site after login and order item and then update personal information.

  Scenario: User logs in to the site and order an Item
    Given user is on the website
    When the user clicks on sign in and sign with username and password
    And user order an T-shirt and place the order
    Then user will see the the order history
    Then user closes the browser

  Scenario: User updates the personal Information
    Given user is on the website
    When the user clicks on sign in and sign with username and password
    When the user clicks on profile
    And user clicks on my personal information
    And user change the first name and save
    Then user will see edited name
    Then user closes the browser
