@RegisterAccount
Feature: SignUp feature

  @registeraccount @success
  Scenario Outline: User want to register to Bibit web
    Given user open google web
    Then user want to check the web
    Then user click SignUp menu
    When user click RegisterWithEmail
    Then user want to input name "<name>"
    Then user input email "<email>"
    Then user input username "<username>"
    Then user input password "<password>"
    Then user input confirmPassword "<confirmPassword>"
    And user assert the error message in web

    Examples:
    | name | email| username | password | confirmPassword |
    | name | email | username | password | password       |

