package com.web.ldap.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.ldap.dao.UserModelRepository;
import com.web.ldap.model.UserModel;
@Service
//@CacheConfig(cacheNames= {"instruments"})
public class UserModelServiceImpl implements UserModelService {
	@Autowired
	UserModelRepository userModelRepository;
	@Override
	@Transactional
	public void saveUser(UserModel userModel) {
		
		userModelRepository.save(userModel);
	}

	@Override
	@Transactional
/*	@Cacheable("usercache")*/
	public List<UserModel> getAllUsers() {

		return userModelRepository.findAll();
	}

	@Override
	@Transactional
	public UserModel findbyuserid(Integer userid) {
		
	Optional<UserModel> userModel=userModelRepository.findById(userid);
	if(!userModel.isPresent()) {
	 new UserModel();
	}
		return userModel.get();
	}

	@Override
	@Transactional
	public void updateUser(UserModel userModel) {
		userModelRepository.updateUser(userModel);
		
	}

	@Override
	@Transactional
	public void deleteUser(Integer userid) {
		userModelRepository.deleteById(userid);	
	}

	@Override
	@Transactional
	public List<UserModel> getCachedUsers() {
		
		return userModelRepository.getCachedUsers();
	}

	@Override
	@Transactional
	public UserModel findByEmailAddress(String emailAddress) {
		
		return userModelRepository.findByEmailAddress(emailAddress);
	}

	@Override
	@Transactional
	public List<UserModel> findByLanguageNamedQuery(String language) {
		return userModelRepository.findByLanguageNamedQuery(language);
	}

	@Override
	@Transactional
	public UserModel findByUserNameAndLanguage(String userName, String language) {
		return userModelRepository.findByUserNameAndLanguage(userName, language);
	}

	@Override
	@Transactional
	public List<UserModel> findByUserNameEndsWith(String userName) {
		
		return userModelRepository.findByUserNameEndsWith(userName);
	}

	@Override
	@Transactional
	public List<UserModel> findUserModelByUserNameOrEmailAddress(String username, String emailAddress) {
		return userModelRepository.findUserModelByUserNameOrEmailAddress(username, emailAddress);
	}

	@Override
	@Transactional
	public Integer explicitlyNamedPlus1inout(Integer arg) {
		return userModelRepository.explicitlyNamedPlus1inout(arg);
	}
}
