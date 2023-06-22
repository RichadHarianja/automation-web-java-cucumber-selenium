package dto;

public class RelativeXpath {
    public String xpathByPlaceholder(String value){
        value  = "//input[@placeholder='"+value+"']";
        return value;
    }
    
    public String xpathByDiv(String value) {
    	value = "//div[text()='"+value+"']";
    	return value;
    }
    
    public String xpathByDivContainsText(String value) {
    	value = "//div[contains(text(), '"+value+"')]";
    	return value;
    }
}
