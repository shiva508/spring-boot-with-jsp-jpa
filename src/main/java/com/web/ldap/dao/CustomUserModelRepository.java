package com.web.ldap.dao;

import java.util.List;

import com.web.ldap.model.UserModel;

public interface CustomUserModelRepository {
public void updateUser(UserModel userModel);
public List<UserModel> getCachedUsers();
public List<UserModel >findUserModelByUserNameAndEmail(String username,String emailAddress);
public  List<UserModel> findByLanguageNamedQuery(String language);
}
