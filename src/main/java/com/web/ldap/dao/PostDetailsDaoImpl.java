package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.entityinheritance.PostDetails;

@Repository
public class PostDetailsDaoImpl implements PostDetailsDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void savePostDetail(PostDetails postDetail) {
		entityManager.persist(postDetail);

	}

}
