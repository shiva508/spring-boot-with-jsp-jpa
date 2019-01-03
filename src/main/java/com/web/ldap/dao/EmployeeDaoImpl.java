package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.entityinheritance.ContractEmployee;
import com.web.ldap.model.entityinheritance.FullTimeEmployee;
import com.web.ldap.model.entityinheritance.PartTimeEmployee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePart(PartTimeEmployee employee) {
		entityManager.persist(employee);

	}

	@Override
	public void saveFull(FullTimeEmployee employee) {
		entityManager.persist(employee);
	}

	@Override
	public void saveContr(ContractEmployee employee) {
		entityManager.persist(employee);
	}

}
