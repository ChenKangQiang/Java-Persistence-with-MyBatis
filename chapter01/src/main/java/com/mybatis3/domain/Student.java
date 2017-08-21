package com.mybatis3.domain;

import lombok.Data;

import java.util.Date;


/**
 * @author Siva
 */

@Data
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
}
