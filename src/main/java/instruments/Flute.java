package instruments;

public class Flute extends Instrument {

    private String material;

    public Flute(String colour, String brand, double buyPrice, double sellPrice, String material) {
        super(colour, brand, buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String play() {
        return "Flute vibes filling the room..";
    }



}
