package com.web.ldap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ldap.dao.JoinedTableInheritance;
import com.web.ldap.model.entityinheritance.EmailNotification;
import com.web.ldap.model.entityinheritance.SmsNotification;

@Service
public class JoinedTableInheritanceServiceImpl implements JoinedTableInheritanceService {
	@Autowired
	JoinedTableInheritance joinedTableInheritance;

	@Override
	@Transactional
	public void sendSme(SmsNotification smsNotification) {
		joinedTableInheritance.sendSme(smsNotification);

	}

	@Override
	@Transactional
	public void sendEmail(EmailNotification emailNotification) {
		joinedTableInheritance.sendEmail(emailNotification);

	}

}
