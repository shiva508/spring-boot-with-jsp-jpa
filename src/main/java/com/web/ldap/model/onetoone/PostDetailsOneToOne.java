package com.web.ldap.model.onetoone;

import java.util.Date;

import javax.persistence.Column;
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
public class PostDetailsOneToOne {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "created_on")
    private Date createdOn;
 
    @Column(name = "created_by")
    private String createdBy;
    @OneToOne(fetch=FetchType.LAZY)
  
    private PostOneToOne postOneToOne;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public PostOneToOne getPostOneToOne() {
		return postOneToOne;
	}
	public void setPostOneToOne(PostOneToOne postOneToOne) {
		this.postOneToOne = postOneToOne;
	}
    
}
