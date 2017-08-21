package com.mybatis3.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Siva
 */

@Data
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer addrId;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address() {
    }

    public Address(Integer addrId) {
        this.addrId = addrId;
    }

    public Address(Integer addrId, String street, String city, String state,
                   String zip, String country) {
        this.addrId = addrId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
}
