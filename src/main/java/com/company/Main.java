package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<Customer> customerData = Arrays.asList(
            new Customer("1", "Wayne Enterprises", "10000", "12-01-2021"),
            new Customer("2", "Daily Planet", "-7500", "01-10-2022"),
            new Customer("1", "Wayne Enterprises", "18000", "12-22-2021"),
            new Customer("3", "Ace Chemical", "-48000", "01-10-2022"),
            new Customer("3", "Ace Chemical", "-95000", "12-15-2021"),
            new Customer("1", "Wayne Enterprises", "175000", "01-01-2022"),
            new Customer("1", "Wayne Enterprises", "-35000", "12-09-2021"),
            new Customer("1", "Wayne Enterprises", "-64000", "01-17-2022"),
            new Customer("3", "Ace Chemical", "70000", "12-29-2022"),
            new Customer("2", "Daily Planet", "56000", "12-13-2022"),
            new Customer("2", "Daily Planet", "-33000", "01-07-2022"),
            new Customer("1", "Wayne Enterprises", "10000", "12-01-2021"),
            new Customer("2", "Daily Planet", "33000", "01-17-2022"),
            new Customer("3", "Ace Chemical", "140000", "01-25-2022"),
            new Customer("2", "Daily Planet", "5000", "12-12-2022"),
            new Customer("3", "Ace Chemical", "-82000", "01-03-2022"),
            new Customer("1", "Wayne Enterprises", "10000", "12-01-2021")
    );


    public static void main(String[] args) {
        //Update this
        List<Customer> positiveAccounts = new ArrayList<>();
        List<Customer> negativeAccounts = new ArrayList<>();
        List<Customer> otherAccounts = new ArrayList<>();

        for (Customer c : customerData) {
            if (c.getBalance() > 0) {
                positiveAccounts.add(c);
            } else if (c.getBalance() < 0) {
                negativeAccounts.add(c);
            } else {
                otherAccounts.add(c);
            }
        }

        System.out.println("Positive accounts:");
        for (Customer c : positiveAccounts) {
            System.out.println(c.toString());
        }

        System.out.println("Negative accounts:");
        for (Customer c : negativeAccounts) {
            System.out.println(c.toString());
        }

        System.out.println("Other accounts:");
        for (Customer c : otherAccounts) {
            System.out.println(c.toString());
        }
    }
}
