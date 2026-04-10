package models;

public class Symbol {
    private String symbolName;

    public Symbol(String symbolName) {
        this.symbolName = symbolName;
    }

    // private Image image;


    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }
}
