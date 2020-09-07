package otherItems;

public class GuitarString extends Goods {
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


}
