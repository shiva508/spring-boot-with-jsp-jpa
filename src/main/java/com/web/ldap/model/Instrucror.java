package com.web.ldap.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "instrucror")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Instrucror {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instrucror_id")
	private Integer Id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	//uni directional
	@OneToOne(cascade=CascadeType.ALL)
	/*@OneToOne(cascade={CascadeType.DETACH,
						CascadeType.PERSIST,
						CascadeType.REFRESH,
						CascadeType.MERGE,
						CascadeType.REMOVE})*/
	@JoinColumn(name = "instrucror_details_id")
	private InstrucrorDetails instrucrorDetails;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InstrucrorDetails getInstrucrorDetails() {
		return instrucrorDetails;
	}
	public void setInstrucrorDetails(InstrucrorDetails instrucrorDetails) {
		this.instrucrorDetails = instrucrorDetails;
	}
	@Override
	public String toString() {
		return "Instrucror [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instrucrorDetails=" + instrucrorDetails + "]";
	}
	

}
