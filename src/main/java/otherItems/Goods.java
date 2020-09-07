package otherItems;

import behaviours.ISell;

public abstract class Goods implements ISell {

    private double buyPrice;
    private double sellPrice;

    public Goods (double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkupPercentage() {
        double sellPricePercentage = (this.sellPrice / this.buyPrice) * 100;
        return sellPricePercentage - 100;
    }

    public double calculateMarkup() {
        return this.getSellPrice() / this.getBuyPrice();
    }

}
