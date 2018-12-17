package com.web.ldap.model.embeddedId;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class StudentembeddedId implements Serializable{
@EmbeddedId
@AttributeOverride(name="firstName", column= @Column(name="f_name"))
	private Person id;
@Column(name="location")
private String location;
public Person getId() {
	return id;
}
public void setId(Person id) {
	this.id = id;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
