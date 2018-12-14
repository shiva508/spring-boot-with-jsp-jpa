package com.web.ldap.model.entityinheritance;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment extends BaseEntity{
	@ManyToOne(fetch = FetchType.LAZY)
    private Post post;
 
    private String review;

	public PostComment() {
		super();
		
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
    
    
}
