package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeTest<T> {
	@Autowired
	EntityManager entityManager;

	public void save(T t) {
		entityManager.persist(t);
	}
}
