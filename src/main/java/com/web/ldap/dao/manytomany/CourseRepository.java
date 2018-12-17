package com.web.ldap.dao.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.manytomany.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
