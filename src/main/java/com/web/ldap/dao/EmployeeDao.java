package com.web.ldap.dao;

import com.web.ldap.model.entityinheritance.ContractEmployee;
import com.web.ldap.model.entityinheritance.FullTimeEmployee;
import com.web.ldap.model.entityinheritance.PartTimeEmployee;

public interface EmployeeDao {
public void savePart(PartTimeEmployee employee);
public void saveFull(FullTimeEmployee employee);
public void saveContr(ContractEmployee employee);
}
