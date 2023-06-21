package steps;

import static setups.BrowserPool.getBrowserInstance;


import io.cucumber.java.en.*;
import pages.HoustonAddNewCoin;
import pages.HoustonLogin;

public class addNewCoin {
	
	HoustonAddNewCoin coinPage = new HoustonAddNewCoin(getBrowserInstance());
	
	@When("^user click add new coin button$")
	public void clickAddNewCoin()
	{
		coinPage.clickAddCoin();
	}
	
	@Then("^validate radio button Active, use Memo, Hide deposit & WD on Apps$")
	public void validateRadioMemoDepositApps()
	{
		coinPage.validateItems();
	}
	

}
