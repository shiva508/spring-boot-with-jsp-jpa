package com.web.ldap.model.entityinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sms_notification")
@PrimaryKeyJoinColumn(name="smsNotification_id",referencedColumnName="notification_id")
public class SmsNotification extends Notification {
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "SmsNotification [phoneNumber=" + phoneNumber + "]";
	}

}
