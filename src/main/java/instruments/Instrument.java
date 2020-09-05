package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {
//    private String instrumentType;
    private String colour;
    private String brand;
    double buyPrice;
    double sellPrice;

    public Instrument(String colour, String brand, double buyPrice, double sellPrice) {
        this.colour = colour;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public abstract String play();

    public double calculateMarkup() {
        double sellPricePercentage = (this.sellPrice / this.buyPrice) * 100;
        return sellPricePercentage - 100;
    }
}
