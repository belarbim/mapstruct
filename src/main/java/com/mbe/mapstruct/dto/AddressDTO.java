package com.mbe.mapstruct.dto;

public class AddressDTO {

    private long id;
    private String streetName;
    private String town;
    private String country;
    private String postCode;

    public AddressDTO() {
    }

    public long getId() {
        return id;
    }

    public AddressDTO setId(long id) {
        this.id = id;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public AddressDTO setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getTown() {
        return town;
    }

    public AddressDTO setTown(String town) {
        this.town = town;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressDTO setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public AddressDTO setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
}
