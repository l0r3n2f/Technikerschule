/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.lf;

/**
 *
 * @author lorenz
 */
public class Person {

    protected int customer_ID;
    protected String customer_Firstname;
    protected String customer_Lastname;

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_Firstname() {
        return customer_Firstname;
    }

    public void setCustomer_Firstname(String customer_Firstname) {
        this.customer_Firstname = customer_Firstname;
    }

    public String getCustomer_Lastname() {
        return customer_Lastname;
    }

    public void setCustomer_Lastname(String customer_Lastname) {
        this.customer_Lastname = customer_Lastname;
    }

    @Override
    public String toString() {
        return " " + String.valueOf(customer_ID) + ": " + String.valueOf(customer_Firstname) + " " + String.valueOf(customer_Lastname);

    }

}
