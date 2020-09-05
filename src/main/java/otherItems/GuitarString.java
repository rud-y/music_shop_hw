package otherItems;

import behaviours.ISell;

public class GuitarString extends  OtherItem {
    private String material;
    private double thickness;

    public GuitarString(double buyPrice, double sellPrice, String material, double thickness) {
        super(buyPrice, sellPrice);
        this.material = material;
        this.thickness = thickness;
    }

    public String getMaterial() {
        return material;
    }

    public double getThickness() {
        return thickness;
    }

    @Override
    public double calculateMarkup() {
        return super.calculateMarkup();
    }
}
