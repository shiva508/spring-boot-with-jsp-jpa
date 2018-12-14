package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.entityinheritance.PostComment;

@Repository
public class PostCommentDaoImpl implements PostCommentDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePostComment(PostComment postComment) {
		entityManager.persist(postComment);

	}

}
