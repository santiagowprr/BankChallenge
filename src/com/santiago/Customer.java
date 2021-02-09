package com.santiago;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public boolean addTransaction(double transaction){
        this.transactions.add(transaction);
        return true;
    }
}

