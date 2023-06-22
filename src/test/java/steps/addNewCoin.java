package steps;

import static setups.BrowserPool.getBrowserInstance;


import io.cucumber.java.en.*;
import pages.HoustonAddNewCoin;

public class addNewCoin {
	
	HoustonAddNewCoin coinPage = new HoustonAddNewCoin(getBrowserInstance());
	
	@When("^user click add new coin button$")
	public void clickAddNewCoin()
	{
		coinPage.clickAddCoin();
	}
	
	@Then("^validate radio button Active, use Memo, Hide deposit & WD on Apps, Name, Ticker, Feature Level, Decimal Precision, Coin Icon$")
	public void validateRadioMemoDepositApps()
	{
		coinPage.validateItems();
	}
	
	@And("^validate btn Submit,and Cancel$")
	public void validateButtons()
	{
		coinPage.validateButton();
	}
	
	@And("^user fill the field$")
	public void fillCoinField()
	{
		coinPage.fillField();
	}
	

}
