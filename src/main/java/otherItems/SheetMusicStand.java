package otherItems;


public class SheetMusicStand extends Goods {

    private String colour;


    public SheetMusicStand(double buyPrice, double sellPrice, String colour) {
        super(buyPrice, sellPrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
