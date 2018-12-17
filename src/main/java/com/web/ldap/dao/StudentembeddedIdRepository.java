package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.embeddedId.StudentembeddedId;
@Repository
public interface StudentembeddedIdRepository extends JpaRepository<StudentembeddedId, Integer> {

}
