package com.web.ldap.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Iinstrucror_details")
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class InstrucrorDetails {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instrucror_details_id")
	private Integer Id;
	@Column(name = "youtube_channel")
	private String youtubeChannel;
	@Column(name = "hobby")
	private String hobby;
	//for bidirectional
	//@OneToOne(mappedBy="instrucrorDetails",cascade=CascadeType.ALL)
	//delete only InstrucrorDetails
	@OneToOne(mappedBy="instrucrorDetails",cascade= {CascadeType.DETACH,
													CascadeType.MERGE,
													CascadeType.PERSIST,
													CascadeType.REFRESH})
	private Instrucror instrucror;
	public Instrucror getInstrucror() {
		return instrucror;
	}
	public void setInstrucror(Instrucror instrucror) {
		this.instrucror = instrucror;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getYoutubeChannel() {
		return youtubeChannel;
	}
	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "InstrucrorDetails [Id=" + Id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
	
	
	
}
