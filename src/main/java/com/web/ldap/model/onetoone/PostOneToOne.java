package com.web.ldap.model.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class PostOneToOne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String title;
@OneToOne(mappedBy="postOneToOne",cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=false)
private PostDetailsOneToOne detailsOneToOne;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public PostDetailsOneToOne getDetailsOneToOne() {
	return detailsOneToOne;
}
public void setDetailsOneToOne(PostDetailsOneToOne detailsOneToOne) {
	this.detailsOneToOne = detailsOneToOne;
}
public void addPostDetailsOneToOne(PostDetailsOneToOne detailsOneToOne) {
	this.detailsOneToOne=detailsOneToOne;
	detailsOneToOne.setPostOneToOne(this);
}

}
