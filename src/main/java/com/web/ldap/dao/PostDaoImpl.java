package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.entityinheritance.Post;

@Repository
public class PostDaoImpl implements PostDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePost(Post post) {
		entityManager.persist(post);

	}

}
