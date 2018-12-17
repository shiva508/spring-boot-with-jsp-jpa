package com.web.ldap.model.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String name;
	@ManyToMany
	@JoinTable(name="STUDENT_COURCE",
	joinColumns=@JoinColumn(name="STUDENT_ID"),inverseJoinColumns=@JoinColumn(name="COURSE_ID"))
	private List<Course> courses=new ArrayList<>();
}
