Feature: Register_Story
  @register
  Scenario: EX_01
    Given user goes to "https://www.gmibank.com/"
    When click the sign in symbol and register button
    Then verify the registration page
    Then type the ssn, firstname, lastname, address, phone number, username and email information
    When type the new password
    When type the new password confirmation
    Then click the register button

