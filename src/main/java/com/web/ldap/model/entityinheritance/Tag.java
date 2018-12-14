package com.web.ldap.model.entityinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity(name = "Tag")
@Table(name = "tag")
public class Tag extends BaseEntity{
	@NaturalId
    private String name;

	public Tag() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
