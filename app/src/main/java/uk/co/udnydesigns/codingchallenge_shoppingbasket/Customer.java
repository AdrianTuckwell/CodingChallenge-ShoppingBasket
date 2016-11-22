package uk.co.udnydesigns.codingchallenge_shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Customer {

    private String name;
    private Boolean card;


    public Customer(String name, Boolean card)
    {
        this.name = name;
        this.card = card;
    }

    public String getName()
    {
        return this.name;
    }

    public Boolean getCard()
    {
        return this.card;
    }

}
