Feature: SignIn_Story
  @signIn
  Scenario: EX_02
    Given user goes to "https://www.gmibank.com/"
    When click the sign in symbol and sign in button
    Then verify the sign in page
    Then type the username and password
    Then click the sign in button

