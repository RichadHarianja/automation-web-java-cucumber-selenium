package dto;

public enum ValueAttribute {
    email("Email"),
    password("Password"),
	divTextByName("Name"),
	divTextByTicker("Ticker"),
	divTextByFeatureLevel("Feature Level"),
	divTextByStatus("Status"),
	divTextByDetail("Detail"),
	divAddCoin("Add Coin"),
	searchCoin("Search coin"),
	divTextByActive("Active"),
	divTextByDecimalPrecision("Decimal Precision"),
	divTextByUseMemo("Use Memo"),
	divTextByHideDeposit("Hide Deposit & WD on App"),
	divTextByCoinImage("Coin Image"),
	inputCoinName("Input coin name"),
	inputTicker("Input ticker"),
	selectFeatureLevel("Select feature level"),
	submit("Submit"),
	cancel("Cancel"),
	activeSession("Active session is detected on another device and will be logged out."),
	confirmLogin("Yes");
	

    public final String label;
    ValueAttribute(String label) {
        this.label = label;
    }
}
