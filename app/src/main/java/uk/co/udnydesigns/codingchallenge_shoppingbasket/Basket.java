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

    // remove 20% discount if > £20
    public  Double discount(Double subtotal)
    {
        Double result = 0.0;
        if (subtotal >= 20.00){

            result = (subtotal/100.0)*90.0;
        }
        else
        {
            result = subtotal;
        }
        return result;
    }


    public Double loyaltyCard (Double subtotal)
    {
        Double result = 0.0;
        if (customer.getCard()){

            result = (subtotal/100.0)*98.0;
        }
        else
        {
            result = subtotal;
        }
        return result;
    }


    public Double bogof (Double subtotal)
    {
        Double result = 0.0;
        String bogof= "";

        for (Item item: this.basket)
        {
            if (bogof == item.getName())
            {
                //if bogof is the same as last item reset
                bogof = "";

            } else
            {
                //Store the name of the item
                bogof = item.getName();
                result += item.getPrice();
            }
        }
        return result;
    }

    // sum basket and apply bogof and 20% discount and loyalty card
    public Double value()
    {
        Double subtotal = 0.0;
        // sum basket and check for bogof
        subtotal= bogof(subtotal);
        // remove 20% discount if > £20
        subtotal = discount(subtotal);
        // remove loyalty discount if customer has loyalty card
        subtotal = loyaltyCard(subtotal);

        return subtotal;
    }
}

