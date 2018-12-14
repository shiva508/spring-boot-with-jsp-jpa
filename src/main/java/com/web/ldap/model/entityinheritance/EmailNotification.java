package com.web.ldap.model.entityinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "email_notification")
@PrimaryKeyJoinColumn(name="emailNotification_id",referencedColumnName="notification_id")
public class EmailNotification extends Notification {
	@Column(name = "email_address", nullable = false)
	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "EmailNotification [emailAddress=" + emailAddress + "]";
	}
	
}
