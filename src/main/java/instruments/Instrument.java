package instruments;
import behaviours.IPlay;
import behaviours.ISell;


public abstract class Instrument implements ISell, IPlay {
//    private String instrumentType;
    private double buyPrice;
    private double sellPrice;
    private String colour;
    private String brand;

    public Instrument(double buyPrice, double sellPrice, String colour, String brand) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.colour = colour;
        this.brand = brand;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public abstract String play();

    public double calculateMarkupPercentage() {
        double sellPricePercentage = (this.sellPrice / this.buyPrice) * 100;
        return sellPricePercentage - 100;
    }

    public double calculateMarkup() {
        return this.getSellPrice() / this.getBuyPrice();
    }

}
