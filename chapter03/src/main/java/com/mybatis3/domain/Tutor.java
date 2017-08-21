package com.mybatis3.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Siva
 */

@Data
public class Tutor implements Serializable {
    private static final long serialVersionUID = 510924914981749811L;

    private Integer tutorId;
    private String name;
    private String email;
    private Address address;
    private List<Course> courses;
}
