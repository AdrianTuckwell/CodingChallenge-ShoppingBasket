package uk.co.udnydesigns.codingchallenge_shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 21/11/2016.
 */

public class Basket
{
    private ArrayList<Item> basket;
    private Customer customer;


    public Basket(Customer customer)
    {
        this.basket = new ArrayList<Item>();
        this.customer = customer;
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
        Double total1 = 0.0;
        Double total2 = 0.0;

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

            total1 = (subtotal/100.0)*90.0;
        }
        else
        {
            total1 = subtotal;
        }

        // customer has discount card 2%
        if (customer.getCard()){

            total2 = (total1/100.0)*98.0;
        }
        else
        {
            total2 = total1;
        }

        return total2;
    }





}

