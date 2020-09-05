
import behaviours.IPlay;
import behaviours.ISell;
import instruments.Instrument;
import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private ArrayList<IPlay> instruments;

    public MusicShop() {
        this.stock = new ArrayList<ISell>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }




}