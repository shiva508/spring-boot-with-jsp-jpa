package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.entityinheritance.EmailNotification;
import com.web.ldap.model.entityinheritance.SmsNotification;

@Repository
public class JoinedTableInheritanceImpl implements JoinedTableInheritance {
	@Autowired
	EntityManager entityManager;

	@Override
	public void sendSme(SmsNotification smsNotification) {
		entityManager.persist(smsNotification);

	}

	@Override
	public void sendEmail(EmailNotification emailNotification) {
		entityManager.persist(emailNotification);
	}

}
