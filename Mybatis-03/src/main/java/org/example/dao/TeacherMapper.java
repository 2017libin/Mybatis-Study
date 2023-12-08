package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Teacher;

public interface TeacherMapper {

    // 获取老师
    // List<Teacher> getTeacher();

    // 获取指定老师下的所有的学生及老师信息
    Teacher getTeacher(@Param("tid") int id);
}