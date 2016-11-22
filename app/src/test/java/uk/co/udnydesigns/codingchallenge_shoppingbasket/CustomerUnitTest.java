package uk.co.udnydesigns.codingchallenge_shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class CustomerUnitTest {

    Customer customer;

    @Before
    public void before()
    {
        customer = new Customer("Tom", true);
    }

    @Test
    public void testCustomerSetup()
    {
        assertEquals("Tom", customer.getName());
        assertEquals(true, customer.getCard());
    }



}
