package instruments;

public class Cello extends Instrument{

    private int size;

    public Cello(String colour, String brand, double buyPrice, double sellPrice, int size) {
        super(colour, brand, buyPrice, sellPrice);
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
