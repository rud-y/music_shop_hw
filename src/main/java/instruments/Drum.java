package instruments;

public class Drum extends Instrument {

    private int diameter;
    private String type;

    public Drum(String colour, String brand, double buyPrice, double sellPrice, int diameter, String type) {
        super(colour, brand, buyPrice, sellPrice);
        this.diameter = diameter;
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getType() {
        return type;
    }

    public String play() {
        return "Dum, dum, tcsssss";
    }



}
