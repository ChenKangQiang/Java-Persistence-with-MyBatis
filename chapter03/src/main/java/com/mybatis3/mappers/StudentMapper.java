package com.mybatis3.mappers;

import java.util.List;
import java.util.Map;

import com.mybatis3.domain.Student;
import org.apache.ibatis.annotations.MapKey;


/**
 * @author Siva
 */
public interface StudentMapper {

    List<Student> findAllStudents();

    /**
     * 以map形式返回所有对象
     * @return
     */
    @MapKey("studId")
    Map<Integer, Student> getMapOfAllStudents();


    Student findStudentById(Integer id);

    Student selectStudentWithAddress(int id);

    void insertStudent(Student student);

    void insertStudentWithMap(Map<String, Object> map);

    void updateStudent(Student student);

    int deleteStudent(int id);

}
