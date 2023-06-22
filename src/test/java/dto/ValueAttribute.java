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
	searchCoin("Search coin");

    public final String label;
    ValueAttribute(String label) {
        this.label = label;
    }
}
