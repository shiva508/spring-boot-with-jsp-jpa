package com.web.ldap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.ldap.model.UserModel;
@Repository
public class CustomUserModelRepositoryImpl implements CustomUserModelRepository {
@Autowired
	EntityManager entityManager;
	@Override
	public void updateUser(UserModel userModel) {
		entityManager.merge(userModel);
	}
	@Override
	
	public List<UserModel> getCachedUsers() {
		Query query=entityManager.createQuery("FROM UserModel");
		return query.getResultList();
	}
	@Override
	public List<UserModel> findUserModelByUserNameAndEmail(String username, String emailAddress) {
		return null;
	}
	@Override
	public List<UserModel> findByLanguageNamedQuery(String language) {
		Query query=entityManager.createNamedQuery("UserModel.findByLanguagess");
		query.setParameter(1, language);
		return query.getResultList();
	}

}
