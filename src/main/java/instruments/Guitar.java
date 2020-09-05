package instruments;

public class Guitar extends Instrument {
    private int strings;
    private String stringType;

    public Guitar(String colour, String brand, double buyPrice, double sellPrice, int strings, String stringType) {
        super(colour, brand, buyPrice, sellPrice);
        this.strings = strings;
        this.stringType = stringType;
    }

    public int getNumberOfStrings() {
        return this.strings;
    }

    public String getStringType() {
        return this.stringType;
    }

    public String play() {
        return "Playing guitar ...";
    }

}
