package otherItems;

import behaviours.ISell;

public abstract class OtherItem implements ISell {

    private double buyPrice;
    private double sellPrice;

    public OtherItem(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        double sellPricePercentage = (this.sellPrice / this.buyPrice) * 100;
        return sellPricePercentage - 100;
    }
}
