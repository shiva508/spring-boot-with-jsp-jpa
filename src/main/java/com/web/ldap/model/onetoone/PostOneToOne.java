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
//changes for @MapsId
/*@JoinColumn(name="post_id")*/
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
//changes for @MapsId
public void addPostDetailsOneToOne(PostDetailsOneToOne detailsOneToOne) {
	if(detailsOneToOne==null) {
		if(this.detailsOneToOne !=null) {
			this.detailsOneToOne.setPostOneToOne(null);
		}
	}else {
		detailsOneToOne.setPostOneToOne(this);
	}
	this.detailsOneToOne=detailsOneToOne;
}
@Override
public String toString() {
	return "PostOneToOne [id=" + id + ", title=" + title + ", detailsOneToOne=" + detailsOneToOne + "]";
}

}
