package com.web.ldap.model.entityinheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="worker")
@AttributeOverride( name="createDate", column = @Column(name="std_entry_date") )
public class Worker extends BasicData{
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="age")
	private int age;

	public Worker() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
