package com.web.ldap.dao;

import com.web.ldap.model.entityinheritance.Notification;

public interface NotificationSender<T> {
public  Class<T>  appliesTo();
public  void send(T t);
}
