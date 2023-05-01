package com.acro.netflix;

public class User {
/*user-->account,notifications,mylist
    account-->gmail,password,phone no,billing details*/
    String userName;
    String email;
    String password;
    int PhoneNumber;

    BillingDetails billingDetails;

    public BillingDetails getBillingDetails() {
        return billingDetails;

    }

    public User(String userName, String email, String password, int phoneNumber, BillingDetails billingDetails) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.PhoneNumber = phoneNumber;
        this.billingDetails = billingDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ",planDetails=" + getBillingDetails() +
                '}';
    }
}
