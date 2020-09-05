import behaviours.ISell;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import otherItems.SheetMusicStand;

import static org.junit.Assert.assertEquals;


public class MusicShopTest {

    private MusicShop musicShop;
    private ISell guitar1;
    private ISell sheetMusicStand1;

    @Before
    public void before() {
        musicShop = new MusicShop();
        guitar1 = new Guitar("black", "Washburn", 250, 350, 6, "nickel");
        sheetMusicStand1 = new SheetMusicStand(30, 50, "blue", "birchwood");
    }

    @Test
    public void canAddItem() {
        musicShop.addToStock(guitar1);
        musicShop.addToStock(sheetMusicStand1);
        assertEquals(2, musicShop.getStockCount());
    }


}
