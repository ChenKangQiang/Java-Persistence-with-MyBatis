package com.mybatis3.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Siva
 */

@Data
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer courseId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Tutor tutor;
    private List<Student> students;
}
