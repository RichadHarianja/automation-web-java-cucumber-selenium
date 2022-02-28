@Checkout
Feature: Checkout feature

  @checkout @success
  Scenario Outline :  User want to checkout pillow from midtrans web
    Given User open google web
    Then User want to check the logo web
    Then I click button buy
    And I click button checkout
    Then I click button continue
    Then I choose credit card payment method
    Then I will assert the price "<price>"
    When I input card number "<number>"
    And I input expiry date "<date>"
    And I input cvv code "<cvv>"
    Then I click pay now button
    When I input the "<otp>" code
    And I click button ok

    Examples:
      | number  | date  | cvv | otp | price |
      | 4811111111111114  | 12/21  | 123 | 112233  |  18,000 |
      | 4911111111111113  | 12/21  | 123 | 112233  |  18,000 |




