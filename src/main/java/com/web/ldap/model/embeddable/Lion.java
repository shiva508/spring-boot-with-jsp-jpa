package com.web.ldap.model.embeddable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lion")
public class Lion {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Embedded
	private Animal animal;
	
	public Lion() {
		super();
	}
	public Lion(int id,Animal animal){
		this.id=id;
		this.animal=animal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@Override
	public String toString() {
		return "Lion [id=" + id + ", name=" + animal.getName() + ", location=" + animal.getLocation() + "]";
	}
	
} 