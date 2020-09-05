package instruments;

public class Guitar extends Instrument {
    private int strings;
    private String type;

    public Guitar(String colour, String brand, double buyPrice, double sellPrice, int strings, String type) {
        super(colour, brand, buyPrice, sellPrice);
        this.strings = strings;
        this.type = type;
    }

    public String play() {
        return "instruments.Guitar tunes in the air...";
    }

    @Override
    public double calculateMarkup() {
        return super.calculateMarkup();
    }
}
