package com.mbe.mapstruct.dto;


public class CustomerDTO {

    private long customerId;
    private String firstName;
    private String lastName;
    private double creditScore;
    private String dateOfBirth;
    private String title;
    private AddressDTO address;
    private String fullName;

    public CustomerDTO() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public CustomerDTO setCustomerId(long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public CustomerDTO setCreditScore(double creditScore) {
        this.creditScore = creditScore;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public CustomerDTO setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CustomerDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public CustomerDTO setAddress(AddressDTO address) {
        this.address = address;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public CustomerDTO setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
}
