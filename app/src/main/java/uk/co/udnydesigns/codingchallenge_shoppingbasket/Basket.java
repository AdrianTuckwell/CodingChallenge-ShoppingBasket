package uk.co.udnydesigns.codingchallenge_shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 21/11/2016.
 */

public class Basket
{
    private ArrayList<Item> basket;


    public Basket()
    {
        this.basket = new ArrayList<Item>();
    }

    public void addItem(Item item)
    {
        this.basket.add(item);
    }

    public void removeItem(Item item)
    {
        this.basket.remove(item);
    }

    public void emptyBasket()
    {
        this.basket.clear();
    }

    public int countItems()
    {
        return basket.size();
    }

    public Double value()
    {
        Double total = 0.0;

        for (Item item: this.basket)
        {
            total += item.getPrice();
        }

        return total;
    }

}
