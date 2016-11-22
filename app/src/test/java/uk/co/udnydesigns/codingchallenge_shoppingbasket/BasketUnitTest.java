package uk.co.udnydesigns.codingchallenge_shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/11/2016.
 */

public class BasketUnitTest
{

    Basket basket;
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before()
    {
        basket = new Basket();
        item1 = new Item("Jaffa Cakes", 2.49);
        item2 = new Item("Milk", 0.69);
        item3 = new Item("Chicken", 5.49);
    }

    @Test
    public void testAddItemToBasket()
    {
        basket.addItem(item1);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testRemoveItemFromBasket()
    {
        basket.addItem(item1);
        basket.addItem(item2);
        assertEquals(2, basket.countItems());
        basket.removeItem(item1);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testEmptyBasket()
    {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(3, basket.countItems());
        basket.emptyBasket();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testTotalBasketPrice()
    {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(3, basket.countItems());
        assertEquals(8.67, basket.value(),0.01);
    }

    @Test
    public void testBogOff()
    {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(4, basket.countItems());
        assertEquals(8.67, basket.value(),0.01);
    }


}
