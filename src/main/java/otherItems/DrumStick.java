package otherItems;

public class DrumStick extends OtherItem {

    private String material;

    public DrumStick(double buyPrice, double sellPrice, String material) {
        super(buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double calculateMarkup() {
        return super.calculateMarkup();
    }


}
