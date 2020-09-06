package instruments;
import behaviours.IPlay;
import otherItems.Goods;

public abstract class Instrument extends Goods implements IPlay {
//    private String instrumentType;
    private String colour;
    private String brand;

    public Instrument(double buyPrice, double sellPrice, String colour, String brand) {
        super(buyPrice, sellPrice);
        this.colour = colour;
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public abstract String play();

}
