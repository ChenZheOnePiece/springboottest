package com.example.kingbase.demo.service;


import com.example.kingbase.demo.domain.Student;

import java.util.List;


/**学生管理
 * @author：zhoujial
 * @date: 2019/9/12
 */
public interface StudentService {

    String addStudent();

    Student getById(String id);
    List<Student> queryStudentAll();
}
