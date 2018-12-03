package com.web.ldap.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
@NamedQueries({
		@NamedQuery(name = "UserModel.findByLanguagess", query = "SELECT U FROM UserModel U where U.language=?1")
		/*@NamedQuery(name="UserModel.findByUserNameAndLanguage",query="SELECT U FROM UserModel U where U.userName=?1 AND U.language=?2")*/
																												
})
@NamedStoredProcedureQuery(name="UserModel.plus1",procedureName="plus1inout",parameters= {
		@StoredProcedureParameter(mode=ParameterMode.IN,name="arg",type=Integer.class),
		@StoredProcedureParameter(mode=ParameterMode.OUT,name="res",type=Integer.class)
})
// @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer id;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "EMAIL")
	private String emailAddress;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "ABOUT_YOURSELF", columnDefinition = "TEXT")
	private String aboutYourSelf;
	/* USING MAP */
	/* @OneToMany(cascade=CascadeType.ALL) */
	/* USING JOIN TABLE-UNIDIRECTIONAL */
	/*
	 * @OneToMany(cascade=CascadeType.ALL)
	 * 
	 * @JoinTable(name="USER_MODEL_USER_ADDRESS",joinColumns=@JoinColumn(name=
	 * "USER_ID"),inverseJoinColumns=@JoinColumn(name="ADDRESS_ID"))
	 */
	// @OneToMany(targetEntity=PhoneNumber.class,cascade=
	// {CascadeType.ALL},mappedBy="userModel",fetch=FetchType.EAGER,orphanRemoval=true)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "userModel")
	private List<PhoneNumber> phoneNumbers;
	@Transient
	private List<PhoneNumber> dummayList;

	public UserModel() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAboutYourSelf() {
		return aboutYourSelf;
	}

	public void setAboutYourSelf(String aboutYourSelf) {
		this.aboutYourSelf = aboutYourSelf;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		if (phoneNumbers == null) {
			phoneNumbers = new ArrayList<>();
		}
		return phoneNumbers;
	}

	public void addPhoneNumbers(PhoneNumber phoneNumber) {

		getPhoneNumbers().add(phoneNumber);
		phoneNumber.setUserModel(this);
		/* phoneNumbers.add(phoneNumber); */

	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		
			this.phoneNumbers = phoneNumbers;
	}

	

	public List<PhoneNumber> getDummayList() {
		if (dummayList == null) {
			dummayList = new ArrayList<>();
		}
		return dummayList;
	}

	public void setDummayList(List<PhoneNumber> dummayList) {
		this.dummayList = dummayList;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", emailAddress=" + emailAddress + ", language="
				+ language + ", aboutYourSelf=" + aboutYourSelf + ", phoneNumbers=" + phoneNumbers + ", dummayList="
				+ dummayList + "]";
	}
}
