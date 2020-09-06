import instruments.Drum;
import instruments.Flute;
import instruments.Guitar;
import otherItems.GuitarString;

public class Runner {

    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();
        Guitar guitar1 = new Guitar(120.00, 210.00,"black", "Martin",  5, "acoustic");
        Guitar guitar2 = new Guitar(310, 450,"white", "Seagull",  5, "steel");
        Drum drum1 = new Drum(240, 380,"white", "Yamaha",  48, "Floor-Tom");

        Flute flute1 = new Flute(25.00, 40.00,"brown", "Signum",  "cane");
        Flute flute2 = new Flute(30.00, 50.00,"black", "Signum",  "oak-wood");
        Flute flute3 = new Flute(30.00, 50.00,"white", "Signum",  "oak-wood");
        Flute flute4 = new Flute(25.00, 40.00,"pink", "Signum",  "plastic");

        GuitarString string1 = new GuitarString(5, 14,  "steel", 0.35);

        musicShop.addToStock(flute1);
        musicShop.addToStock(flute2);
        musicShop.addToStock(flute3);
        musicShop.addToStock(flute4);
        musicShop.addToStock(guitar1);
        musicShop.addToStock(guitar2);
        musicShop.addToStock(drum1);
        musicShop.addToStock(drum1);
        musicShop.addToStock(string1);
        System.out.println("There is " + musicShop.getStockCount() + " items in shop inventory." );
        System.out.println("drum1 does " + drum1.play());

        System.out.println("Guitar1 markup " + String.format("%.2f",guitar1.calculateMarkup()) + " %.");
        System.out.println("string1 thickness: "  + string1.getThickness());



        //Average markup for all shop items?
//        double buy1 = 30;
//        double sell1 = 38;
//        double buy2 = 42;
//        double sell2 = 57;
//        double buy3 = 39;
//        double sell3 = 45;
//        double resultOne = (sell1 / buy1 * 100) - 100;
//        double resultTwo = (sell2 / buy2 * 100) - 100;
//        double resultThree = (sell3 / buy3 * 100) - 100;
//
//        System.out.println(resultOne + " - " + resultTwo + " - " + resultThree);
//        double average = (resultOne+resultTwo+resultThree) / 3;
//        System.out.println(String.format("%.2f", average));


    }
}
