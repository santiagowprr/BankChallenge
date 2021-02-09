package com.santiago;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public Customer addCustomer(String customerName, double initialTransaction){
        Customer customer = new Customer(customerName,initialTransaction);
        return customer;
    }

    public boolean addNewTransactionToCst(String customerName, double customersTransaction){
        if (this.customers.indexOf(customerName))
    }
}
