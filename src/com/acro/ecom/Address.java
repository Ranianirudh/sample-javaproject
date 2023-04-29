package com.acro.ecom;

public class Address {
    String streetName;
    int houseNumber;
    int zipCode;
    String city;
    String state;
    String country;

    public Address(String streetName, int houseNumber, int zipCode, String city, String state, String country) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
