package com.web.ldap.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.entityinheritance.Tag;
@Repository
public class TagDaoImpl implements TagDao {
	@Autowired
	EntityManager entityManager;

	@Override
	public void saveTag(Tag tag) {
		entityManager.persist(tag);
	}

}
