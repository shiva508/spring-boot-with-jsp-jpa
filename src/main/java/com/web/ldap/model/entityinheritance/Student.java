package com.web.ldap.model.entityinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "student_id")
	private Integer studentid;
	private String firstName;
	private String lastName;
	private String className;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", className=" + className + "]";
	}
	
}
