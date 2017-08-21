package com.mybatis3.domain;

import java.util.Date;

import lombok.Data;
import org.apache.ibatis.type.Alias;


/**
 * @author Siva
 */
@Alias("Student")
@Data
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
}
