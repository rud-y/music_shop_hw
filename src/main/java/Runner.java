import instruments.Drum;
import instruments.Flute;
import instruments.Guitar;
import instruments.InstrumentType;
import otherItems.GuitarString;

public class Runner {

    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();
        Guitar guitar1 = new Guitar(InstrumentType.STRING,120.00, 210.00,"black", "Martin",  5, "acoustic");
        Guitar guitar2 = new Guitar(InstrumentType.STRING,310, 450,"white", "Seagull",  5, "steel");
//        Drum drum1 = new Drum(InstrumentType.DRUM,240, 380,"white", "Yamaha",  48, "Floor-Tom");
//        Flute flute1 = new Flute(InstrumentType.WOODWIND,25.00, 40.00,"brown", "Signum",  "cane");
//        Flute flute2 = new Flute(InstrumentType.WOODWIND,30.00, 50.00,"black", "Signum",  "oak-wood");
//        GuitarString string1 = new GuitarString(5, 14,  "steel", 0.35);

//        musicShop.addToStock(flute1);
//        musicShop.addToStock(flute2);
        musicShop.addToStock(guitar1);
        musicShop.addToStock(guitar2);
//        musicShop.addToStock(drum1);
//        musicShop.addToStock(drum1);
//        musicShop.addToStock(string1);


//        System.out.println("flute2 markup : " + String.format("%.2f",flute2.calculateMarkup()) + " pounds");
        System.out.println("There is " + musicShop.getStockCount() + " items in shop inventory." );
//
        System.out.println("total potential profit " + musicShop.totalPotentialProfit());


//        double secondItemProfit = musicShop.getProfitsArray().get(3);
//        System.out.println("potential profit for given item is " + secondItemProfit );
    }
}
