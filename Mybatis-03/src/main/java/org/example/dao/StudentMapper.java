package org.example.dao;

import org.example.pojo.Student;

import java.util.List;

public interface StudentMapper {
    // 查询所有的学生的信息，以及对应老师的信息
    public List<Student> getStudent();

}