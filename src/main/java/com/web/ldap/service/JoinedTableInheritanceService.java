package com.web.ldap.service;

import com.web.ldap.model.entityinheritance.EmailNotification;
import com.web.ldap.model.entityinheritance.SmsNotification;

public interface JoinedTableInheritanceService {
	public void sendSme(SmsNotification smsNotification);
	public void sendEmail(EmailNotification emailNotification);
}
