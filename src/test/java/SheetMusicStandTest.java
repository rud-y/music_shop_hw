import org.junit.Before;
import org.junit.Test;
import otherItems.SheetMusicStand;

import static org.junit.Assert.assertEquals;

public class SheetMusicStandTest {

    SheetMusicStand sheetMusicStand;

    @Before
    public void before() {
        sheetMusicStand = new SheetMusicStand(30, 70, "white");
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(30, sheetMusicStand.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(70, sheetMusicStand.getSellPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("white", sheetMusicStand.getColour());
    }
}
