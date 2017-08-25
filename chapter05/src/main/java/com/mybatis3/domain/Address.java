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
}
