package uk.co.udnydesigns.codingchallenge_shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/11/2016.
 */

public class ItemUnitTest {

    Item item;

    @Before
    public void before()
    {
        item = new Item("Jaffa Cakes", 2.49);
    }

    @Test
    public void testItemSetup()
    {
        assertEquals("Jaffa Cakes", item.getName());
        assertEquals(2.49, item.getPrice(),0.01);
    }



}
