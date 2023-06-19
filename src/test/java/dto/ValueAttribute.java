package dto;

public enum ValueAttribute {
    email("Email"),
    password("Password");

    public final String label;
    ValueAttribute(String label) {
        this.label = label;
    }
}
