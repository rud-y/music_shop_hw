package instruments;

public class Flute extends Instrument {

    private String material;

    public Flute(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, String brand, String material) {
        super(instrumentType, buyPrice, sellPrice, colour, brand);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String play() {
        return "Flute vibes ...";
    }



}
