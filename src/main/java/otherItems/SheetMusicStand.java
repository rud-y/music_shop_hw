package otherItems;

import behaviours.ISell;

public class SheetMusicStand extends OtherItem {

    private String colour;
    private String material;


    public SheetMusicStand(double buyPrice, double sellPrice, String colour, String material) {
        super(buyPrice, sellPrice);
        this.colour = colour;
        this.material = material;
    }

    @Override
    public double calculateMarkup() {
        return super.calculateMarkup();
    }


}
