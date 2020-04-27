package com.example.kingbase.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 学生表dao
 *
 * @author zhoujial
 * @date 2019-09-11
 */

public interface StudentRepository
        extends JpaRepository<Student, String>, JpaSpecificationExecutor<Student>, PagingAndSortingRepository<Student, String> {


}
