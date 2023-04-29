package com.acro.ecom;

public class User{
    //UID, Username, Password, Admin
    int userId;
    String userName;
    String firstName;
    String lastName;
    int phoneNumber;
    Address address;

    public User(int userId, String userName, String firstName, String lastName, int phoneNumber, Address address) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
