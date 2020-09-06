import behaviours.IPlay;
import behaviours.ISell;
import instruments.Instrument;
import otherItems.Goods;

import java.lang.reflect.Array;
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

    public ISell removeItem(ISell item) {
        int index = stock.indexOf(item);
        ISell removed = this.stock.remove(index);
        return removed;
    }

    public ArrayList<Double> getProfitsArray() {
        ArrayList<Double> profits = new ArrayList<Double>();
        for(ISell item: stock){
            profits.add(item.calculateMarkup());
        }
        return profits;
    }

//    public double totalPotentialProfit() {
//
//    }
}
