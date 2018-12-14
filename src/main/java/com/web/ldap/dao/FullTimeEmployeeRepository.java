package com.web.ldap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.ldap.model.entityinheritance.FullTimeEmployee;

public interface FullTimeEmployeeRepository extends JpaRepository<FullTimeEmployee, Integer> {

}
