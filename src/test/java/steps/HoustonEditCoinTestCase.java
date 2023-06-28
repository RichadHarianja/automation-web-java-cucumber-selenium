package steps;

import static setups.BrowserPool.getBrowserInstance;

import io.cucumber.java.en.*;
import pages.HoustonEditCoin;

public class HoustonEditCoinTestCase {
	
	
	HoustonEditCoin myCoin = new HoustonEditCoin(getBrowserInstance());

	@And("^user click icon detail of coin$")
	public void userOpenNobiLogin() throws InterruptedException {
	  myCoin.userEditCoin();
	}
	
	@And("^after edited field user click submit$")
	public void editCoin() throws InterruptedException
	{
		myCoin.editCoinPage();
	}
//	
//	@When("^user click coin in Setting menu$")
//	public void navigateToCoinMenu() {
//		loginPage.scrollDown();
//		loginPage.clickCoin();
//	}
//	
//	@And("^validate table, button, field, listing coin$")
//	public void validateCoinMenu() throws InterruptedException
//	{
//		loginPage.checkElements();
//	}

}
