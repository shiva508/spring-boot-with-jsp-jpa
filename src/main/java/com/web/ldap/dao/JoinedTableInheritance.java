package com.web.ldap.dao;

import com.web.ldap.model.entityinheritance.EmailNotification;
import com.web.ldap.model.entityinheritance.SmsNotification;

public interface JoinedTableInheritance {
public void sendSme(SmsNotification smsNotification);
public void sendEmail(EmailNotification emailNotification);
}
