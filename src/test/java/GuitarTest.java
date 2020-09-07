import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import otherItems.SheetMusicStand;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar1;

    @Before
    public void before() {

        guitar1 = new Guitar(InstrumentType.STRING,250, 350, "black", "Washburn", 6, "nickel");

    }

    @Test
    public void canGetGuitarColour() {
        assertEquals("black", guitar1.getColour());
    }
    @Test
    public void canGetGuitarBrand() {
        assertEquals("Washburn", guitar1.getBrand());
    }

    @Test
    public void canGetGuitarBuyPrice() {
        assertEquals(250, guitar1.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetGuitarSellPrice() {
        assertEquals(350, guitar1.getSellPrice(), 0.01);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar1.getNumberOfStrings());
    }

    @Test
    public void hasStringType() {
        assertEquals("nickel", guitar1.getStringType());
    }




}
