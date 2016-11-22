package uk.co.udnydesigns.codingchallenge_shoppingbasket;

/**
 * Created by user on 21/11/2016.
 */

public class Item {

    private String name;
    private Double price;

    public Item(String name, Double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return this.name;
    }

    public Double getPrice()
    {
        return this.price;
    }


}
