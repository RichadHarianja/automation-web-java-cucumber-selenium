@tag
Feature: Nobi Houston Add New Coin

Background:
		Given user login in Houston Page
    When user click coin in Setting menu
    And validate table, button, field, listing coin


  @tag1
  Scenario: Add New Coin in Houston
		When user click add new coin button
		#Then validate radio button Active, use Memo, Hide deposit & WD on Apps,
		#And validate field consist of : Name, Ticker, Feature Level, Decimal Precision, Coin Icon
		#And validate btn Submit,and Cancel 
		#And user fill the field
		#Then user directed to coin page after success add new coin
    # "Then" does not seem to be an option avalable
