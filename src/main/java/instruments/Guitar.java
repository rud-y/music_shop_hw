package instruments;

public class Guitar extends Instrument {
    private int strings;
    private String stringType;

    public Guitar(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, String brand, int strings, String stringType) {
        super(instrumentType, buyPrice, sellPrice, colour, brand);
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
