package otherItems;

public class DrumStick extends Goods {

    private String material;

    public DrumStick(double buyPrice, double sellPrice, String material) {
        super(buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }



}
