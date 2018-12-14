package com.web.ldap.service;

import com.web.ldap.model.ContractEmployee;
import com.web.ldap.model.FullTimeEmployee;
import com.web.ldap.model.PartTimeEmployee;

public interface EmployeeService {
	public void savePart(PartTimeEmployee employee);
	public void saveFull(FullTimeEmployee employee);
	public void saveContr(ContractEmployee employee);
}
