package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    public CustomerTest() {
        customer = new Customer(1,"John Doe");
        customer.addCharge(new AccountRecord(1000,"11-01-2022"));
        customer.addCharge(new AccountRecord(2000,"12-01-2022"));
    }

    @Test
    public void getBalance() {
        assertEquals(customer.getBalance(),3000);
    }

    @Test
    public void testToString() {
        String value = "{ ID: 1, Name: John Doe, Balance: 3000 }";

        assertEquals(customer.toString(),value);
    }
}