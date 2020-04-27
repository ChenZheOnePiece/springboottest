package com.example.kingbase.demo.api;

import com.example.kingbase.demo.domain.Student;
import com.example.kingbase.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: StudentRestController
 *
 * @Deprecated: 学生Controller
 * @Author: zhoujial
 * @Date: 2019/9/11
 **/
@RestController
public class StudentRestController {

    private static final Logger log = LoggerFactory.getLogger(StudentRestController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudent() {
        String s = studentService.addStudent();
        return s;
    }


    @GetMapping(value = "/getStudent")
    public String queryStudentAll(String id) {
        Student byId = studentService.getById(id);
        return byId.getId();
    }
    @GetMapping(value = "/test")
    public String test() {
        return "Hello World";
    }



}
