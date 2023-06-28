@tag
Feature: Nobi Houston Edit Coin

Background:
		Given user login in Houston Page
    When user click coin in Setting menu
    And validate table, button, field, listing coin


  @tag1
  Scenario: Nobi Houston Edit Coin
		And user click icon detail of coin
		#Then user redirected to page edit
		And after edited field user click submit
		#Then showed confirm page about confirm update
		#And user click confirm 
		#Then user success to edit coin
