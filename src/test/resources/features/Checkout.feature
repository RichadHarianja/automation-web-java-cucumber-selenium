@Checkout
Feature: Checkout feature

  @checkout @success
  Scenario Outline :  User want to checkout fruit from Tanihub web
    Given User open google web
    Then User want to check the logo web
    Then I click button account image
    Then I click button email
    And I input the "<email>"
    When I click the next button
    Then I input "<password>"
    Then I click login button
    Then I click search field
    And I input the "<fruits>"

    Examples:
      | email  | password  | fruits |
      | testinguser@mailinator.com  | admin123  | jeruk |




