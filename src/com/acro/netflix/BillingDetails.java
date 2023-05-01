package com.acro.netflix;

public class BillingDetails {
    long creditCardNumber;
    String nextBillingDate;
    String planDetails;

    public BillingDetails(long creditCardNumber, String nextBillingDate, String planDetails) {
        this.creditCardNumber = creditCardNumber;
        this.nextBillingDate = nextBillingDate;
        this.planDetails = planDetails;
    }
    public String toString(){
        return planDetails;
    }

}
