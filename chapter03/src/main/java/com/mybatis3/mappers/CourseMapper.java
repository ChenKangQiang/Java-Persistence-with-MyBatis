package com.mybatis3.mappers;

import java.util.List;
import java.util.Map;

import com.mybatis3.domain.Course;


/**
 * @author Siva
 */
public interface CourseMapper {

    /**
     * 根据教授的tutorId查询课程
     * @param tutorId
     * @return
     */
    List<Course> selectCoursesByTutor(int tutorId);

    /**
     * 根据查询条件动态查询课程
     * @param map
     * @return
     */
    List<Course> searchCourses(Map<String, Object> map);

    /**
     * 根据查询类别动态查询课程
     * @param map
     * @return
     */
    List<Course> searchCoursesByType(Map<String, Object> map);

    /**
     *
     * @param map
     * @return
     */
    List<Course> searchCoursesByTutors(Map<String, Object> map);

}
