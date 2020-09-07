package instruments;

public class Drum extends Instrument {

    private int diameter;
    private String type;

    public Drum(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, String brand, int diameter, String type) {
        super(instrumentType, buyPrice, sellPrice, colour, brand);
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
        return "Bam, bam...";
    }



}
