package com.nttdata.e2e.screenplay.model;

public class BuyerInfo {

    private String firstName;
    private String lastName;
    private String zipCode;

    public BuyerInfo() {}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
}
