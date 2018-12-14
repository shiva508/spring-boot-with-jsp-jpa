package com.web.ldap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
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

	@Override
	public Tag getTag(String referencace) {
		Session session=entityManager.unwrap(Session.class);
		
		return session.bySimpleNaturalId(Tag.class).load(referencace);
	}

}
