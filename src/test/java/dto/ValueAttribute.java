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
	divTextByActive("Actve"),
	divTextByDecimalPrecision("Decimal Precision"),
	divTextByUseMemo("Use Memo"),
	divTextByHideDeposit("Hide Deposit & WD on App"),
	divTextByCoinImage("Coin Image"),
	inputCoinName("Input coin name"),
	inputTicker("Input ticker"),
	selectFeatureLevel("Select feature level"),
	submit("Submit"),
	cancel("Cancel");
	

    public final String label;
    ValueAttribute(String label) {
        this.label = label;
    }
}
