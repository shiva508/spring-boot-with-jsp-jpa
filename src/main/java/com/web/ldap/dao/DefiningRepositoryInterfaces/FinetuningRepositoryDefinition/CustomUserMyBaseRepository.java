package com.web.ldap.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition;

import com.web.ldap.model.UserModel;
public interface CustomUserMyBaseRepository extends MyBaseRepository<UserModel, Integer>{
		UserModel findByEmailAddress(String emailAddress);

}
