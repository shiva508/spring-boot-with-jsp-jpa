package com.web.ldap.model.entityinheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Post extends BaseEntity{
	private String title;
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.LAZY,mappedBy="post")
	private List<PostComment> comments=new ArrayList<>();
	@OneToOne(cascade=CascadeType.ALL,mappedBy="post",orphanRemoval=true,fetch=FetchType.LAZY)
	private PostDetails details;
	@ManyToMany
	@JoinTable(name="post_tag",joinColumns=@JoinColumn(name = "post_id"),inverseJoinColumns=@JoinColumn(name="tag_id"))
	private Set tags = new HashSet();
	public Post() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<PostComment> getComments() {
		return comments;
	}
	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}
	public PostDetails getDetails() {
		return details;
	}
	public void setDetails(PostDetails details) {
		this.details = details;
	}
	public Set getTags() {
		return tags;
	}
	public void setTags(Set tags) {
		this.tags = tags;
	}
	public void addComment(PostComment comment) {
		
	}
}
