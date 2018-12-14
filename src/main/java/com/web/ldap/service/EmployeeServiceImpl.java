package com.web.ldap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ldap.dao.EmployeeDao;
import com.web.ldap.model.ContractEmployee;
import com.web.ldap.model.FullTimeEmployee;
import com.web.ldap.model.PartTimeEmployee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	@Transactional
	@Override
	public void savePart(PartTimeEmployee employee) {
		employeeDao.savePart(employee);

	}

	@Transactional
	@Override
	public void saveFull(FullTimeEmployee employee) {
		employeeDao.saveFull(employee);

	}

	@Transactional
	@Override
	public void saveContr(ContractEmployee employee) {
		employeeDao.saveContr(employee);

	}

}
