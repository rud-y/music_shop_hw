package instruments;

public class Cello extends Instrument{

    private int size;

    public Cello(double buyPrice, double sellPrice, String colour, String brand, int size) {
        super(buyPrice, sellPrice, colour, brand);
        this.size = size;
    }

    public int getSize() {
        return size;
    }


    @Override
    public String play() {
        return "Cello playing ...";
    }

}
