package com.mybatis3.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mybatis3.domain.Course;

public class CourseServiceTest {
    private static CourseService courseService;

    @BeforeClass
    public static void setup() {
        TestDataPopulator.initDatabase();
        courseService = new CourseService();
    }

    @AfterClass
    public static void teardown() {
        courseService = null;
    }


    @Test
    public void selectCoursesByTutor() {
        List<Course> courses = courseService.selectCoursesByTutor(1);
        Assert.assertNotNull(courses);
        for (Course course : courses) {
            Assert.assertNotNull(course);
            System.out.println(course);
        }
    }


    @Test
    public void searchCoursesByType() {
        Map<String, Object> map = new HashMap<String, Object>();
        //map.put("searchBy", "CourseName");
        //map.put("courseName", "%JavaEE6%");
        map.put("searchBy", "Tutor");
        map.put("tutorId", 1);
        List<Course> courses = courseService.searchCoursesByType(map);
        Assert.assertNotNull(courses);
        for (Course course : courses) {
            Assert.assertNotNull(course);
            System.out.println(course);
        }
    }



    @Test
    public void searchCourses() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tutorId", 1);
        //map.put("courseName", "%java%");
        map.put("startDate", new Date());
        List<Course> courses = courseService.searchCourses(map);
        Assert.assertNotNull(courses);
        for (Course course : courses) {
            Assert.assertNotNull(course);
            System.out.println(course);
        }
    }

    @Test
    public void searchCoursesByTutors() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> tutorIds = new ArrayList<Integer>();
        tutorIds.add(1);
        tutorIds.add(2);
        map.put("tutorIds", tutorIds);
        map.put("courseName", "%java%");
        map.put("startDate", new Date());
        List<Course> courses = courseService.searchCoursesByTutors(map);
        Assert.assertNotNull(courses);
        for (Course course : courses) {
            Assert.assertNotNull(course);
            System.out.println(course);
        }
    }
}
