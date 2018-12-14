package com.web.ldap.model.entityinheritance;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class PostComment extends BaseEntity{
	@ManyToOne
	 private Post post;
}
