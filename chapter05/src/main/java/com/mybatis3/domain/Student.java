package com.mybatis3.domain;

import lombok.Data;

import java.io.Serializable;


/**
 * @author Siva
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer studId;
    private String name;
    private String email;
    private PhoneNumber phone;
    private Address address;
}
