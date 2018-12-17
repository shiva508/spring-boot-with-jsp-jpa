package com.web.ldap.dao.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.manytomany.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
