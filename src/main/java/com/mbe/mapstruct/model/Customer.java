package com.mbe.mapstruct.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private Title title;
    private LocalDate dateOfBirth;
    private BigDecimal creditScore;
    private CustomerType customerType;
    private Address address;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public Customer setId(long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Title getTitle() {
        return title;
    }

    public Customer setTitle(Title title) {
        this.title = title;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Customer setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public BigDecimal getCreditScore() {
        return creditScore;
    }

    public Customer setCreditScore(BigDecimal creditScore) {
        this.creditScore = creditScore;
        return this;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Customer setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Customer setAddress(Address address) {
        this.address = address;
        return this;
    }
}
