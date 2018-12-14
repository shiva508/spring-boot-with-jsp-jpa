package com.web.ldap.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Entity
@Table
@DiscriminatorColumn(name = "EMP_TYPE")
public class Employee {
	 @Id
	    @GeneratedValue
	    private long id;
	    private String name;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return
	                "id=" + id +
	                        ", name='" + name + '\'';
	    }
	}

