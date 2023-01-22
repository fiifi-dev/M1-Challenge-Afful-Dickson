package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public Customer(String id, String name, String charge, String chargeDate) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.charges.add(new AccountRecord(Integer.parseInt(charge), chargeDate));
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        int total = 0;
        for (AccountRecord ac :
                charges) {
            total += ac.getCharge();
        }
        return total;
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        //update this
        return "{ ID: " + getId() + " Name: " + getName() + " Balance: " + getBalance() + " }";
    }
}
