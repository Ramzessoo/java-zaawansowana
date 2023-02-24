package programming;

import lombok.Getter;

@Getter

public enum Fuel {

    DIESEL("diesel", "ON", "olej napędowy", "ropa"),
    PB("Pb", "Pb95", "benzyna", "95"),
    LPG("LPG", "CNG", "gaz", "zagazowany");

    private String originalName;
    private String symbol;
    private String plTranslate;
    private String plColloquially;

    Fuel(String originalName, String simbol, String plTranslate, String plColloquially) {
        this.originalName = originalName;
        this.symbol = simbol;
        this.plTranslate = plTranslate;
        this.plColloquially = plColloquially;
    }

    public static Fuel findByOriginalName(String originalName) {
        for (Fuel f : Fuel.values()) {
            if (f.originalName.equalsIgnoreCase(originalName)) {
                return f;
            }
        }
        return null;
    }

}
