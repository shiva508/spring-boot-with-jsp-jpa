package com.web.ldap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "USER_ADDRESS")
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Integer addressId;
	@Column(name = "MOBILE_NUMBER_TYPE")
	private String mobileNumberType;
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;
	@ManyToOne
	@JoinColumn(name="USER_ID",nullable=false)
	@JsonBackReference
	private UserModel userModel;
	
	public PhoneNumber() {
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getMobileNumberType() {
		return mobileNumberType;
	}

	public void setMobileNumberType(String mobileNumberType) {
		this.mobileNumberType = mobileNumberType;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	@Override
	public String toString() {
		return "PhoneNumber [addressId=" + addressId + ", mobileNumberType=" + mobileNumberType + ", mobileNumber="
				+ mobileNumber + "]";
	}
}
