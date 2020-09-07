import behaviours.ISell;
import instruments.Drum;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import otherItems.SheetMusicStand;

import static org.junit.Assert.assertEquals;


public class MusicShopTest {

    private MusicShop musicShop;
    private ISell guitar1;
    private ISell sheetMusicStand1;
    private Drum drum1;

    @Before
    public void before() {
        musicShop = new MusicShop();
        guitar1 = new Guitar(250.00, 350.00,"black", "Washburn",  6, "nickel");
        sheetMusicStand1 = new SheetMusicStand(30.00, 50.00, "blue");
        drum1 = new Drum(255.00, 425.00,"grey", "Tama",  45,"Hi-Hat");
    }

    @Test
    public void canAddItem() {
        musicShop.addToStock(guitar1);
        musicShop.addToStock(sheetMusicStand1);
        assertEquals(2, musicShop.getStockCount());
    }

    @Test
    public void canRemoveItem() {
        musicShop.addToStock(guitar1);
        musicShop.addToStock(sheetMusicStand1);
        musicShop.removeItem(sheetMusicStand1);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canCreateArrayListOfIndividualProfits() {
        musicShop.addToStock(drum1);
        musicShop.addToStock(guitar1);
        musicShop.addToStock(sheetMusicStand1);
        assertEquals(3, musicShop.getProfitsArray().size());
    }

    @Test
    public void  canCalculateTotalPotentialProfit() {
        musicShop.addToStock(drum1);
        musicShop.addToStock(guitar1);
        musicShop.addToStock(sheetMusicStand1);
        musicShop.getProfitsArray();
        double profit = musicShop.totalPotentialProfit();
        assertEquals(290.00, profit, 0.01);
    }


}
