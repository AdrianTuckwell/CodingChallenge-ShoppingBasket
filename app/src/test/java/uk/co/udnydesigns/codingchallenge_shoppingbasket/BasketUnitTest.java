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
    Basket basket2;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Item item5;
    Customer customer1;
    Customer customer2;

    @Before
    public void before()
    {
        customer1 = new Customer("Kyle", false);
        customer2 = new Customer("Tom", true);
        basket = new Basket(customer1);
        basket2 = new Basket(customer2);
        item1 = new Item("Jaffa Cakes", 2.49);
        item2 = new Item("Milk", 0.69);
        item3 = new Item("Chicken", 5.49);
        item4 = new Item("meal for one", 100.00);
        item5 = new Item("eggs", 10.00);

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

    @Test
    public void testBogOffplusOne()
    {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(5, basket.countItems());
        assertEquals(11.16, basket.value(),0.01);
    }

    @Test
    public void testTenPercentDiscount()
    {
        basket.addItem(item4);
        assertEquals(90.00, basket.value(),0.01);
    }

    @Test
    public void testTwoPercentDiscount()
    {
        basket2.addItem(item5);
        assertEquals(9.80, basket2.value(),0.01);
    }
}
