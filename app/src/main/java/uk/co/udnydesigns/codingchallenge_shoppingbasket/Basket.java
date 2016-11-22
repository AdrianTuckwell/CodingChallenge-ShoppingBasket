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
        Double subtotal = 0.0;
        Double total = 0.0;
        String bogoff= "";

        for (Item item: this.basket)
        {
           if (bogoff == item.getName())
            {
                //if bogoff is the same as last item reset
                bogoff = "";

            } else
            {
                //Store the name of the item
                bogoff = item.getName();
                subtotal += item.getPrice();
            }
        }

        // if total greater than 20 give 10%
        if (subtotal >= 20.00){

            total = (subtotal/100.0)*90.0;
        } else
        {
            total = subtotal;
        }

        return total;
    }





}

