package com.web.ldap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.Cache;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpRequest;
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
		Session session=entityManager.unwrap(Session.class);
/*		session.save(object)*/
		Query query1=session.createQuery("select U from UserModel u where u.username=:username and u.smfc=:fbdhs");
		query1.setParameter("username", language);
		Criteria cr=session.createCriteria(UserModel.class);
		Criterion c1=(Criterion) cr.add(Restrictions.gt("sal", 100));
		Criterion av=(Criterion) cr.add(Restrictions.like("nsn", "sai%"));
		/*cr.add(Restrictions.eqOrIsNull("", value))*/
		query.setParameter(1, language);
		cr.add(Restrictions.or(c1, av));
		return query.getResultList();
		
	}

}
