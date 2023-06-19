package dto;

public class RelativeXpath {
    public String xpathByPlaceholder(String value){
        value  = "//input[@placeholder='"+value+"']";
        return value;
    }
}
