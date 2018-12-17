package com.web.ldap.model.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table
public class Course {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String name;
	@ManyToMany(mappedBy="courses")
	private List<Student> students=new ArrayList<>();
}
