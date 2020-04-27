package com.example.kingbase.demo.service;


import com.example.kingbase.demo.domain.Student;
import com.example.kingbase.demo.domain.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


/**
 * @Author: zhoujial
 * @Date: 2019/9/12
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public String addStudent() {
        Student student = new Student();
        UUID uuid = UUID.randomUUID();
        UUID name = UUID.randomUUID();
        student.setId(uuid.toString());
        student.setStudentName(name.toString());
        Student save = studentRepository.save(student);
        return save.getId();
    }

    @Override
    public Student getById(String id) {
        Student one = studentRepository.getOne(id);
        return one;
    }

    @Override
    public List<Student> queryStudentAll() {
        return null;
    }
}
