package com.example.kingbase.demo.domain;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 学生管理实体类
 * @Author: zhoujial
 * @Date: 2019/9/11
 **/
@Entity
@DynamicUpdate
@Table(name="student_info")
public class Student  implements Serializable{

    private static final long serialVersionUID = 7578292815541249813L;

    @Id
    @Column(name = "id")
    private String id;
    /**
     * 参数名称
     */
    @Column(name="student_name")
    private String studentName;



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
