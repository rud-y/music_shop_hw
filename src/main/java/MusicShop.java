import behaviours.IPlay;
import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop() {
        this.stock = new ArrayList<ISell>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void getStockList() {
        for(ISell item : stock) {
               item.calculateMarkup();
        }
    }

    public void addToStock(ISell item) {

        stock.add(item);
    }

}